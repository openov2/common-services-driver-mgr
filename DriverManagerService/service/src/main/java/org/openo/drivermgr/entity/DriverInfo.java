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

import java.util.List;

/**
 * POJO For Driver Manager Service.
 * <br/>
 * 
 * @author Shubham Verma
 * @version SDNO 0.5
 */
public class DriverInfo {

    private String driverName;

    private String instanceId;

    private String ip;

    private String port;

    private String protocol;

    private List<Services> services;

    /**
     * @return Returns the driverName.
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * @param driverName The driverName to set.
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * @return Returns the instanceId.
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId The instanceId to set.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * @return Returns the ip.
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip The ip to set.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return Returns the port.
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port The port to set.
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return Returns the protocol.
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * @param protocol The protocol to set.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * @return Returns the services.
     */
    public List<Services> getServices() {
        return services;
    }

    /**
     * @param services The services to set.
     */
    public void setServices(List<Services> services) {
        this.services = services;
    }

}
