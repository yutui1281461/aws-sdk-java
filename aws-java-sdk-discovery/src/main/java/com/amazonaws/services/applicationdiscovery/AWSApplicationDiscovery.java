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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.applicationdiscovery.model.*;

/**
 * Interface for accessing AWS Application Discovery Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationdiscovery.AbstractAWSApplicationDiscovery} instead.
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
public interface AWSApplicationDiscovery {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "discovery";

    /**
     * Overrides the default endpoint for this client ("https://discovery.us-west-2.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "discovery.us-west-2.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://discovery.us-west-2.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "discovery.us-west-2.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://discovery.us-west-2.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSApplicationDiscovery#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associates one or more configuration items with an application.
     * </p>
     * 
     * @param associateConfigurationItemsToApplicationRequest
     * @return Result of the AssociateConfigurationItemsToApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.AssociateConfigurationItemsToApplication
     */
    AssociateConfigurationItemsToApplicationResult associateConfigurationItemsToApplication(
            AssociateConfigurationItemsToApplicationRequest associateConfigurationItemsToApplicationRequest);

    /**
     * <p>
     * Creates an application with the given name and description.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.CreateApplication
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.CreateTags
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Deletes a list of applications and their associations with configuration items.
     * </p>
     * 
     * @param deleteApplicationsRequest
     * @return Result of the DeleteApplications operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DeleteApplications
     */
    DeleteApplicationsResult deleteApplications(DeleteApplicationsRequest deleteApplicationsRequest);

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DeleteTags
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @return Result of the DescribeAgents operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeAgents
     */
    DescribeAgentsResult describeAgents(DescribeAgentsRequest describeAgentsRequest);

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
     * @return Result of the DescribeConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeConfigurations
     */
    DescribeConfigurationsResult describeConfigurations(DescribeConfigurationsRequest describeConfigurationsRequest);

    /**
     * <p>
     * Deprecated. Use <code>DescribeExportTasks</code> instead.
     * </p>
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @return Result of the DescribeExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeExportConfigurations
     */
    @Deprecated
    DescribeExportConfigurationsResult describeExportConfigurations(DescribeExportConfigurationsRequest describeExportConfigurationsRequest);

    /**
     * <p>
     * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeExportTasks
     */
    DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeTags
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Disassociates one or more configuration items from an application.
     * </p>
     * 
     * @param disassociateConfigurationItemsFromApplicationRequest
     * @return Result of the DisassociateConfigurationItemsFromApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DisassociateConfigurationItemsFromApplication
     */
    DisassociateConfigurationItemsFromApplicationResult disassociateConfigurationItemsFromApplication(
            DisassociateConfigurationItemsFromApplicationRequest disassociateConfigurationItemsFromApplicationRequest);

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
     * @return Result of the ExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @sample AWSApplicationDiscovery.ExportConfigurations
     */
    @Deprecated
    ExportConfigurationsResult exportConfigurations(ExportConfigurationsRequest exportConfigurationsRequest);

    /**
     * <p>
     * Retrieves a short summary of discovered assets.
     * </p>
     * 
     * @param getDiscoverySummaryRequest
     * @return Result of the GetDiscoverySummary operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.GetDiscoverySummary
     */
    GetDiscoverySummaryResult getDiscoverySummary(GetDiscoverySummaryRequest getDiscoverySummaryRequest);

    /**
     * <p>
     * Retrieves a list of configuration items according to criteria that you specify in a filter. The filter criteria
     * identifies the relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.ListConfigurations
     */
    ListConfigurationsResult listConfigurations(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of servers that are one network hop away from a specified server.
     * </p>
     * 
     * @param listServerNeighborsRequest
     * @return Result of the ListServerNeighbors operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.ListServerNeighbors
     */
    ListServerNeighborsResult listServerNeighbors(ListServerNeighborsRequest listServerNeighborsRequest);

    /**
     * <p>
     * Instructs the specified agents or connectors to start collecting data.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @return Result of the StartDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StartDataCollectionByAgentIds
     */
    StartDataCollectionByAgentIdsResult startDataCollectionByAgentIds(StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest);

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
     * @return Result of the StartExportTask operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @sample AWSApplicationDiscovery.StartExportTask
     */
    StartExportTaskResult startExportTask(StartExportTaskRequest startExportTaskRequest);

    /**
     * <p>
     * Instructs the specified agents or connectors to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @return Result of the StopDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StopDataCollectionByAgentIds
     */
    StopDataCollectionByAgentIdsResult stopDataCollectionByAgentIds(StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest);

    /**
     * <p>
     * Updates metadata about an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.UpdateApplication
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
