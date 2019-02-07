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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIPSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The format of the file that contains the IPSet. */
    private String format;
    /**
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */
    private String location;
    /**
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     */
    private String name;
    /** The status of ipSet file uploaded. */
    private String status;

    /**
     * The format of the file that contains the IPSet.
     * 
     * @param format
     *        The format of the file that contains the IPSet.
     * @see IpSetFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * The format of the file that contains the IPSet.
     * 
     * @return The format of the file that contains the IPSet.
     * @see IpSetFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * The format of the file that contains the IPSet.
     * 
     * @param format
     *        The format of the file that contains the IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpSetFormat
     */

    public GetIPSetResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * The format of the file that contains the IPSet.
     * 
     * @param format
     *        The format of the file that contains the IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpSetFormat
     */

    public GetIPSetResult withFormat(IpSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * 
     * @param location
     *        The URI of the file that contains the IPSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * 
     * @return The URI of the file that contains the IPSet. For example
     *         (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * 
     * @param location
     *        The URI of the file that contains the IPSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIPSetResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * 
     * @param name
     *        The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     *        activity that involves IP addresses included in this IPSet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * 
     * @return The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered
     *         by activity that involves IP addresses included in this IPSet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * 
     * @param name
     *        The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     *        activity that involves IP addresses included in this IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIPSetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The status of ipSet file uploaded.
     * 
     * @param status
     *        The status of ipSet file uploaded.
     * @see IpSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The status of ipSet file uploaded.
     * 
     * @return The status of ipSet file uploaded.
     * @see IpSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * The status of ipSet file uploaded.
     * 
     * @param status
     *        The status of ipSet file uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpSetStatus
     */

    public GetIPSetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * The status of ipSet file uploaded.
     * 
     * @param status
     *        The status of ipSet file uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpSetStatus
     */

    public GetIPSetResult withStatus(IpSetStatus status) {
        this.status = status.toString();
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIPSetResult == false)
            return false;
        GetIPSetResult other = (GetIPSetResult) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetIPSetResult clone() {
        try {
            return (GetIPSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
