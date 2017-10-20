/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.dns.v2.internal;

import com.huawei.openstack4j.api.types.ServiceType;
import com.huawei.openstack4j.openstack.common.functions.EnforceVersionToURL;
import com.huawei.openstack4j.openstack.internal.BaseOpenStackService;

public class BaseDNSServices extends BaseOpenStackService {

	protected BaseDNSServices() {
		super(ServiceType.DNS, EnforceVersionToURL.instance("/v2"));
	}
}