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
package com.amazonaws.services.applicationdiscovery;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;

/**
 * Interface for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationdiscovery.AbstractAWSApplicationDiscoveryAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Application Discovery Service</fullname>
 * <p>
 * AWS Application Discovery Service helps you plan application migration projects by automatically identifying servers,
 * virtual machines (VMs), software, and software dependencies running in your on-premises data centers. Application
 * Discovery Service also collects application performance data, which can help you assess the outcome of your
 * migration. The data collected by Application Discovery Service is securely retained in an AWS-hosted and managed
 * database in the cloud. You can export the data as a CSV or XML file into your preferred visualization tool or
 * cloud-migration solution to plan your migration. For more information, see <a
 * href="http://aws.amazon.com/application-discovery/faqs/">AWS Application Discovery Service FAQ</a>.
 * </p>
 * <p>
 * Application Discovery Service offers two modes of operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Agentless discovery</b> mode is recommended for environments that use VMware vCenter Server. This mode doesn't
 * require you to install an agent on each host. Agentless discovery gathers server information regardless of the
 * operating systems, which minimizes the time required for initial on-premises infrastructure assessment. Agentless
 * discovery doesn't collect information about software and software dependencies. It also doesn't work in non-VMware
 * environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Agent-based discovery</b> mode collects a richer set of data than agentless discovery by using the AWS Application
 * Discovery Agent, which you install on one or more hosts in your data center. The agent captures infrastructure and
 * application information, including an inventory of installed software applications, system and process performance,
 * resource utilization, and network dependencies between workloads. The information collected by agents is secured at
 * rest and in transit to the Application Discovery Service database in the cloud.
 * </p>
 * </li>
 * </ul>
 * <p>
 * We recommend that you use agent-based discovery for non-VMware environments and to collect information about software
 * and software dependencies. You can also run agent-based and agentless discovery simultaneously. Use agentless
 * discovery to quickly complete the initial infrastructure assessment and then install agents on select hosts.
 * </p>
 * <p>
 * Application Discovery Service integrates with application discovery solutions from AWS Partner Network (APN)
 * partners. Third-party application discovery tools can query Application Discovery Service and write to the
 * Application Discovery Service database using a public API. You can then import the data into either a visualization
 * tool or cloud-migration solution.
 * </p>
 * <important>
 * <p>
 * Application Discovery Service doesn't gather sensitive information. All data is handled according to the <a
 * href="http://aws.amazon.com/privacy/">AWS Privacy Policy</a>. You can operate Application Discovery Service offline
 * to inspect collected data before it is shared with the service.
 * </p>
 * </important>
 * <p>
 * Your AWS account must be granted access to Application Discovery Service, a process called <i>whitelisting</i>. This
 * is true for AWS partners and customers alike. To request access, <a
 * href="http://aws.amazon.com/application-discovery/">sign up for Application Discovery Service</a>.
 * </p>
 * <p>
 * This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for
 * Application Discovery Service. The topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * This guide is intended for use with the <a href="http://docs.aws.amazon.com/application-discovery/latest/userguide/">
 * <i>AWS Application Discovery Service User Guide</i> </a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSApplicationDiscoveryAsync extends AWSApplicationDiscovery {

    /**
     * <p>
     * Associates one or more configuration items with an application.
     * </p>
     * 
     * @param associateConfigurationItemsToApplicationRequest
     * @return A Java Future containing the result of the AssociateConfigurationItemsToApplication operation returned by
     *         the service.
     * @sample AWSApplicationDiscoveryAsync.AssociateConfigurationItemsToApplication
     */
    java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            AssociateConfigurationItemsToApplicationRequest associateConfigurationItemsToApplicationRequest);

    /**
     * <p>
     * Associates one or more configuration items with an application.
     * </p>
     * 
     * @param associateConfigurationItemsToApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateConfigurationItemsToApplication operation returned by
     *         the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.AssociateConfigurationItemsToApplication
     */
    java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            AssociateConfigurationItemsToApplicationRequest associateConfigurationItemsToApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateConfigurationItemsToApplicationRequest, AssociateConfigurationItemsToApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an application with the given name and description.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application with the given name and description.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.CreateTags
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.CreateTags
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes a list of applications and their associations with configuration items.
     * </p>
     * 
     * @param deleteApplicationsRequest
     * @return A Java Future containing the result of the DeleteApplications operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DeleteApplications
     */
    java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(DeleteApplicationsRequest deleteApplicationsRequest);

    /**
     * <p>
     * Deletes a list of applications and their associations with configuration items.
     * </p>
     * 
     * @param deleteApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplications operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DeleteApplications
     */
    java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(DeleteApplicationsRequest deleteApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationsRequest, DeleteApplicationsResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @return A Java Future containing the result of the DescribeAgents operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeAgents
     */
    java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest describeAgentsRequest);

    /**
     * <p>
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgents operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeAgents
     */
    java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest describeAgentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentsRequest, DescribeAgentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves attributes for a list of configuration item IDs. All of the supplied IDs must be for the same asset
     * type (server, application, process, or connection). Output fields are specific to the asset type selected. For
     * example, the output for a <i>server</i> configuration item includes a list of attributes about the server, such
     * as host name, operating system, and number of network cards.
     * </p>
     * <p>
     * For a complete list of outputs for each asset type, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#DescribeConfigurations"
     * >Using the DescribeConfigurations Action</a>.
     * </p>
     * 
     * @param describeConfigurationsRequest
     * @return A Java Future containing the result of the DescribeConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeConfigurations
     */
    java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest describeConfigurationsRequest);

    /**
     * <p>
     * Retrieves attributes for a list of configuration item IDs. All of the supplied IDs must be for the same asset
     * type (server, application, process, or connection). Output fields are specific to the asset type selected. For
     * example, the output for a <i>server</i> configuration item includes a list of attributes about the server, such
     * as host name, operating system, and number of network cards.
     * </p>
     * <p>
     * For a complete list of outputs for each asset type, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#DescribeConfigurations"
     * >Using the DescribeConfigurations Action</a>.
     * </p>
     * 
     * @param describeConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeConfigurations
     */
    java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest describeConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationsRequest, DescribeConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use <code>DescribeExportTasks</code> instead.
     * </p>
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @return A Java Future containing the result of the DescribeExportConfigurations operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsync.DescribeExportConfigurations
     */
    @Deprecated
    java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(
            DescribeExportConfigurationsRequest describeExportConfigurationsRequest);

    /**
     * <p>
     * Deprecated. Use <code>DescribeExportTasks</code> instead.
     * </p>
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportConfigurations operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeExportConfigurations
     */
    @Deprecated
    java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(
            DescribeExportConfigurationsRequest describeExportConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportConfigurationsRequest, DescribeExportConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeExportTasks
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeExportTasks
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Disassociates one or more configuration items from an application.
     * </p>
     * 
     * @param disassociateConfigurationItemsFromApplicationRequest
     * @return A Java Future containing the result of the DisassociateConfigurationItemsFromApplication operation
     *         returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DisassociateConfigurationItemsFromApplication
     */
    java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            DisassociateConfigurationItemsFromApplicationRequest disassociateConfigurationItemsFromApplicationRequest);

    /**
     * <p>
     * Disassociates one or more configuration items from an application.
     * </p>
     * 
     * @param disassociateConfigurationItemsFromApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateConfigurationItemsFromApplication operation
     *         returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DisassociateConfigurationItemsFromApplication
     */
    java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            DisassociateConfigurationItemsFromApplicationRequest disassociateConfigurationItemsFromApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateConfigurationItemsFromApplicationRequest, DisassociateConfigurationItemsFromApplicationResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use <code>StartExportTask</code> instead.
     * </p>
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID that you can query using the <i>DescribeExportConfigurations</i> API.
     * The system imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @return A Java Future containing the result of the ExportConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.ExportConfigurations
     */
    @Deprecated
    java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest exportConfigurationsRequest);

    /**
     * <p>
     * Deprecated. Use <code>StartExportTask</code> instead.
     * </p>
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID that you can query using the <i>DescribeExportConfigurations</i> API.
     * The system imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.ExportConfigurations
     */
    @Deprecated
    java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest exportConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportConfigurationsRequest, ExportConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a short summary of discovered assets.
     * </p>
     * 
     * @param getDiscoverySummaryRequest
     * @return A Java Future containing the result of the GetDiscoverySummary operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.GetDiscoverySummary
     */
    java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(GetDiscoverySummaryRequest getDiscoverySummaryRequest);

    /**
     * <p>
     * Retrieves a short summary of discovered assets.
     * </p>
     * 
     * @param getDiscoverySummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiscoverySummary operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.GetDiscoverySummary
     */
    java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(GetDiscoverySummaryRequest getDiscoverySummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiscoverySummaryRequest, GetDiscoverySummaryResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of configuration items according to criteria that you specify in a filter. The filter criteria
     * identifies the relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.ListConfigurations
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of configuration items according to criteria that you specify in a filter. The filter criteria
     * identifies the relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.ListConfigurations
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of servers that are one network hop away from a specified server.
     * </p>
     * 
     * @param listServerNeighborsRequest
     * @return A Java Future containing the result of the ListServerNeighbors operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.ListServerNeighbors
     */
    java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(ListServerNeighborsRequest listServerNeighborsRequest);

    /**
     * <p>
     * Retrieves a list of servers that are one network hop away from a specified server.
     * </p>
     * 
     * @param listServerNeighborsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServerNeighbors operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.ListServerNeighbors
     */
    java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(ListServerNeighborsRequest listServerNeighborsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServerNeighborsRequest, ListServerNeighborsResult> asyncHandler);

    /**
     * <p>
     * Instructs the specified agents or connectors to start collecting data.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @return A Java Future containing the result of the StartDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsync.StartDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest);

    /**
     * <p>
     * Instructs the specified agents or connectors to start collecting data.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsyncHandler.StartDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataCollectionByAgentIdsRequest, StartDataCollectionByAgentIdsResult> asyncHandler);

    /**
     * <p>
     * Begins the export of discovered data to an S3 bucket.
     * </p>
     * <p>
     * If you specify <code>agentIds</code> in a filter, the task exports up to 72 hours of detailed data collected by
     * the identified Application Discovery Agent, including network, process, and performance details. A time range for
     * exported agent data may be set by using <code>startTime</code> and <code>endTime</code>. Export of detailed agent
     * data is limited to five concurrently running exports.
     * </p>
     * <p>
     * If you do not include an <code>agentIds</code> filter, summary data is exported that includes both AWS Agentless
     * Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two
     * exports per day.
     * </p>
     * 
     * @param startExportTaskRequest
     * @return A Java Future containing the result of the StartExportTask operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.StartExportTask
     */
    java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest startExportTaskRequest);

    /**
     * <p>
     * Begins the export of discovered data to an S3 bucket.
     * </p>
     * <p>
     * If you specify <code>agentIds</code> in a filter, the task exports up to 72 hours of detailed data collected by
     * the identified Application Discovery Agent, including network, process, and performance details. A time range for
     * exported agent data may be set by using <code>startTime</code> and <code>endTime</code>. Export of detailed agent
     * data is limited to five concurrently running exports.
     * </p>
     * <p>
     * If you do not include an <code>agentIds</code> filter, summary data is exported that includes both AWS Agentless
     * Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two
     * exports per day.
     * </p>
     * 
     * @param startExportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExportTask operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.StartExportTask
     */
    java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest startExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartExportTaskRequest, StartExportTaskResult> asyncHandler);

    /**
     * <p>
     * Instructs the specified agents or connectors to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @return A Java Future containing the result of the StopDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsync.StopDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(
            StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest);

    /**
     * <p>
     * Instructs the specified agents or connectors to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsyncHandler.StopDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(
            StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest,
            com.amazonaws.handlers.AsyncHandler<StopDataCollectionByAgentIdsRequest, StopDataCollectionByAgentIdsResult> asyncHandler);

    /**
     * <p>
     * Updates metadata about an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates metadata about an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

}
