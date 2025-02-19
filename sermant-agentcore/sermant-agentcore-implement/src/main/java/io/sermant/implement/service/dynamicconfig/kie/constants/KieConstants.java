/*
 * Copyright (C) 2021-2021 Huawei Technologies Co., Ltd. All rights reserved.
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

package io.sermant.implement.service.dynamicconfig.kie.constants;

/**
 * Kie constant
 *
 * @author zhouss
 * @since 2021-11-23
 */
public class KieConstants {
    /**
     * Default groupKey
     */
    public static final String DEFAULT_GROUP_KEY = "_DEFAULT_GROUP_KEY";

    /**
     * Unsupported delimiter in Group
     */
    public static final String SEPARATOR = "/";

    /**
     * Supported connectors in Group
     */
    public static final String CONNECTOR = ".";

    /**
     * The default key for the label
     */
    public static final String DEFAULT_LABEL_PRE = "GROUP=";

    /**
     * The default key for the label
     */
    public static final String DEFAULT_GROUP = "GROUP";

    private KieConstants() {
    }
}
