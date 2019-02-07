/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource policy associated with the specified function. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The resource policy associated with the specified function. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     * 
     * @param policy
     *        The resource policy associated with the specified function. The response returns the same as a string
     *        using a backslash ("\") as an escape character in the JSON.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resource policy associated with the specified function. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     * 
     * @return The resource policy associated with the specified function. The response returns the same as a string
     *         using a backslash ("\") as an escape character in the JSON.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resource policy associated with the specified function. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     * 
     * @param policy
     *        The resource policy associated with the specified function. The response returns the same as a string
     *        using a backslash ("\") as an escape character in the JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     * 
     * @param revisionId
     *        Represents the latest updated revision of the function or alias.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     * 
     * @return Represents the latest updated revision of the function or alias.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     * 
     * @param revisionId
     *        Represents the latest updated revision of the function or alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyResult == false)
            return false;
        GetPolicyResult other = (GetPolicyResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyResult clone() {
        try {
            return (GetPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
