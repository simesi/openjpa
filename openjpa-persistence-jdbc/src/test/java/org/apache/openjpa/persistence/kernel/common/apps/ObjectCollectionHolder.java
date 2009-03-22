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
package org.apache.openjpa.persistence.kernel.common.apps;

import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objchol")
public class ObjectCollectionHolder {

    @Id
    private int id;
    private HashSet hashSet = new HashSet();

    public void setHashSet(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    public HashSet getHashSet() {
        return this.hashSet;
    }

    @SuppressWarnings("unchecked")
    public void addToHashSet(Object ob) {
        getHashSet().add(ob);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}