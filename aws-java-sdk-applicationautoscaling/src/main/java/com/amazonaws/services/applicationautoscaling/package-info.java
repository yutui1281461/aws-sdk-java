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

/**
 * <p>
 * With Application Auto Scaling, you can configure automatic scaling for your scalable AWS resources. You can use
 * Application Auto Scaling to accomplish the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Define scaling policies to automatically scale your AWS resources
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale your resources in response to CloudWatch alarms
 * </p>
 * </li>
 * <li>
 * <p>
 * Schedule one-time or recurring scaling actions
 * </p>
 * </li>
 * <li>
 * <p>
 * View the history of your scaling events
 * </p>
 * </li>
 * </ul>
 * <p>
 * Application Auto Scaling can scale the following AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services. For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-auto-scaling.html">Service Auto Scaling</a>
 * in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot fleets. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/fleet-auto-scaling.html">Automatic Scaling for Spot
 * Fleet</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR clusters. For more information, see <a
 * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/ManagementGuide/emr-automatic-scaling.html">Using Automatic
 * Scaling in Amazon EMR</a> in the <i>Amazon EMR Management Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * AppStream 2.0 fleets. For more information, see <a
 * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/autoscaling.html">Fleet Auto Scaling for Amazon
 * AppStream 2.0</a> in the <i>Amazon AppStream 2.0 Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Provisioned read and write capacity for Amazon DynamoDB tables and global secondary indexes. For more information,
 * see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/AutoScaling.html">Managing Throughput
 * Capacity Automatically with DynamoDB Auto Scaling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora Replicas. For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Integrating.AutoScaling.html">Using Amazon Aurora
 * Auto Scaling with Aurora Replicas</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker endpoints. For more information, see <a
 * href="http://docs.aws.amazon.com/sagemaker/latest/dg/endpoint-auto-scaling.html">Automatically Scaling Amazon
 * SageMaker Models</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To configure automatic scaling for multiple resources across multiple services, use AWS Auto Scaling to create a
 * scaling plan for your application. For more information, see <a href="http://aws.amazon.com/autoscaling">AWS Auto
 * Scaling</a>.
 * </p>
 * <p>
 * For a list of supported regions, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#as-app_region">AWS Regions and Endpoints: Application
 * Auto Scaling</a> in the <i>AWS General Reference</i>.
 * </p>
 */
package com.amazonaws.services.applicationautoscaling;

