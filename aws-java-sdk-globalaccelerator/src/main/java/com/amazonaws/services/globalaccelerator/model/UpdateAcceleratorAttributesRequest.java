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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAcceleratorAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAcceleratorAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator that you want to update.
     * </p>
     */
    private String acceleratorArn;
    /**
     * <p>
     * Update whether flow logs are enabled.
     * </p>
     */
    private Boolean flowLogsEnabled;
    /**
     * <p>
     * Update the name of the Amazon S3 bucket for the flow logs.
     * </p>
     */
    private String flowLogsS3Bucket;
    /**
     * <p>
     * Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     * </p>
     */
    private String flowLogsS3Prefix;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator that you want to update.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator that you want to update.
     */

    public void setAcceleratorArn(String acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the accelerator that you want to update.
     */

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator that you want to update.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAcceleratorAttributesRequest withAcceleratorArn(String acceleratorArn) {
        setAcceleratorArn(acceleratorArn);
        return this;
    }

    /**
     * <p>
     * Update whether flow logs are enabled.
     * </p>
     * 
     * @param flowLogsEnabled
     *        Update whether flow logs are enabled.
     */

    public void setFlowLogsEnabled(Boolean flowLogsEnabled) {
        this.flowLogsEnabled = flowLogsEnabled;
    }

    /**
     * <p>
     * Update whether flow logs are enabled.
     * </p>
     * 
     * @return Update whether flow logs are enabled.
     */

    public Boolean getFlowLogsEnabled() {
        return this.flowLogsEnabled;
    }

    /**
     * <p>
     * Update whether flow logs are enabled.
     * </p>
     * 
     * @param flowLogsEnabled
     *        Update whether flow logs are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAcceleratorAttributesRequest withFlowLogsEnabled(Boolean flowLogsEnabled) {
        setFlowLogsEnabled(flowLogsEnabled);
        return this;
    }

    /**
     * <p>
     * Update whether flow logs are enabled.
     * </p>
     * 
     * @return Update whether flow logs are enabled.
     */

    public Boolean isFlowLogsEnabled() {
        return this.flowLogsEnabled;
    }

    /**
     * <p>
     * Update the name of the Amazon S3 bucket for the flow logs.
     * </p>
     * 
     * @param flowLogsS3Bucket
     *        Update the name of the Amazon S3 bucket for the flow logs.
     */

    public void setFlowLogsS3Bucket(String flowLogsS3Bucket) {
        this.flowLogsS3Bucket = flowLogsS3Bucket;
    }

    /**
     * <p>
     * Update the name of the Amazon S3 bucket for the flow logs.
     * </p>
     * 
     * @return Update the name of the Amazon S3 bucket for the flow logs.
     */

    public String getFlowLogsS3Bucket() {
        return this.flowLogsS3Bucket;
    }

    /**
     * <p>
     * Update the name of the Amazon S3 bucket for the flow logs.
     * </p>
     * 
     * @param flowLogsS3Bucket
     *        Update the name of the Amazon S3 bucket for the flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAcceleratorAttributesRequest withFlowLogsS3Bucket(String flowLogsS3Bucket) {
        setFlowLogsS3Bucket(flowLogsS3Bucket);
        return this;
    }

    /**
     * <p>
     * Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     * </p>
     * 
     * @param flowLogsS3Prefix
     *        Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     */

    public void setFlowLogsS3Prefix(String flowLogsS3Prefix) {
        this.flowLogsS3Prefix = flowLogsS3Prefix;
    }

    /**
     * <p>
     * Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     * </p>
     * 
     * @return Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     */

    public String getFlowLogsS3Prefix() {
        return this.flowLogsS3Prefix;
    }

    /**
     * <p>
     * Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     * </p>
     * 
     * @param flowLogsS3Prefix
     *        Update the prefix for the location in the Amazon S3 bucket for the flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAcceleratorAttributesRequest withFlowLogsS3Prefix(String flowLogsS3Prefix) {
        setFlowLogsS3Prefix(flowLogsS3Prefix);
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
        if (getAcceleratorArn() != null)
            sb.append("AcceleratorArn: ").append(getAcceleratorArn()).append(",");
        if (getFlowLogsEnabled() != null)
            sb.append("FlowLogsEnabled: ").append(getFlowLogsEnabled()).append(",");
        if (getFlowLogsS3Bucket() != null)
            sb.append("FlowLogsS3Bucket: ").append(getFlowLogsS3Bucket()).append(",");
        if (getFlowLogsS3Prefix() != null)
            sb.append("FlowLogsS3Prefix: ").append(getFlowLogsS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAcceleratorAttributesRequest == false)
            return false;
        UpdateAcceleratorAttributesRequest other = (UpdateAcceleratorAttributesRequest) obj;
        if (other.getAcceleratorArn() == null ^ this.getAcceleratorArn() == null)
            return false;
        if (other.getAcceleratorArn() != null && other.getAcceleratorArn().equals(this.getAcceleratorArn()) == false)
            return false;
        if (other.getFlowLogsEnabled() == null ^ this.getFlowLogsEnabled() == null)
            return false;
        if (other.getFlowLogsEnabled() != null && other.getFlowLogsEnabled().equals(this.getFlowLogsEnabled()) == false)
            return false;
        if (other.getFlowLogsS3Bucket() == null ^ this.getFlowLogsS3Bucket() == null)
            return false;
        if (other.getFlowLogsS3Bucket() != null && other.getFlowLogsS3Bucket().equals(this.getFlowLogsS3Bucket()) == false)
            return false;
        if (other.getFlowLogsS3Prefix() == null ^ this.getFlowLogsS3Prefix() == null)
            return false;
        if (other.getFlowLogsS3Prefix() != null && other.getFlowLogsS3Prefix().equals(this.getFlowLogsS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorArn() == null) ? 0 : getAcceleratorArn().hashCode());
        hashCode = prime * hashCode + ((getFlowLogsEnabled() == null) ? 0 : getFlowLogsEnabled().hashCode());
        hashCode = prime * hashCode + ((getFlowLogsS3Bucket() == null) ? 0 : getFlowLogsS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getFlowLogsS3Prefix() == null) ? 0 : getFlowLogsS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAcceleratorAttributesRequest clone() {
        return (UpdateAcceleratorAttributesRequest) super.clone();
    }

}
