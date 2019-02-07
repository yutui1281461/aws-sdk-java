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
package com.amazonaws.services.lambda;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.services.lambda.model.transform.*;

/**
 * Client for accessing AWS Lambda. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>, and
 * for information about how the service works, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLambdaClient extends AmazonWebServiceClient implements AWSLambda {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLambda.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lambda";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.lambda.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.lambda.model.EC2AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyLengthExceededException").withModeledClass(
                                    com.amazonaws.services.lambda.model.PolicyLengthExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSAccessDeniedException").withModeledClass(
                                    com.amazonaws.services.lambda.model.KMSAccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withModeledClass(
                                    com.amazonaws.services.lambda.model.ServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2ThrottledException").withModeledClass(
                                    com.amazonaws.services.lambda.model.EC2ThrottledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateException").withModeledClass(
                                    com.amazonaws.services.lambda.model.KMSInvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidZipFileException").withModeledClass(
                                    com.amazonaws.services.lambda.model.InvalidZipFileException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSDisabledException").withModeledClass(
                                    com.amazonaws.services.lambda.model.KMSDisabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestContentException").withModeledClass(
                                    com.amazonaws.services.lambda.model.InvalidRequestContentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRuntimeException").withModeledClass(
                                    com.amazonaws.services.lambda.model.InvalidRuntimeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.lambda.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2UnexpectedException").withModeledClass(
                                    com.amazonaws.services.lambda.model.EC2UnexpectedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSecurityGroupIDException").withModeledClass(
                                    com.amazonaws.services.lambda.model.InvalidSecurityGroupIDException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withModeledClass(
                                    com.amazonaws.services.lambda.model.ResourceConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeStorageExceededException").withModeledClass(
                                    com.amazonaws.services.lambda.model.CodeStorageExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ENILimitReachedException").withModeledClass(
                                    com.amazonaws.services.lambda.model.ENILimitReachedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetIPAddressLimitReachedException").withModeledClass(
                                    com.amazonaws.services.lambda.model.SubnetIPAddressLimitReachedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSNotFoundException").withModeledClass(
                                    com.amazonaws.services.lambda.model.KMSNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSubnetIDException").withModeledClass(
                                    com.amazonaws.services.lambda.model.InvalidSubnetIDException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionFailedException").withModeledClass(
                                    com.amazonaws.services.lambda.model.PreconditionFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTooLargeException").withModeledClass(
                                    com.amazonaws.services.lambda.model.RequestTooLargeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.lambda.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedMediaTypeException").withModeledClass(
                                    com.amazonaws.services.lambda.model.UnsupportedMediaTypeException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lambda.model.AWSLambdaException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Lambda. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSLambdaClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSLambdaClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSLambdaClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Lambda (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSLambdaClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLambdaClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLambdaClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AWSLambdaClientBuilder builder() {
        return AWSLambdaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Lambda using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLambdaClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lambda.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lambda/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lambda/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource
     * policies to grant permissions to event sources that use <i>push</i> model. In a <i>push</i> model, event sources
     * (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the resource
     * policy allows an event source, permission to invoke the Lambda function.
     * </p>
     * <p>
     * For information about the push model, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">Lambda Functions</a>.
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to the Lambda function version or alias you
     * specify in the <code>AddPermission</code> request via the <code>Qualifier</code> parameter. For more information
     * about versioning, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:AddPermission</code> action.
     * </p>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws PolicyLengthExceededException
     *         Lambda function access policy is limited to 20 KB.
     * @throws TooManyRequestsException
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddPermissionResult addPermission(AddPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAddPermission(request);
    }

    @SdkInternalApi
    final AddPermissionResult executeAddPermission(AddPermissionRequest addPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<AddPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias that points to the specified Lambda function version. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlias(request);
    }

    @SdkInternalApi
    final CreateAliasResult executeCreateAlias(CreateAliasRequest createAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can be either an Amazon Kinesis stream or an
     * Amazon DynamoDB stream. AWS Lambda invokes the specified function when records are posted to the stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is called the event source mapping.
     * </p>
     * <p>
     * You provide mapping information (for example, which stream to read from and which Lambda function to invoke) in
     * the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream, can be associated with multiple AWS Lambda
     * functions. A given Lambda function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * If you are using versioning, you can specify a specific function version or an alias via the function name
     * parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     * 
     * @param createEventSourceMappingRequest
     * @return Result of the CreateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @sample AWSLambda.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventSourceMapping(request);
    }

    @SdkInternalApi
    final CreateEventSourceMappingResult executeCreateEventSourceMapping(CreateEventSourceMappingRequest createEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSourceMappingRequest> request = null;
        Response<CreateEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventSourceMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from the request parameters, and the code for the
     * function is provided by a .zip file in the request body. If the function name already exists, the operation will
     * fail. Note that the function name is case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the Lambda function you are creating using the
     * <code>Publish</code> parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateFunction</code> action.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
     * @sample AWSLambda.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFunctionResult createFunction(CreateFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFunction(request);
    }

    @SdkInternalApi
    final CreateFunctionResult executeCreateFunction(CreateFunctionRequest createFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(createFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFunctionRequest> request = null;
        Response<CreateFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlias(request);
    }

    @SdkInternalApi
    final DeleteAliasResult executeDeleteAlias(DeleteAliasRequest deleteAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<DeleteAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer invoke the function for events in the
     * associated source.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return Result of the DeleteEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventSourceMapping(request);
    }

    @SdkInternalApi
    final DeleteEventSourceMappingResult executeDeleteEventSourceMapping(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSourceMappingRequest> request = null;
        Response<DeleteEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventSourceMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you are using the versioning feature and you don't specify a function version in your
     * <code>DeleteFunction</code> request, AWS Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific function version, you must provide the function
     * version via the <code>Qualifier</code> parameter. For information about function versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also deleted. You will need to delete the event
     * source mappings explicitly.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteFunction</code> action.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @sample AWSLambda.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFunctionResult deleteFunction(DeleteFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunction(request);
    }

    @SdkInternalApi
    final DeleteFunctionResult executeDeleteFunction(DeleteFunctionRequest deleteFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionRequest> request = null;
        Response<DeleteFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes concurrent execution limits from this function. For more information, see <a>concurrent-executions</a>.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @return Result of the DeleteFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFunctionConcurrencyResult deleteFunctionConcurrency(DeleteFunctionConcurrencyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFunctionConcurrency(request);
    }

    @SdkInternalApi
    final DeleteFunctionConcurrencyResult executeDeleteFunctionConcurrency(DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFunctionConcurrencyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionConcurrencyRequest> request = null;
        Response<DeleteFunctionConcurrencyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionConcurrencyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFunctionConcurrencyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFunctionConcurrencyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFunctionConcurrencyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a customer's account settings.
     * </p>
     * <p>
     * You can use this operation to retrieve Lambda limits information, such as code size and concurrency limits. For
     * more information about limits, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">AWS Lambda
     * Limits</a>. You can also retrieve resource usage statistics, such as code storage usage and function count.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws TooManyRequestsException
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing
     * to. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     * 
     * @param getAliasRequest
     * @return Result of the GetAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAliasResult getAlias(GetAliasRequest request) {
        request = beforeClientExecution(request);
        return executeGetAlias(request);
    }

    @SdkInternalApi
    final GetAliasResult executeGetAlias(GetAliasRequest getAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(getAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAliasRequest> request = null;
        Response<GetAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAliasResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration information for the specified event source mapping (see <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return Result of the GetEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventSourceMapping(request);
    }

    @SdkInternalApi
    final GetEventSourceMappingResult executeGetEventSourceMapping(GetEventSourceMappingRequest getEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventSourceMappingRequest> request = null;
        Response<GetEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventSourceMappingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you
     * uploaded with <a>CreateFunction</a> so you can download the .zip file. Note that the URL is valid for up to 10
     * minutes. The configuration information is the same information you provided as parameters when uploading the
     * function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify a specific function version for which you
     * want this information. If you don't specify this parameter, the API uses unqualified function ARN which return
     * information about the <code>$LATEST</code> version of the Lambda function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunction</code> action.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFunctionResult getFunction(GetFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunction(request);
    }

    @SdkInternalApi
    final GetFunctionResult executeGetFunction(GetFunctionRequest getFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionRequest> request = null;
        Response<GetFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This the same information you provided as
     * parameters when uploading the function by using <a>CreateFunction</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this information for a specific function version by
     * using the optional <code>Qualifier</code> parameter and specifying the function version or alias that points to
     * it. If you don't provide it, the API returns information about the $LATEST version of the function. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @return Result of the GetFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetFunctionConfiguration(request);
    }

    @SdkInternalApi
    final GetFunctionConfigurationResult executeGetFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionConfigurationRequest> request = null;
        Response<GetFunctionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFunctionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFunctionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFunctionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource policy associated with the specific Lambda
     * function version or alias by specifying the version or alias name using the <code>Qualifier</code> parameter. For
     * more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicy(request);
    }

    @SdkInternalApi
    final GetPolicyResult executeGetPolicy(GetPolicyRequest getPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Invokes a specific Lambda function. For an example, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific function version by providing function
     * version or alias name that is pointing to the function version using the <code>Qualifier</code> parameter in the
     * request. If you don't provide the <code>Qualifier</code> parameter, the <code>$LATEST</code> version of the
     * Lambda function is invoked. Invocations occur at least once in response to an event and functions must be
     * idempotent to handle this. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * <note>
     * <p>
     * The <code>TooManyRequestsException</code> noted below will return the following:
     * <code>ConcurrentInvocationLimitExceeded</code> will be returned if you have no functions with reserved
     * concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds
     * the account's unreserved concurrency limit. <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will
     * be returned when a function with reserved concurrency exceeds its configured concurrency limit.
     * </p>
     * </note>
     * 
     * @param invokeRequest
     * @return Result of the Invoke operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws RequestTooLargeException
     *         The request payload exceeded the <code>Invoke</code> request body JSON input limit. For more information,
     *         see <a href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>.
     * @throws UnsupportedMediaTypeException
     *         The content type of the <code>Invoke</code> request body is not JSON.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws EC2UnexpectedException
     *         AWS Lambda received an unexpected EC2 client exception while setting up for the Lambda function.
     * @throws SubnetIPAddressLimitReachedException
     *         AWS Lambda was not able to set up VPC access for the Lambda function because one or more configured
     *         subnets has no available IP addresses.
     * @throws ENILimitReachedException
     *         AWS Lambda was not able to create an Elastic Network Interface (ENI) in the VPC, specified as part of
     *         Lambda function configuration, because the limit for network interfaces has been reached.
     * @throws EC2ThrottledException
     *         AWS Lambda was throttled by Amazon EC2 during Lambda function initialization using the execution role
     *         provided for the Lambda function.
     * @throws EC2AccessDeniedException
     * @throws InvalidSubnetIDException
     *         The Subnet ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidSecurityGroupIDException
     *         The Security Group ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidZipFileException
     *         AWS Lambda could not unzip the function zip file.
     * @throws KMSDisabledException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is disabled. Check the
     *         Lambda function's KMS key settings.
     * @throws KMSInvalidStateException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is in an invalid state
     *         for Decrypt. Check the function's KMS key settings.
     * @throws KMSAccessDeniedException
     *         Lambda was unable to decrypt the environment variables because KMS access was denied. Check the Lambda
     *         function's KMS permissions.
     * @throws KMSNotFoundException
     *         Lambda was unable to decrypt the environment variables because the KMS key was not found. Check the
     *         function's KMS key settings.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @sample AWSLambda.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InvokeResult invoke(InvokeRequest request) {
        request = beforeClientExecution(request);
        return executeInvoke(request);
    }

    @SdkInternalApi
    final InvokeResult executeInvoke(InvokeRequest invokeRequest) {

        ExecutionContext executionContext = createExecutionContext(invokeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeRequest> request = null;
        Response<InvokeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invokeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvokeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(false), new InvokeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <important>
     * <p>
     * This API is deprecated. We recommend you use <code>Invoke</code> API (see <a>Invoke</a>).
     * </p>
     * </important>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function
     * asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @return Result of the InvokeAsync operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @sample AWSLambda.InvokeAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest request) {
        request = beforeClientExecution(request);
        return executeInvokeAsync(request);
    }

    @SdkInternalApi
    final InvokeAsyncResult executeInvokeAsync(InvokeAsyncRequest invokeAsyncRequest) {

        ExecutionContext executionContext = createExecutionContext(invokeAsyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeAsyncRequest> request = null;
        Response<InvokeAsyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeAsyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invokeAsyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvokeAsyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InvokeAsyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as
     * the alias ARN, description, alias name, and the function version to which it points. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAliases(request);
    }

    @SdkInternalApi
    final ListAliasesResult executeListAliases(ListAliasesRequest listAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of event source mappings you created using the <code>CreateEventSourceMapping</code> (see
     * <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can optionally specify filters to retrieve
     * specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event source mappings for a specific Lambda function
     * version or an alias as described in the <code>FunctionName</code> parameter. For information about the versioning
     * feature, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function
     * Versioning and Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return Result of the ListEventSourceMappings operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeListEventSourceMappings(request);
    }

    @SdkInternalApi
    final ListEventSourceMappingsResult executeListEventSourceMappings(ListEventSourceMappingsRequest listEventSourceMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventSourceMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSourceMappingsRequest> request = null;
        Response<ListEventSourceMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSourceMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEventSourceMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventSourceMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEventSourceMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListEventSourceMappingsResult listEventSourceMappings() {
        return listEventSourceMappings(new ListEventSourceMappingsRequest());
    }

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration
     * information. You must use <a>GetFunction</a> to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListFunctions</code> action.
     * </p>
     * <p>
     * If you are using the versioning feature, you can list all of your functions or only <code>$LATEST</code>
     * versions. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFunctionsResult listFunctions(ListFunctionsRequest request) {
        request = beforeClientExecution(request);
        return executeListFunctions(request);
    }

    @SdkInternalApi
    final ListFunctionsResult executeListFunctions(ListFunctionsRequest listFunctionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFunctionsRequest> request = null;
        Response<ListFunctionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFunctionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFunctionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFunctionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFunctionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListFunctionsResult listFunctions() {
        return listFunctions(new ListFunctionsRequest());
    }

    /**
     * <p>
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more
     * information on Tagging, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all versions of a function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return Result of the ListVersionsByFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeListVersionsByFunction(request);
    }

    @SdkInternalApi
    final ListVersionsByFunctionResult executeListVersionsByFunction(ListVersionsByFunctionRequest listVersionsByFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(listVersionsByFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVersionsByFunctionRequest> request = null;
        Response<ListVersionsByFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVersionsByFunctionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVersionsByFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVersionsByFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVersionsByFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot
     * of the function code and configuration information from $LATEST and publishes a new version. The code and
     * configuration cannot be modified after publication. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @return Result of the PublishVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.PublishVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishVersionResult publishVersion(PublishVersionRequest request) {
        request = beforeClientExecution(request);
        return executePublishVersion(request);
    }

    @SdkInternalApi
    final PublishVersionResult executePublishVersion(PublishVersionRequest publishVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(publishVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishVersionRequest> request = null;
        Response<PublishVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's
     * total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent
     * executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you
     * have a total of 900 available to allocate to individual functions. For more information, see
     * <a>concurrent-executions</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @return Result of the PutFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     * @sample AWSLambda.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutFunctionConcurrencyResult putFunctionConcurrency(PutFunctionConcurrencyRequest request) {
        request = beforeClientExecution(request);
        return executePutFunctionConcurrency(request);
    }

    @SdkInternalApi
    final PutFunctionConcurrencyResult executePutFunctionConcurrency(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest) {

        ExecutionContext executionContext = createExecutionContext(putFunctionConcurrencyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFunctionConcurrencyRequest> request = null;
        Response<PutFunctionConcurrencyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFunctionConcurrencyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFunctionConcurrencyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFunctionConcurrencyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutFunctionConcurrencyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can remove individual permissions from an resource policy associated with a Lambda function by providing a
     * statement ID that you provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific to the Lambda function version or alias you
     * specify in the <code>AddPermission</code> request via the <code>Qualifier</code> parameter. For more information
     * about versioning, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code> action.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemovePermission(request);
    }

    @SdkInternalApi
    final RemovePermissionResult executeRemovePermission(RemovePermissionRequest removePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<RemovePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemovePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemovePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemovePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon
     * Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of
     * null. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS
     * Lambda Developer Guide</b>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @sample AWSLambda.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Using this API you can update the function version to which the alias points and the alias description. For more
     * information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS
     * Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     * 
     * @param updateAliasRequest
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAlias(request);
    }

    @SdkInternalApi
    final UpdateAliasResult executeUpdateAlias(UpdateAliasRequest updateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<UpdateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to change the parameters of the existing
     * mapping without losing your position in the stream. You can change which function will receive the stream
     * records, but to change the stream itself, you must create a new mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event source mapping to map to a specific Lambda
     * function version or alias as described in the <code>FunctionName</code> parameter. For information about the
     * versioning feature, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda
     * Function Versioning and Aliases</a>.
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If you enable again, it will resume polling
     * from the time it had stopped polling, so you don't lose processing of any records. However, if you delete event
     * source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @return Result of the UpdateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     *         The resource already exists.
     * @sample AWSLambda.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventSourceMapping(request);
    }

    @SdkInternalApi
    final UpdateEventSourceMappingResult executeUpdateEventSourceMapping(UpdateEventSourceMappingRequest updateEventSourceMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventSourceMappingRequest> request = null;
        Response<UpdateEventSourceMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventSourceMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventSourceMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEventSourceMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda
     * function and cannot be used to update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     * 
     * @param updateFunctionCodeRequest
     * @return Result of the UpdateFunctionCode operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateFunctionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFunctionCode(request);
    }

    @SdkInternalApi
    final UpdateFunctionCodeResult executeUpdateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFunctionCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionCodeRequest> request = null;
        Response<UpdateFunctionCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFunctionCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFunctionCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFunctionCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the
     * request. You provide only the parameters you want to change. This operation must only be used on an existing
     * Lambda function and cannot be used to update the function's code.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @return Result of the UpdateFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFunctionConfiguration(request);
    }

    @SdkInternalApi
    final UpdateFunctionConfigurationResult executeUpdateFunctionConfiguration(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionConfigurationRequest> request = null;
        Response<UpdateFunctionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFunctionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFunctionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFunctionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
