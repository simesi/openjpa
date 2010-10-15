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
package org.apache.openjpa.persistence.embed;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Embeddable
public class EmployeePK2 implements Serializable {
    String name;
    Date bDay;
    
    public EmployeePK2() {}
    public EmployeePK2(String name, Date bDay) {
        this.name = name;
        this.bDay = bDay;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePK2)) return false;
        EmployeePK2 pk = (EmployeePK2) o;
        if (pk.name.equals(name) &&
            pk.bDay.equals(bDay)) return true;    
        return false;
    }
    
    public int hashCode() {
        int code = 0;
        code = code * 31 + name.hashCode();
        code = code * 31 + bDay.hashCode();
        return code;
    }
}