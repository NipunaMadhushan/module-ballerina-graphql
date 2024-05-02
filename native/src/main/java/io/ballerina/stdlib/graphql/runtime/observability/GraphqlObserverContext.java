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
 * This class will hold the observability context for GraphQL.
 *
 * @since 1.12.0
 */
public class GraphqlObserverContext extends ObserverContext {

    private final String operationName;

    public GraphqlObserverContext(String operationName) {
        super();
        this.operationName = operationName;
    }

    public String getOperationName() {
        return operationName;
    }
}
