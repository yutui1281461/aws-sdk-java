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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an Amazon EKS cluster VPC configuration request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/VpcConfigRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in
     * these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your worker nodes and the Kubernetes control plane. If you do not specify a
     * security group, the default security group for your VPC is used.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in
     * these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * 
     * @return Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network
     *         interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control
     *         plane.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in
     * these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * 
     * @param subnetIds
     *        Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network
     *        interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control
     *        plane.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in
     * these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network
     *        interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control
     *        plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in
     * these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * </p>
     * 
     * @param subnetIds
     *        Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network
     *        interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control
     *        plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your worker nodes and the Kubernetes control plane. If you do not specify a
     * security group, the default security group for your VPC is used.
     * </p>
     * 
     * @return Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *         creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you
     *         do not specify a security group, the default security group for your VPC is used.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your worker nodes and the Kubernetes control plane. If you do not specify a
     * security group, the default security group for your VPC is used.
     * </p>
     * 
     * @param securityGroupIds
     *        Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *        creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you
     *        do not specify a security group, the default security group for your VPC is used.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your worker nodes and the Kubernetes control plane. If you do not specify a
     * security group, the default security group for your VPC is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *        creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you
     *        do not specify a security group, the default security group for your VPC is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to
     * use to allow communication between your worker nodes and the Kubernetes control plane. If you do not specify a
     * security group, the default security group for your VPC is used.
     * </p>
     * 
     * @param securityGroupIds
     *        Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS
     *        creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you
     *        do not specify a security group, the default security group for your VPC is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfigRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfigRequest == false)
            return false;
        VpcConfigRequest other = (VpcConfigRequest) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfigRequest clone() {
        try {
            return (VpcConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.VpcConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
