/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListVirtualNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualNodesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When this
     * parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListVirtualNodes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListVirtualNodes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The name of the service mesh in which to list virtual nodes.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When this
     * parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListVirtualNodes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListVirtualNodes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param limit
     *        The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When
     *        this parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single
     *        page along with a <code>nextToken</code> response element. The remaining results of the initial request
     *        can be seen by sending another <code>ListVirtualNodes</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>ListVirtualNodes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When this
     * parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListVirtualNodes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListVirtualNodes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When
     *         this parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single
     *         page along with a <code>nextToken</code> response element. The remaining results of the initial request
     *         can be seen by sending another <code>ListVirtualNodes</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *         <code>ListVirtualNodes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When this
     * parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListVirtualNodes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListVirtualNodes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param limit
     *        The maximum number of mesh results returned by <code>ListVirtualNodes</code> in paginated output. When
     *        this parameter is used, <code>ListVirtualNodes</code> only returns <code>limit</code> results in a single
     *        page along with a <code>nextToken</code> response element. The remaining results of the initial request
     *        can be seen by sending another <code>ListVirtualNodes</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>ListVirtualNodes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualNodesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh in which to list virtual nodes.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh in which to list virtual nodes.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh in which to list virtual nodes.
     * </p>
     * 
     * @return The name of the service mesh in which to list virtual nodes.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh in which to list virtual nodes.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh in which to list virtual nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualNodesRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request
     *        where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request
     *         where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListVirtualNodes</code> request
     *        where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualNodesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualNodesRequest == false)
            return false;
        ListVirtualNodesRequest other = (ListVirtualNodesRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualNodesRequest clone() {
        return (ListVirtualNodesRequest) super.clone();
    }

}
