/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.stdlib.graphql.runtime.observability;

import io.ballerina.runtime.observability.ObserverContext;

/**
 * GraphQL specific observer context.
 *
 * @since 1.12.0
 */
public class GraphqlObserverContext extends ObserverContext {

    public static final String IS_ROOT_SERVICE = "isRootService";
    public static final String KEY_INTERCEPTOR = "__interceptor__";

    // Runtime related constants
    public static final String OBJECT_NAME = "graphql";
    public static final String CONNECTOR_NAME = "graphql";
    public static final String QUERY_OPERATION = "query";
    public static final String MUTATION_OPERATION = "mutation";
    public static final String SUBSCRIPTION_OPERATION = "subscription";

    // Runtime related tags
    public static final String TAG_LISTENER_NAME = "listener.name";
    public static final String TAG_KEY_OPERATION_TYPE = "graphql.operation.type";

    public GraphqlObserverContext() {
        setObjectName(OBJECT_NAME);
        addTag(TAG_LISTENER_NAME, CONNECTOR_NAME);
    }

    public GraphqlObserverContext(String operationType) {
        setObjectName(OBJECT_NAME);
        addTag(TAG_LISTENER_NAME, CONNECTOR_NAME);
        addTag(TAG_KEY_OPERATION_TYPE, operationType);
    }
}
