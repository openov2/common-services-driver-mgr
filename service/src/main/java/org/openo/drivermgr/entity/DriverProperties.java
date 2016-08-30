/*
 * Copyright (c) 2016, Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.drivermgr.entity;

/**
 * POJO For Driver Manager Service.
 * <br/>
 * 
 * @author Shubham Verma
 * @version SDNO 0.5
 */
public class DriverProperties {

    private DriverInfo driverInfo;

    /**
     * @return Returns the driverInfo.
     */
    public DriverInfo getDriverInfo() {
        return driverInfo;
    }

    /**
     * @param driverInfo The driverInfo to set.
     */
    public void setDriverInfo(DriverInfo driverInfo) {
        this.driverInfo = driverInfo;
    }

}