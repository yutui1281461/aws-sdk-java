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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RegisterTaskDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTaskDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required. If using
     * the EC2 launch type, any network mode can be used. If the network mode is set to <code>none</code>, you can't
     * specify port mappings in your container definitions, and the task's containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for
     * containers because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you must
     * specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task definition. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     * Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     */
    private String networkMode;
    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;
    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint> placementConstraints;
    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> requiresCompatibilities;
    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition but will be converted to an integer indicating the CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU units (
     * <code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     */
    private String cpu;
    /**
     * <p>
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition but will be converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     */
    private String memory;

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *        of the same task definition. The <code>family</code> is used as a name for your task definition. Up to 255
     *        letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *         of the same task definition. The <code>family</code> is used as a name for your task definition. Up to
     *         255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *        of the same task definition. The <code>family</code> is used as a name for your task definition. Up to 255
     *        letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *        All containers in this task are granted the permissions that are specified in this role. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *        Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can
     *         assume. All containers in this task are granted the permissions that are specified in this role. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *         Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *        All containers in this task are granted the permissions that are specified in this role. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *        Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the
     *        Docker daemon can assume.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the
     *         Docker daemon can assume.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the
     *        Docker daemon can assume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required. If using
     * the EC2 launch type, any network mode can be used. If the network mode is set to <code>none</code>, you can't
     * specify port mappings in your container definitions, and the task's containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for
     * containers because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you must
     * specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task definition. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     * Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     *        If using the EC2 launch type, any network mode can be used. If the network mode is set to
     *        <code>none</code>, you can't specify port mappings in your container definitions, and the task's
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you
     *        must specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required. If using
     * the EC2 launch type, any network mode can be used. If the network mode is set to <code>none</code>, you can't
     * specify port mappings in your container definitions, and the task's containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for
     * containers because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you must
     * specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task definition. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     * Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @return The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *         <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *         <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     *         If using the EC2 launch type, any network mode can be used. If the network mode is set to
     *         <code>none</code>, you can't specify port mappings in your container definitions, and the task's
     *         containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *         offer the highest networking performance for containers because they use the EC2 network stack instead of
     *         the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *         <p>
     *         With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *         directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *         network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of
     *         dynamic host port mappings.
     *         </p>
     *         <p>
     *         If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you
     *         must specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task
     *         definition. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *         Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a
     *         single container instance when port mappings are used.
     *         </p>
     *         <p>
     *         Docker for Windows uses different network modes than Docker for Linux. When you register a task
     *         definition with Windows containers, you must not specify a network mode.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#network-settings">Network settings</a> in the
     *         <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required. If using
     * the EC2 launch type, any network mode can be used. If the network mode is set to <code>none</code>, you can't
     * specify port mappings in your container definitions, and the task's containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for
     * containers because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you must
     * specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task definition. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     * Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     *        If using the EC2 launch type, any network mode can be used. If the network mode is set to
     *        <code>none</code>, you can't specify port mappings in your container definitions, and the task's
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you
     *        must specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public RegisterTaskDefinitionRequest withNetworkMode(String networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required. If using
     * the EC2 launch type, any network mode can be used. If the network mode is set to <code>none</code>, you can't
     * specify port mappings in your container definitions, and the task's containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for
     * containers because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you must
     * specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task definition. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     * Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     *        If using the EC2 launch type, any network mode can be used. If the network mode is set to
     *        <code>none</code>, you can't specify port mappings in your container definitions, and the task's
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you
     *        must specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(NetworkMode networkMode) {
        withNetworkMode(networkMode);
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required. If using
     * the EC2 launch type, any network mode can be used. If the network mode is set to <code>none</code>, you can't
     * specify port mappings in your container definitions, and the task's containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the highest networking performance for
     * containers because they use the EC2 network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you must
     * specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task definition. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     * Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     *        If using the EC2 launch type, any network mode can be used. If the network mode is set to
     *        <code>none</code>, you can't specify port mappings in your container definitions, and the task's
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an Elastic Network Interface, and you
     *        must specify a <a>NetworkConfiguration</a> when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        If the network mode is <code>host</code>, you can't run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public RegisterTaskDefinitionRequest withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @return A list of container definitions in JSON format that describe the different containers that make up your
     *         task.
     */

    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
            containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>();
        }
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     */

    public void setContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions);
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions.length));
        }
        for (ContainerDefinition ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @return A list of volume definitions in JSON format that containers in your task may use.
     */

    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<Volume>(volumes);
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @return An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *         per task (this limit includes constraints in the task definition and those specified at run time).
     */

    public java.util.List<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *        per task (this limit includes constraints in the task definition and those specified at run time).
     */

    public void setPlacementConstraints(java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *        per task (this limit includes constraints in the task definition and those specified at run time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withPlacementConstraints(TaskDefinitionPlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>(placementConstraints.length));
        }
        for (TaskDefinitionPlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *        per task (this limit includes constraints in the task definition and those specified at run time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withPlacementConstraints(java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @return The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @see Compatibility
     */

    public java.util.List<String> getRequiresCompatibilities() {
        if (requiresCompatibilities == null) {
            requiresCompatibilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return requiresCompatibilities;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @see Compatibility
     */

    public void setRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        if (requiresCompatibilities == null) {
            this.requiresCompatibilities = null;
            return;
        }

        this.requiresCompatibilities = new com.amazonaws.internal.SdkInternalList<String>(requiresCompatibilities);
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiresCompatibilities(java.util.Collection)} or
     * {@link #withRequiresCompatibilities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public RegisterTaskDefinitionRequest withRequiresCompatibilities(String... requiresCompatibilities) {
        if (this.requiresCompatibilities == null) {
            setRequiresCompatibilities(new com.amazonaws.internal.SdkInternalList<String>(requiresCompatibilities.length));
        }
        for (String ele : requiresCompatibilities) {
            this.requiresCompatibilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public RegisterTaskDefinitionRequest withRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        setRequiresCompatibilities(requiresCompatibilities);
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public RegisterTaskDefinitionRequest withRequiresCompatibilities(Compatibility... requiresCompatibilities) {
        com.amazonaws.internal.SdkInternalList<String> requiresCompatibilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                requiresCompatibilities.length);
        for (Compatibility value : requiresCompatibilities) {
            requiresCompatibilitiesCopy.add(value.toString());
        }
        if (getRequiresCompatibilities() == null) {
            setRequiresCompatibilities(requiresCompatibilitiesCopy);
        } else {
            getRequiresCompatibilities().addAll(requiresCompatibilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition but will be converted to an integer indicating the CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU units (
     * <code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpu
     *        The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     *        <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in
     *        a task definition but will be converted to an integer indicating the CPU units when the task definition is
     *        registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
     *        <p>
     *        If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     *        units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     *        </p>
     *        <p>
     *        If using the Fargate launch type, this field is required and you must use one of the following values,
     *        which determines your range of supported values for the <code>memory</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *        6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition but will be converted to an integer indicating the CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU units (
     * <code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     *         <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in
     *         a task definition but will be converted to an integer indicating the CPU units when the task definition
     *         is registered.</p> <note>
     *         <p>
     *         Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *         container-level resources for Windows containers.
     *         </p>
     *         </note>
     *         <p>
     *         If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     *         units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     *         </p>
     *         <p>
     *         If using the Fargate launch type, this field is required and you must use one of the following values,
     *         which determines your range of supported values for the <code>memory</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *         6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *         of 1024 (1 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *         of 1024 (1 GB)
     *         </p>
     *         </li>
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition but will be converted to an integer indicating the CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU units (
     * <code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpu
     *        The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     *        <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in
     *        a task definition but will be converted to an integer indicating the CPU units when the task definition is
     *        registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
     *        <p>
     *        If using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     *        units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     *        </p>
     *        <p>
     *        If using the Fargate launch type, this field is required and you must use one of the following values,
     *        which determines your range of supported values for the <code>memory</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *        6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition but will be converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @param memory
     *        The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     *        <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     *        definition but will be converted to an integer indicating the MiB when the task definition is
     *        registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
     *        <p>
     *        If using the EC2 launch type, this field is optional.
     *        </p>
     *        <p>
     *        If using the Fargate launch type, this field is required and you must use one of the following values,
     *        which determines your range of supported values for the <code>cpu</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *        <code>cpu</code> values: 1024 (1 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        2048 (2 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        4096 (4 vCPU)
     *        </p>
     *        </li>
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition but will be converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     *         <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     *         definition but will be converted to an integer indicating the MiB when the task definition is
     *         registered.</p> <note>
     *         <p>
     *         Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *         container-level resources for Windows containers.
     *         </p>
     *         </note>
     *         <p>
     *         If using the EC2 launch type, this field is optional.
     *         </p>
     *         <p>
     *         If using the Fargate launch type, this field is required and you must use one of the following values,
     *         which determines your range of supported values for the <code>cpu</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *         <code>cpu</code> values: 1024 (1 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *         2048 (2 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *         4096 (4 vCPU)
     *         </p>
     *         </li>
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition but will be converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @param memory
     *        The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     *        <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     *        definition but will be converted to an integer indicating the MiB when the task definition is
     *        registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
     *        <p>
     *        If using the EC2 launch type, this field is optional.
     *        </p>
     *        <p>
     *        If using the Fargate launch type, this field is required and you must use one of the following values,
     *        which determines your range of supported values for the <code>cpu</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *        <code>cpu</code> values: 1024 (1 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        2048 (2 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        4096 (4 vCPU)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withMemory(String memory) {
        setMemory(memory);
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: ").append(getTaskRoleArn()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getNetworkMode() != null)
            sb.append("NetworkMode: ").append(getNetworkMode()).append(",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: ").append(getContainerDefinitions()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getRequiresCompatibilities() != null)
            sb.append("RequiresCompatibilities: ").append(getRequiresCompatibilities()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskDefinitionRequest == false)
            return false;
        RegisterTaskDefinitionRequest other = (RegisterTaskDefinitionRequest) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getNetworkMode() == null ^ this.getNetworkMode() == null)
            return false;
        if (other.getNetworkMode() != null && other.getNetworkMode().equals(this.getNetworkMode()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getRequiresCompatibilities() == null ^ this.getRequiresCompatibilities() == null)
            return false;
        if (other.getRequiresCompatibilities() != null && other.getRequiresCompatibilities().equals(this.getRequiresCompatibilities()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getRequiresCompatibilities() == null) ? 0 : getRequiresCompatibilities().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskDefinitionRequest clone() {
        return (RegisterTaskDefinitionRequest) super.clone();
    }

}
