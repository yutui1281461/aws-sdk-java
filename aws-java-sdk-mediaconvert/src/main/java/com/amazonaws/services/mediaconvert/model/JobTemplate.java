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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/JobTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplate implements Serializable, Cloneable, StructuredPojo {

    /** An identifier for this resource that is unique within all of AWS. */
    private String arn;
    /** An optional category you create to organize your job templates. */
    private String category;
    /** The timestamp in epoch seconds for Job template creation. */
    private java.util.Date createdAt;
    /** An optional description you create for each job template. */
    private String description;
    /** The timestamp in epoch seconds when the Job template was last updated. */
    private java.util.Date lastUpdated;
    /** A name you create for each job template. Each name must be unique within your account. */
    private String name;
    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     */
    private String queue;

    private JobTemplateSettings settings;
    /**
     * A job template can be of two types: system or custom. System or built-in job templates can't be modified or
     * deleted by the user.
     */
    private String type;

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @return An identifier for this resource that is unique within all of AWS.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * An optional category you create to organize your job templates.
     * 
     * @param category
     *        An optional category you create to organize your job templates.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * An optional category you create to organize your job templates.
     * 
     * @return An optional category you create to organize your job templates.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * An optional category you create to organize your job templates.
     * 
     * @param category
     *        An optional category you create to organize your job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * The timestamp in epoch seconds for Job template creation.
     * 
     * @param createdAt
     *        The timestamp in epoch seconds for Job template creation.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The timestamp in epoch seconds for Job template creation.
     * 
     * @return The timestamp in epoch seconds for Job template creation.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The timestamp in epoch seconds for Job template creation.
     * 
     * @param createdAt
     *        The timestamp in epoch seconds for Job template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * An optional description you create for each job template.
     * 
     * @param description
     *        An optional description you create for each job template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An optional description you create for each job template.
     * 
     * @return An optional description you create for each job template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * An optional description you create for each job template.
     * 
     * @param description
     *        An optional description you create for each job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     * 
     * @param lastUpdated
     *        The timestamp in epoch seconds when the Job template was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     * 
     * @return The timestamp in epoch seconds when the Job template was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * The timestamp in epoch seconds when the Job template was last updated.
     * 
     * @param lastUpdated
     *        The timestamp in epoch seconds when the Job template was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * A name you create for each job template. Each name must be unique within your account.
     * 
     * @param name
     *        A name you create for each job template. Each name must be unique within your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A name you create for each job template. Each name must be unique within your account.
     * 
     * @return A name you create for each job template. Each name must be unique within your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A name you create for each job template. Each name must be unique within your account.
     * 
     * @param name
     *        A name you create for each job template. Each name must be unique within your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     * 
     * @param queue
     *        Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs
     *        will go to the default queue.
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     * 
     * @return Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs
     *         will go to the default queue.
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go
     * to the default queue.
     * 
     * @param queue
     *        Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs
     *        will go to the default queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * @param settings
     */

    public void setSettings(JobTemplateSettings settings) {
        this.settings = settings;
    }

    /**
     * @return
     */

    public JobTemplateSettings getSettings() {
        return this.settings;
    }

    /**
     * @param settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withSettings(JobTemplateSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in job templates can't be modified or
     * deleted by the user.
     * 
     * @param type
     *        A job template can be of two types: system or custom. System or built-in job templates can't be modified
     *        or deleted by the user.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in job templates can't be modified or
     * deleted by the user.
     * 
     * @return A job template can be of two types: system or custom. System or built-in job templates can't be modified
     *         or deleted by the user.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in job templates can't be modified or
     * deleted by the user.
     * 
     * @param type
     *        A job template can be of two types: system or custom. System or built-in job templates can't be modified
     *        or deleted by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public JobTemplate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * A job template can be of two types: system or custom. System or built-in job templates can't be modified or
     * deleted by the user.
     * 
     * @param type
     *        A job template can be of two types: system or custom. System or built-in job templates can't be modified
     *        or deleted by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public JobTemplate withType(Type type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplate == false)
            return false;
        JobTemplate other = (JobTemplate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public JobTemplate clone() {
        try {
            return (JobTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.JobTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
