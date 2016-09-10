/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
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
 * @author
 * @version  
 */
public class DriverServicesMapper {

    private String instanceId;

    private String serviceUrl;

    private String type;

    private String version;

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
     * @return Returns the serviceUrl.
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * @param serviceUrl The serviceUrl to set.
     */
    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    /**
     * @return Returns the type.
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return Returns the version.
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version The version to set.
     */
    public void setVersion(String version) {
        this.version = version;
    }

}
