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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a job definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the job being defined.
     * </p>
     */
    private String description;
    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     */
    private ExecutionProperty executionProperty;
    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     */
    private JobCommand command;
    /**
     * <p>
     * The default arguments for this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> defaultArguments;
    /**
     * <p>
     * The connections used for this job.
     * </p>
     */
    private ConnectionsList connections;
    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     */
    private Integer allocatedCapacity;
    /**
     * <p>
     * The job timeout in minutes.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     */
    private NotificationProperty notificationProperty;

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     * 
     * @param name
     *        The name you assign to this job definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     * 
     * @return The name you assign to this job definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     * 
     * @param name
     *        The name you assign to this job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * 
     * @param description
     *        Description of the job being defined.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * 
     * @return Description of the job being defined.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * 
     * @param description
     *        Description of the job being defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param logUri
     *        This field is reserved for future use.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @return This field is reserved for future use.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param logUri
     *        This field is reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     * 
     * @param role
     *        The name or ARN of the IAM role associated with this job.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     * 
     * @return The name or ARN of the IAM role associated with this job.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     * 
     * @param role
     *        The name or ARN of the IAM role associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     * 
     * @param createdOn
     *        The time and date that this job definition was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     * 
     * @return The time and date that this job definition was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     * 
     * @param createdOn
     *        The time and date that this job definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The last point in time when this job definition was modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     * 
     * @return The last point in time when this job definition was modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The last point in time when this job definition was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     */

    public void setExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @return An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     */

    public ExecutionProperty getExecutionProperty() {
        return this.executionProperty;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withExecutionProperty(ExecutionProperty executionProperty) {
        setExecutionProperty(executionProperty);
        return this;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @param command
     *        The JobCommand that executes this job.
     */

    public void setCommand(JobCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @return The JobCommand that executes this job.
     */

    public JobCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @param command
     *        The JobCommand that executes this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCommand(JobCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The default arguments for this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @return The default arguments for this job, specified as name-value pairs.</p>
     *         <p>
     *         You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *         Glue itself consumes.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own Job arguments, see the <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS
     *         Glue APIs in Python</a> topic in the developer guide.
     *         </p>
     *         <p>
     *         For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *         Parameters Used by AWS Glue</a> topic in the developer guide.
     */

    public java.util.Map<String, String> getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * <p>
     * The default arguments for this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @param defaultArguments
     *        The default arguments for this job, specified as name-value pairs.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     */

    public void setDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    /**
     * <p>
     * The default arguments for this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @param defaultArguments
     *        The default arguments for this job, specified as name-value pairs.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        setDefaultArguments(defaultArguments);
        return this;
    }

    public Job addDefaultArgumentsEntry(String key, String value) {
        if (null == this.defaultArguments) {
            this.defaultArguments = new java.util.HashMap<String, String>();
        }
        if (this.defaultArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @param connections
     *        The connections used for this job.
     */

    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @return The connections used for this job.
     */

    public ConnectionsList getConnections() {
        return this.connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @param connections
     *        The connections used for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withConnections(ConnectionsList connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job after a JobRun fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     * 
     * @return The maximum number of times to retry this job after a JobRun fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job after a JobRun fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can
     *        be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs
     *        of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     */

    public void setAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @return The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can
     *         be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs
     *         of compute capacity and 16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     */

    public Integer getAllocatedCapacity() {
        return this.allocatedCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        The number of AWS Glue data processing units (DPUs) allocated to runs of this job. From 2 to 100 DPUs can
     *        be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs
     *        of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withAllocatedCapacity(Integer allocatedCapacity) {
        setAllocatedCapacity(allocatedCapacity);
        return this;
    }

    /**
     * <p>
     * The job timeout in minutes.
     * </p>
     * 
     * @param timeout
     *        The job timeout in minutes.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The job timeout in minutes.
     * </p>
     * 
     * @return The job timeout in minutes.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The job timeout in minutes.
     * </p>
     * 
     * @param timeout
     *        The job timeout in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job notification.
     */

    public void setNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * 
     * @return Specifies configuration properties of a job notification.
     */

    public NotificationProperty getNotificationProperty() {
        return this.notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withNotificationProperty(NotificationProperty notificationProperty) {
        setNotificationProperty(notificationProperty);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getExecutionProperty() != null)
            sb.append("ExecutionProperty: ").append(getExecutionProperty()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: ").append(getDefaultArguments()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: ").append(getAllocatedCapacity()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: ").append(getNotificationProperty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getExecutionProperty() == null ^ this.getExecutionProperty() == null)
            return false;
        if (other.getExecutionProperty() != null && other.getExecutionProperty().equals(this.getExecutionProperty()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDefaultArguments() == null ^ this.getDefaultArguments() == null)
            return false;
        if (other.getDefaultArguments() != null && other.getDefaultArguments().equals(this.getDefaultArguments()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getNotificationProperty() == null ^ this.getNotificationProperty() == null)
            return false;
        if (other.getNotificationProperty() != null && other.getNotificationProperty().equals(this.getNotificationProperty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getExecutionProperty() == null) ? 0 : getExecutionProperty().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
