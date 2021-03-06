/*
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

package com.zto.zms.portal.manage;

import com.zto.zms.dal.domain.service.ZmsClusterServiceDTO;
import com.zto.zms.dal.model.ServiceInstance;
import com.zto.zms.dal.model.ServiceProperty;

import java.util.List;

/**
 * 集群操作类接口
 *
 * @author sunkai
 * @date 2020/5/18
 **/
public interface ClusterManager {

    void getAddressAndVersion(ZmsClusterServiceDTO item, List<ServiceInstance> instances, List<Integer> processIds, List<ServiceProperty> servicePropertyList);

}

