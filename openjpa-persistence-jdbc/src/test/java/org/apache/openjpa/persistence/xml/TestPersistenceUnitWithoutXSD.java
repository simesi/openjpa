/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openjpa.persistence.xml;

import javax.persistence.EntityManagerFactory;

import org.apache.openjpa.persistence.test.PersistenceTestCase;
import org.apache.openjpa.persistence.OpenJPAPersistence;
import org.apache.openjpa.enhance.PCEnhancer;

public class TestPersistenceUnitWithoutXSD extends PersistenceTestCase {

    public void testPersistenceUnitWithoutXSD() {
        EntityManagerFactory emf = OpenJPAPersistence
            .createEntityManagerFactory("incorrect-ordering-and-no-xsd",
                "org/apache/openjpa/persistence/xml/persistence-without-xsd.xml");
        emf.createEntityManager().close();
        emf.close();
    }

    public void testEnhancer() {
        PCEnhancer.main(new String[] {
            "-p",
            "org/apache/openjpa/persistence/xml/persistence-without-xsd.xml",
            SimpleXmlEntity.class.getName()
        });
    }
}
