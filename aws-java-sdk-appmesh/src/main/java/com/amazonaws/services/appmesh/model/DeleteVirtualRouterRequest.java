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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteVirtualRouter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVirtualRouterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the service mesh in which to delete the virtual router.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The name of the virtual router to delete.
     * </p>
     */
    private String virtualRouterName;

    /**
     * <p>
     * The name of the service mesh in which to delete the virtual router.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh in which to delete the virtual router.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh in which to delete the virtual router.
     * </p>
     * 
     * @return The name of the service mesh in which to delete the virtual router.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh in which to delete the virtual router.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh in which to delete the virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVirtualRouterRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The name of the virtual router to delete.
     * </p>
     * 
     * @param virtualRouterName
     *        The name of the virtual router to delete.
     */

    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router to delete.
     * </p>
     * 
     * @return The name of the virtual router to delete.
     */

    public String getVirtualRouterName() {
        return this.virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router to delete.
     * </p>
     * 
     * @param virtualRouterName
     *        The name of the virtual router to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVirtualRouterRequest withVirtualRouterName(String virtualRouterName) {
        setVirtualRouterName(virtualRouterName);
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
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getVirtualRouterName() != null)
            sb.append("VirtualRouterName: ").append(getVirtualRouterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVirtualRouterRequest == false)
            return false;
        DeleteVirtualRouterRequest other = (DeleteVirtualRouterRequest) obj;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getVirtualRouterName() == null) ? 0 : getVirtualRouterName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVirtualRouterRequest clone() {
        return (DeleteVirtualRouterRequest) super.clone();
    }

}
