/*
 * Copyright (C) 2023-2023 Huawei Technologies Co., Ltd. All rights reserved.
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
 *
 */

package io.sermant.spring.feign.api;

import io.sermant.spring.common.FeignConstants;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * removal测试
 *
 * @author zhp
 * @since 2023-03-16
 */
@FeignClient(qualifier = FeignConstants.REMOVAL_SERVICE_BEAN_NAME, name = "removal-provider")
public interface RemovalService {
    /**
     * 限流测试
     *
     * @return ok
     */
    @RequestMapping("testRemoval")
    String testRemoval();
}
