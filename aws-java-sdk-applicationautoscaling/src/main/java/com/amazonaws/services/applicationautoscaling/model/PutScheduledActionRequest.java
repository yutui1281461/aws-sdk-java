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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScheduledAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutScheduledActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - <code>cron(<i>fields</i>)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time, in UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     * <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This string consists of the resource type
     * and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension. This parameter is required if you are creating a scheduled action. This string consists
     * of the service namespace, resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * </ul>
     */
    private String scalableDimension;
    /**
     * <p>
     * The date and time for the scheduled action to start.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time for the scheduled action to end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the
     * current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
     * </p>
     */
    private ScalableTargetAction scalableTargetAction;

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a
     *         resource provided by your own application or service. For more information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public PutScheduledActionRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public PutScheduledActionRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - <code>cron(<i>fields</i>)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time, in UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     * <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param schedule
     *        The schedule for this action. The following formats are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cron expressions - <code>cron(<i>fields</i>)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        At expressions are useful for one-time schedules. Specify the time, in UTC.
     *        </p>
     *        <p>
     *        For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     *        <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     *        </p>
     *        <p>
     *        For more information about cron expressions, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     *        Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - <code>cron(<i>fields</i>)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time, in UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     * <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @return The schedule for this action. The following formats are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cron expressions - <code>cron(<i>fields</i>)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         At expressions are useful for one-time schedules. Specify the time, in UTC.
     *         </p>
     *         <p>
     *         For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     *         <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     *         </p>
     *         <p>
     *         For more information about cron expressions, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *         >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - <code>cron(<i>fields</i>)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time, in UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     * <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param schedule
     *        The schedule for this action. The following formats are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        At expressions - <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rate expressions - <code>rate(<i>value</i> <i>unit</i>)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cron expressions - <code>cron(<i>fields</i>)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        At expressions are useful for one-time schedules. Specify the time, in UTC.
     *        </p>
     *        <p>
     *        For rate expressions, <i>value</i> is a positive integer and <i>unit</i> is <code>minute</code> |
     *        <code>minutes</code> | <code>hour</code> | <code>hours</code> | <code>day</code> | <code>days</code>.
     *        </p>
     *        <p>
     *        For more information about cron expressions, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     *        Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScheduledActionRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @return The name of the scheduled action.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScheduledActionRequest withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This string consists of the resource type
     * and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The identifier of the resource associated with the scheduled action. This string consists of the resource
     *        type and unique identifier.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and
     *        service name. Example: <code>service/default/sample-webapp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the
     *        Spot fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID
     *        and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     *        Example: <code>fleet/sample-fleet</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID.
     *        Example: <code>table/my-table</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     *        resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *        name. Example: <code>cluster:my-db-cluster</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier
     *        is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Custom resources are not supported with a resource type. This parameter must specify the
     *        <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique
     *        identifier is defined by the service provider.
     *        </p>
     *        </li>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This string consists of the resource type
     * and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the resource associated with the scheduled action. This string consists of the resource
     *         type and unique identifier.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and
     *         service name. Example: <code>service/default/sample-webapp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is
     *         the Spot fleet request ID. Example:
     *         <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID
     *         and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet
     *         name. Example: <code>fleet/sample-fleet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID.
     *         Example: <code>table/my-table</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is
     *         the resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *         name. Example: <code>cluster:my-db-cluster</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier
     *         is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Custom resources are not supported with a resource type. This parameter must specify the
     *         <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique
     *         identifier is defined by the service provider.
     *         </p>
     *         </li>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This string consists of the resource type
     * and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The identifier of the resource associated with the scheduled action. This string consists of the resource
     *        type and unique identifier.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and
     *        service name. Example: <code>service/default/sample-webapp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the
     *        Spot fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID
     *        and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     *        Example: <code>fleet/sample-fleet</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID.
     *        Example: <code>table/my-table</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     *        resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *        name. Example: <code>cluster:my-db-cluster</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier
     *        is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Custom resources are not supported with a resource type. This parameter must specify the
     *        <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique
     *        identifier is defined by the service provider.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScheduledActionRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension. This parameter is required if you are creating a scheduled action. This string consists
     * of the service namespace, resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension. This parameter is required if you are creating a scheduled action. This string
     *        consists of the service namespace, resource type, and scaling property.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *        Available for Aurora MySQL-compatible edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension. This parameter is required if you are creating a scheduled action. This string consists
     * of the service namespace, resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scalable dimension. This parameter is required if you are creating a scheduled action. This string
     *         consists of the service namespace, resource type, and scaling property.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *         secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *         secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *         Available for Aurora MySQL-compatible edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *         model endpoint variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource
     *         provided by your own application or service.
     *         </p>
     *         </li>
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension. This parameter is required if you are creating a scheduled action. This string consists
     * of the service namespace, resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension. This parameter is required if you are creating a scheduled action. This string
     *        consists of the service namespace, resource type, and scaling property.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *        Available for Aurora MySQL-compatible edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public PutScheduledActionRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension. This parameter is required if you are creating a scheduled action. This string consists
     * of the service namespace, resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension. This parameter is required if you are creating a scheduled action. This string
     *        consists of the service namespace, resource type, and scaling property.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *        Available for Aurora MySQL-compatible edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public PutScheduledActionRequest withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * <p>
     * The date and time for the scheduled action to start.
     * </p>
     * 
     * @param startTime
     *        The date and time for the scheduled action to start.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time for the scheduled action to start.
     * </p>
     * 
     * @return The date and time for the scheduled action to start.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time for the scheduled action to start.
     * </p>
     * 
     * @param startTime
     *        The date and time for the scheduled action to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScheduledActionRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time for the scheduled action to end.
     * </p>
     * 
     * @param endTime
     *        The date and time for the scheduled action to end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time for the scheduled action to end.
     * </p>
     * 
     * @return The date and time for the scheduled action to end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time for the scheduled action to end.
     * </p>
     * 
     * @param endTime
     *        The date and time for the scheduled action to end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScheduledActionRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the
     * current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
     * </p>
     * 
     * @param scalableTargetAction
     *        The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if
     *        the current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum
     *        capacity. If the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
     *        maximum capacity.
     */

    public void setScalableTargetAction(ScalableTargetAction scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
    }

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the
     * current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
     * </p>
     * 
     * @return The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if
     *         the current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum
     *         capacity. If the current capacity is above the maximum capacity, Application Auto Scaling scales in to
     *         the maximum capacity.
     */

    public ScalableTargetAction getScalableTargetAction() {
        return this.scalableTargetAction;
    }

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the
     * current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
     * </p>
     * 
     * @param scalableTargetAction
     *        The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if
     *        the current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum
     *        capacity. If the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
     *        maximum capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScheduledActionRequest withScalableTargetAction(ScalableTargetAction scalableTargetAction) {
        setScalableTargetAction(scalableTargetAction);
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
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: ").append(getScalableDimension()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getScalableTargetAction() != null)
            sb.append("ScalableTargetAction: ").append(getScalableTargetAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScheduledActionRequest == false)
            return false;
        PutScheduledActionRequest other = (PutScheduledActionRequest) obj;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null)
            return false;
        if (other.getScalableDimension() != null && other.getScalableDimension().equals(this.getScalableDimension()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getScalableTargetAction() == null ^ this.getScalableTargetAction() == null)
            return false;
        if (other.getScalableTargetAction() != null && other.getScalableTargetAction().equals(this.getScalableTargetAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getScalableTargetAction() == null) ? 0 : getScalableTargetAction().hashCode());
        return hashCode;
    }

    @Override
    public PutScheduledActionRequest clone() {
        return (PutScheduledActionRequest) super.clone();
    }

}
