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
package com.amazonaws.services.acmpca;

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
import com.amazonaws.services.acmpca.AWSACMPCAClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.services.acmpca.model.transform.*;

/**
 * Client for accessing ACM-PCA. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * You can use the ACM PCA API to create a private certificate authority (CA). You must first call the
 * <a>CreateCertificateAuthority</a> function. If successful, the function returns an Amazon Resource Name (ARN) for
 * your private CA. Use this ARN as input to the <a>GetCertificateAuthorityCsr</a> function to retrieve the certificate
 * signing request (CSR) for your private CA certificate. Sign the CSR using the root or an intermediate CA in your
 * on-premises PKI hierarchy, and call the <a>ImportCertificateAuthorityCertificate</a> to import your signed private CA
 * certificate into ACM PCA.
 * </p>
 * <p>
 * Use your private CA to issue and revoke certificates. These are private certificates that identify and secure client
 * computers, servers, applications, services, devices, and users over SSLS/TLS connections within your organization.
 * Call the <a>IssueCertificate</a> function to issue a certificate. Call the <a>RevokeCertificate</a> function to
 * revoke a certificate.
 * </p>
 * <note>
 * <p>
 * Certificates issued by your private CA can be trusted only within your organization, not publicly.
 * </p>
 * </note>
 * <p>
 * Your private CA can optionally create a certificate revocation list (CRL) to track the certificates you revoke. To
 * create a CRL, you must specify a <a>RevocationConfiguration</a> object when you call the
 * <a>CreateCertificateAuthority</a> function. ACM PCA writes the CRL to an S3 bucket that you specify. You must specify
 * a bucket policy that grants ACM PCA write permission.
 * </p>
 * <p>
 * You can also call the <a>CreateCertificateAuthorityAuditReport</a> to create an optional audit report that lists
 * every time the CA private key is used. The private key is used for signing when the <b>IssueCertificate</b> or
 * <b>RevokeCertificate</b> function is called.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSACMPCAClient extends AmazonWebServiceClient implements AWSACMPCA {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSACMPCA.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "acm-pca";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.InvalidTagException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CertificateMismatchException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.CertificateMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.TooManyTagsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPolicyException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.InvalidPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgsException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.InvalidArgsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.InvalidArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedCSRException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.MalformedCSRException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestInProgressException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.RequestInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.InvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestAlreadyProcessedException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.RequestAlreadyProcessedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedCertificateException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.MalformedCertificateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestFailedException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.RequestFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.acmpca.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.acmpca.model.AWSACMPCAException.class));

    public static AWSACMPCAClientBuilder builder() {
        return AWSACMPCAClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ACM-PCA using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSACMPCAClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("acm-pca.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/acmpca/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/acmpca/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a private subordinate certificate authority (CA). You must specify the CA configuration, the revocation
     * configuration, the CA type, and an optional idempotency token. The CA configuration specifies the name of the
     * algorithm and key size to be used to create the CA private key, the type of signing algorithm that the CA uses to
     * sign, and X.500 subject information. The CRL (certificate revocation list) configuration specifies the CRL
     * expiration period in days (the validity period of the CRL), the Amazon S3 bucket that will contain the CRL, and a
     * CNAME alias for the S3 bucket that is included in certificates issued by the CA. If successful, this function
     * returns the Amazon Resource Name (ARN) of the CA.
     * </p>
     * 
     * @param createCertificateAuthorityRequest
     * @return Result of the CreateCertificateAuthority operation returned by the service.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws InvalidPolicyException
     *         The S3 bucket policy is not valid. The policy must give ACM PCA rights to read from and write to the
     *         bucket and find the bucket location.
     * @throws LimitExceededException
     *         An ACM PCA limit has been exceeded. See the exception message returned to determine the limit that was
     *         exceeded.
     * @sample AWSACMPCA.CreateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCertificateAuthorityResult createCertificateAuthority(CreateCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCertificateAuthority(request);
    }

    @SdkInternalApi
    final CreateCertificateAuthorityResult executeCreateCertificateAuthority(CreateCertificateAuthorityRequest createCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(createCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateAuthorityRequest> request = null;
        Response<CreateCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an audit report that lists every time that the your CA private key is used. The report is saved in the
     * Amazon S3 bucket that you specify on input. The <a>IssueCertificate</a> and <a>RevokeCertificate</a> functions
     * use the private key. You can generate a new report every 30 minutes.
     * </p>
     * 
     * @param createCertificateAuthorityAuditReportRequest
     * @return Result of the CreateCertificateAuthorityAuditReport operation returned by the service.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @sample AWSACMPCA.CreateCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCertificateAuthorityAuditReportResult createCertificateAuthorityAuditReport(CreateCertificateAuthorityAuditReportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCertificateAuthorityAuditReport(request);
    }

    @SdkInternalApi
    final CreateCertificateAuthorityAuditReportResult executeCreateCertificateAuthorityAuditReport(
            CreateCertificateAuthorityAuditReportRequest createCertificateAuthorityAuditReportRequest) {

        ExecutionContext executionContext = createExecutionContext(createCertificateAuthorityAuditReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateAuthorityAuditReportRequest> request = null;
        Response<CreateCertificateAuthorityAuditReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateAuthorityAuditReportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCertificateAuthorityAuditReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCertificateAuthorityAuditReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCertificateAuthorityAuditReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the private certificate authority (CA) that you created or started to create by calling the
     * <a>CreateCertificateAuthority</a> function. This action requires that you enter an ARN (Amazon Resource Name) for
     * the private CA that you want to delete. You can find the ARN by calling the <a>ListCertificateAuthorities</a>
     * function. You can delete the CA if you are waiting for it to be created (the <b>Status</b> field of the
     * <a>CertificateAuthority</a> is <code>CREATING</code>) or if the CA has been created but you haven't yet imported
     * the signed certificate (the <b>Status</b> is <code>PENDING_CERTIFICATE</code>) into ACM PCA. If you've already
     * imported the certificate, you cannot delete the CA unless it has been disabled for more than 30 days. To disable
     * a CA, call the <a>UpdateCertificateAuthority</a> function and set the <b>CertificateAuthorityStatus</b> argument
     * to <code>DISABLED</code>.
     * </p>
     * 
     * @param deleteCertificateAuthorityRequest
     * @return Result of the DeleteCertificateAuthority operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @sample AWSACMPCA.DeleteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeleteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCertificateAuthorityResult deleteCertificateAuthority(DeleteCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCertificateAuthority(request);
    }

    @SdkInternalApi
    final DeleteCertificateAuthorityResult executeDeleteCertificateAuthority(DeleteCertificateAuthorityRequest deleteCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateAuthorityRequest> request = null;
        Response<DeleteCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN
     * (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CREATING:</b> ACM PCA is creating your private certificate authority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING_CERTIFICATE:</b> The certificate is pending. You must use your on-premises root or subordinate CA to
     * sign your private CA CSR and then import it into PCA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE:</b> Your private CA is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED:</b> Your private CA has been disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED:</b> Your private CA certificate has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED:</b> Your private CA has failed. Your CA can fail for problems such a network outage or backend AWS
     * failure or other errors. A failed CA can never return to the pending state. You must create a new CA.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeCertificateAuthorityRequest
     * @return Result of the DescribeCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.DescribeCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCertificateAuthorityResult describeCertificateAuthority(DescribeCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificateAuthority(request);
    }

    @SdkInternalApi
    final DescribeCertificateAuthorityResult executeDescribeCertificateAuthority(DescribeCertificateAuthorityRequest describeCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateAuthorityRequest> request = null;
        Response<DescribeCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about a specific audit report created by calling the
     * <a>CreateCertificateAuthorityAuditReport</a> function. Audit information is created every time the certificate
     * authority (CA) private key is used. The private key is used when you call the <a>IssueCertificate</a> function or
     * the <a>RevokeCertificate</a> function.
     * </p>
     * 
     * @param describeCertificateAuthorityAuditReportRequest
     * @return Result of the DescribeCertificateAuthorityAuditReport operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @sample AWSACMPCA.DescribeCertificateAuthorityAuditReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthorityAuditReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCertificateAuthorityAuditReportResult describeCertificateAuthorityAuditReport(DescribeCertificateAuthorityAuditReportRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificateAuthorityAuditReport(request);
    }

    @SdkInternalApi
    final DescribeCertificateAuthorityAuditReportResult executeDescribeCertificateAuthorityAuditReport(
            DescribeCertificateAuthorityAuditReportRequest describeCertificateAuthorityAuditReportRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificateAuthorityAuditReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateAuthorityAuditReportRequest> request = null;
        Response<DescribeCertificateAuthorityAuditReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateAuthorityAuditReportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCertificateAuthorityAuditReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCertificateAuthorityAuditReportResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeCertificateAuthorityAuditReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the
     * <a>IssueCertificate</a> function. You must specify both the ARN of your private CA and the ARN of the issued
     * certificate when calling the <b>GetCertificate</b> function. You can retrieve the certificate if it is in the
     * <b>ISSUED</b> state. You can call the <a>CreateCertificateAuthorityAuditReport</a> function to create a report
     * that contains information about all of the certificates issued and revoked by your private CA.
     * </p>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @sample AWSACMPCA.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCertificateResult getCertificate(GetCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCertificate(request);
    }

    @SdkInternalApi
    final GetCertificateResult executeGetCertificate(GetCertificateRequest getCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificateRequest> request = null;
        Response<GetCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate
     * and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the
     * chain signs the one before it.
     * </p>
     * 
     * @param getCertificateAuthorityCertificateRequest
     * @return Result of the GetCertificateAuthorityCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.GetCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCertificateAuthorityCertificateResult getCertificateAuthorityCertificate(GetCertificateAuthorityCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCertificateAuthorityCertificate(request);
    }

    @SdkInternalApi
    final GetCertificateAuthorityCertificateResult executeGetCertificateAuthorityCertificate(
            GetCertificateAuthorityCertificateRequest getCertificateAuthorityCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCertificateAuthorityCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificateAuthorityCertificateRequest> request = null;
        Response<GetCertificateAuthorityCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificateAuthorityCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCertificateAuthorityCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCertificateAuthorityCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCertificateAuthorityCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created
     * when you call the <a>CreateCertificateAuthority</a> function. Take the CSR to your on-premises X.509
     * infrastructure and sign it by using your root or a subordinate CA. Then import the signed certificate back into
     * ACM PCA by calling the <a>ImportCertificateAuthorityCertificate</a> function. The CSR is returned as a base64
     * PEM-encoded string.
     * </p>
     * 
     * @param getCertificateAuthorityCsrRequest
     * @return Result of the GetCertificateAuthorityCsr operation returned by the service.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.GetCertificateAuthorityCsr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCsr"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCertificateAuthorityCsrResult getCertificateAuthorityCsr(GetCertificateAuthorityCsrRequest request) {
        request = beforeClientExecution(request);
        return executeGetCertificateAuthorityCsr(request);
    }

    @SdkInternalApi
    final GetCertificateAuthorityCsrResult executeGetCertificateAuthorityCsr(GetCertificateAuthorityCsrRequest getCertificateAuthorityCsrRequest) {

        ExecutionContext executionContext = createExecutionContext(getCertificateAuthorityCsrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificateAuthorityCsrRequest> request = null;
        Response<GetCertificateAuthorityCsrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificateAuthorityCsrRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCertificateAuthorityCsrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCertificateAuthorityCsrResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCertificateAuthorityCsrResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports your signed private CA certificate into ACM PCA. Before you can call this function, you must create the
     * private certificate authority by calling the <a>CreateCertificateAuthority</a> function. You must then generate a
     * certificate signing request (CSR) by calling the <a>GetCertificateAuthorityCsr</a> function. Take the CSR to your
     * on-premises CA and use the root certificate or a subordinate certificate to sign it. Create a certificate chain
     * and copy the signed certificate and the certificate chain to your working directory.
     * </p>
     * <note>
     * <p>
     * Your certificate chain must not include the private CA certificate that you are importing.
     * </p>
     * </note> <note>
     * <p>
     * Your on-premises CA certificate must be the last certificate in your chain. The subordinate certificate, if any,
     * that your root CA signed must be next to last. The subordinate certificate signed by the preceding subordinate CA
     * must come next, and so on until your chain is built.
     * </p>
     * </note> <note>
     * <p>
     * The chain must be PEM-encoded.
     * </p>
     * </note>
     * 
     * @param importCertificateAuthorityCertificateRequest
     * @return Result of the ImportCertificateAuthorityCertificate operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws MalformedCertificateException
     *         One or more fields in the certificate are invalid.
     * @throws CertificateMismatchException
     *         The certificate authority certificate you are importing does not comply with conditions specified in the
     *         certificate that signed it.
     * @sample AWSACMPCA.ImportCertificateAuthorityCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ImportCertificateAuthorityCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportCertificateAuthorityCertificateResult importCertificateAuthorityCertificate(ImportCertificateAuthorityCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeImportCertificateAuthorityCertificate(request);
    }

    @SdkInternalApi
    final ImportCertificateAuthorityCertificateResult executeImportCertificateAuthorityCertificate(
            ImportCertificateAuthorityCertificateRequest importCertificateAuthorityCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(importCertificateAuthorityCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCertificateAuthorityCertificateRequest> request = null;
        Response<ImportCertificateAuthorityCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCertificateAuthorityCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(importCertificateAuthorityCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportCertificateAuthorityCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportCertificateAuthorityCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uses your private certificate authority (CA) to issue a client certificate. This function returns the Amazon
     * Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the <a>GetCertificate</a>
     * function and specifying the ARN.
     * </p>
     * <note>
     * <p>
     * You cannot use the ACM <b>ListCertificateAuthorities</b> function to retrieve the ARNs of the certificates that
     * you issue by using ACM PCA.
     * </p>
     * </note>
     * 
     * @param issueCertificateRequest
     * @return Result of the IssueCertificate operation returned by the service.
     * @throws LimitExceededException
     *         An ACM PCA limit has been exceeded. See the exception message returned to determine the limit that was
     *         exceeded.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws MalformedCSRException
     *         The certificate signing request is invalid.
     * @sample AWSACMPCA.IssueCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/IssueCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public IssueCertificateResult issueCertificate(IssueCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeIssueCertificate(request);
    }

    @SdkInternalApi
    final IssueCertificateResult executeIssueCertificate(IssueCertificateRequest issueCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(issueCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IssueCertificateRequest> request = null;
        Response<IssueCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IssueCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(issueCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IssueCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new IssueCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the private certificate authorities that you created by using the <a>CreateCertificateAuthority</a>
     * function.
     * </p>
     * 
     * @param listCertificateAuthoritiesRequest
     * @return Result of the ListCertificateAuthorities operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token specified in the <code>NextToken</code> argument is not valid. Use the token returned from your
     *         previous call to <a>ListCertificateAuthorities</a>.
     * @sample AWSACMPCA.ListCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCertificateAuthoritiesResult listCertificateAuthorities(ListCertificateAuthoritiesRequest request) {
        request = beforeClientExecution(request);
        return executeListCertificateAuthorities(request);
    }

    @SdkInternalApi
    final ListCertificateAuthoritiesResult executeListCertificateAuthorities(ListCertificateAuthoritiesRequest listCertificateAuthoritiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCertificateAuthoritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificateAuthoritiesRequest> request = null;
        Response<ListCertificateAuthoritiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificateAuthoritiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCertificateAuthoritiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCertificateAuthoritiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCertificateAuthoritiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify
     * and organize your CAs. Each tag consists of a key and an optional value. Call the <a>TagCertificateAuthority</a>
     * function to add one or more tags to your CA. Call the <a>UntagCertificateAuthority</a> function to remove tags.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSACMPCA.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListTags" target="_top">AWS API
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
     * Revokes a certificate that you issued by calling the <a>IssueCertificate</a> function. If you enable a
     * certificate revocation list (CRL) when you create or update your private CA, information about the revoked
     * certificates will be included in the CRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more
     * information about revocation, see the <a>CrlConfiguration</a> structure. ACM PCA also writes revocation
     * information to the audit report. For more information, see <a>CreateCertificateAuthorityAuditReport</a>.
     * </p>
     * 
     * @param revokeCertificateRequest
     * @return Result of the RevokeCertificate operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws RequestAlreadyProcessedException
     *         Your request has already been completed.
     * @throws RequestInProgressException
     *         Your request is already in progress.
     * @throws RequestFailedException
     *         The request has failed for an unspecified reason.
     * @sample AWSACMPCA.RevokeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RevokeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RevokeCertificateResult revokeCertificate(RevokeCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeCertificate(request);
    }

    @SdkInternalApi
    final RevokeCertificateResult executeRevokeCertificate(RevokeCertificateRequest revokeCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeCertificateRequest> request = null;
        Response<RevokeCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon
     * Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if
     * you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs
     * if you want to filter for a common relationship among those CAs. To remove one or more tags, use the
     * <a>UntagCertificateAuthority</a> function. Call the <a>ListTags</a> function to see what tags are associated with
     * your CA.
     * </p>
     * 
     * @param tagCertificateAuthorityRequest
     * @return Result of the TagCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         The tag associated with the CA is not valid. The invalid argument is contained in the message field.
     * @throws TooManyTagsException
     *         You can associate up to 50 tags with a private CA. Exception information is contained in the exception
     *         message field.
     * @sample AWSACMPCA.TagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/TagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TagCertificateAuthorityResult tagCertificateAuthority(TagCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeTagCertificateAuthority(request);
    }

    @SdkInternalApi
    final TagCertificateAuthorityResult executeTagCertificateAuthority(TagCertificateAuthorityRequest tagCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(tagCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagCertificateAuthorityRequest> request = null;
        Response<TagCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(tagCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TagCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value
     * portion of the tag when calling this function, the tag will be removed regardless of value. If you specify a
     * value, the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the
     * <a>TagCertificateAuthority</a>. Call the <a>ListTags</a> function to see what tags are associated with your CA.
     * </p>
     * 
     * @param untagCertificateAuthorityRequest
     * @return Result of the UntagCertificateAuthority operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         The tag associated with the CA is not valid. The invalid argument is contained in the message field.
     * @sample AWSACMPCA.UntagCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UntagCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UntagCertificateAuthorityResult untagCertificateAuthority(UntagCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeUntagCertificateAuthority(request);
    }

    @SdkInternalApi
    final UntagCertificateAuthorityResult executeUntagCertificateAuthority(UntagCertificateAuthorityRequest untagCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(untagCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagCertificateAuthorityRequest> request = null;
        Response<UntagCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(untagCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UntagCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the <b>
     * <code>ACTIVE</code> </b> or <b> <code>DISABLED</code> </b> state before you can update it. You can disable a
     * private CA that is in the <b> <code>ACTIVE</code> </b> state or make a CA that is in the <b>
     * <code>DISABLED</code> </b> state active again.
     * </p>
     * 
     * @param updateCertificateAuthorityRequest
     * @return Result of the UpdateCertificateAuthority operation returned by the service.
     * @throws ConcurrentModificationException
     *         A previous update to your private CA is still ongoing.
     * @throws ResourceNotFoundException
     *         A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.
     * @throws InvalidArgsException
     *         One or more of the specified arguments was not valid.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidStateException
     *         The private CA is in a state during which a report cannot be generated.
     * @throws InvalidPolicyException
     *         The S3 bucket policy is not valid. The policy must give ACM PCA rights to read from and write to the
     *         bucket and find the bucket location.
     * @sample AWSACMPCA.UpdateCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UpdateCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCertificateAuthorityResult updateCertificateAuthority(UpdateCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCertificateAuthority(request);
    }

    @SdkInternalApi
    final UpdateCertificateAuthorityResult executeUpdateCertificateAuthority(UpdateCertificateAuthorityRequest updateCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCertificateAuthorityRequest> request = null;
        Response<UpdateCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCertificateAuthorityResultJsonUnmarshaller());
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
