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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DeleteDirectConnectGatewayAssociation operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDirectConnectGatewayAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the direct connect gateway.</p>
     *        <p>
     *        Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the direct connect gateway.</p>
     *         <p>
     *         Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the direct connect gateway.
     * </p>
     * <p>
     * Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the direct connect gateway.</p>
     *        <p>
     *        Example: "abcd1234-dcba-5678-be23-cdef9876ab45"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDirectConnectGatewayAssociationRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.</p>
     *        <p>
     *        Example: "vgw-abc123ef"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the virtual private gateway.</p>
     *         <p>
     *         Example: "vgw-abc123ef"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Example: "vgw-abc123ef"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.</p>
     *        <p>
     *        Example: "vgw-abc123ef"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDirectConnectGatewayAssociationRequest withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectConnectGatewayAssociationRequest == false)
            return false;
        DeleteDirectConnectGatewayAssociationRequest other = (DeleteDirectConnectGatewayAssociationRequest) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDirectConnectGatewayAssociationRequest clone() {
        return (DeleteDirectConnectGatewayAssociationRequest) super.clone();
    }

}
