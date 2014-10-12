/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.mgt.credentialhistory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.common.AbstractUserOperationEventListener;

public class PasswordChangeListener extends AbstractUserOperationEventListener {

    /**
     * User Operation Event Listener execution order ID
     */
    public static final int EXECUTION_ORDER_ID = 5;

    /**
     * Class logger
     */
    private static final Log log = LogFactory.getLog(PasswordChangeListener.class);

    @Override
    public boolean doPreUpdateCredential(String userName, Object newCredential,
                                         Object oldCredential, UserStoreManager userStoreManager)
            throws UserStoreException {
        log.info("Update credential by Admin");
        // TODO: Implementation goes here

        return true;
    }

    @Override
    public boolean doPreUpdateCredentialByAdmin(String userName, Object newCredential,
                                                UserStoreManager userStoreManager)
            throws UserStoreException {
        log.info("Update credential by Admin");
        // TODO: Implementation goes here

        return true;
    }

    @Override
    public int getExecutionOrderId() {
        return EXECUTION_ORDER_ID;
    }
}
