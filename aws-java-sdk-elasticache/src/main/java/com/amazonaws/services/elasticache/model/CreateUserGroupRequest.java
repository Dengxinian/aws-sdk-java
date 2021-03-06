/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUserGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user group.
     * </p>
     */
    private String userGroupId;
    /**
     * <p>
     * Must be Redis.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIds;

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @param userGroupId
     *        The ID of the user group.
     */

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @return The ID of the user group.
     */

    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @param userGroupId
     *        The ID of the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserGroupRequest withUserGroupId(String userGroupId) {
        setUserGroupId(userGroupId);
        return this;
    }

    /**
     * <p>
     * Must be Redis.
     * </p>
     * 
     * @param engine
     *        Must be Redis.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Must be Redis.
     * </p>
     * 
     * @return Must be Redis.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Must be Redis.
     * </p>
     * 
     * @param engine
     *        Must be Redis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserGroupRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * 
     * @return The list of user IDs that belong to the user group.
     */

    public java.util.List<String> getUserIds() {
        if (userIds == null) {
            userIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userIds;
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * 
     * @param userIds
     *        The list of user IDs that belong to the user group.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new com.amazonaws.internal.SdkInternalList<String>(userIds);
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        The list of user IDs that belong to the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserGroupRequest withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new com.amazonaws.internal.SdkInternalList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * 
     * @param userIds
     *        The list of user IDs that belong to the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserGroupRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserGroupId() != null)
            sb.append("UserGroupId: ").append(getUserGroupId()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserGroupRequest == false)
            return false;
        CreateUserGroupRequest other = (CreateUserGroupRequest) obj;
        if (other.getUserGroupId() == null ^ this.getUserGroupId() == null)
            return false;
        if (other.getUserGroupId() != null && other.getUserGroupId().equals(this.getUserGroupId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserGroupRequest clone() {
        return (CreateUserGroupRequest) super.clone();
    }

}
