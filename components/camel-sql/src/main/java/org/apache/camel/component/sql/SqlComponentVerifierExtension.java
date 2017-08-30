/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.component.extension.verifier.DefaultComponentVerifierExtension;
import org.apache.camel.component.extension.verifier.ResultBuilder;
import org.apache.camel.component.extension.verifier.ResultErrorBuilder;
import org.apache.camel.component.extension.verifier.ResultErrorHelper;

public class SqlComponentVerifierExtension extends DefaultComponentVerifierExtension {

    public SqlComponentVerifierExtension() {
        super("sql");
    }

    public SqlComponentVerifierExtension(String scheme) {
        super(scheme);
    }

    // *********************************
    // Parameters validation
    // *********************************

    @Override
    protected Result verifyParameters(Map<String, Object> parameters) {
        ResultBuilder builder = ResultBuilder.withStatusAndScope(Result.Status.OK, Scope.PARAMETERS)
            .error(ResultErrorHelper.requiresOption("driver", parameters))
            .error(ResultErrorHelper.requiresOption("url", parameters))
            .error(ResultErrorHelper.requiresOption("user", parameters))
            .error(ResultErrorHelper.requiresOption("password", parameters));

        // Validate using the catalog
        // super.verifyParametersAgainstCatalog(builder, parameters);

        return builder.build();
    }

    // *********************************
    // Connectivity validation
    // *********************************

    @Override
    protected Result verifyConnectivity(Map<String, Object> parameters) {
        return ResultBuilder.withStatusAndScope(Result.Status.OK, Scope.CONNECTIVITY)
            .error(parameters, this::verifyCredentials)
            .build();
    }

    private void verifyCredentials(ResultBuilder builder, Map<String, Object> parameters) {
        try {
            Class.forName(parameters.get("driver").toString());
            String url = parameters.get("url").toString();
            String user = parameters.get("user").toString();
            String password = parameters.get("password").toString();
            
            Connection connection = DriverManager.getConnection(url, user, password);
            
            if (connection == null) {
                throw new SQLException("No Connection");
            }
        } catch (Exception e) {
            ResultErrorBuilder errorBuilder = ResultErrorBuilder.withCodeAndDescription(
                    VerificationError.StandardCode.AUTHENTICATION, e.getClass() + ": " + e.getMessage());
            builder.error(errorBuilder.build());
        }
    }
}
