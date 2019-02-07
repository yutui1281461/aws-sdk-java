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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 characters
     * in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a>.
     * </p>
     */
    private java.nio.ByteBuffer zipFile;
    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS Region where you are creating the Lambda function.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     */
    private String s3ObjectVersion;
    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     */
    private Boolean publish;
    /**
     * <p>
     * This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a
     * version as an atomic operation. It will do all necessary computation and validation of your code but will not
     * upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of
     * the provided code will also be computed and returned in the response.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 characters
     * in length.
     * </p>
     * 
     * @param functionName
     *        The existing Lambda function name whose code you want to replace.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 characters
     * in length.
     * </p>
     * 
     * @return The existing Lambda function name whose code you want to replace.</p>
     *         <p>
     *         You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 characters
     * in length.
     * </p>
     * 
     * @param functionName
     *        The existing Lambda function name whose code you want to replace.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        The contents of your zip file containing your deployment package. If you are using the web API directly,
     *        the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the
     *        SDKs or CLI will do the encoding for you. For more information about creating a .zip file, see <a href=
     *        "http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     *        >Execution Permissions</a>.
     */

    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The contents of your zip file containing your deployment package. If you are using the web API directly,
     *         the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the
     *         SDKs or CLI will do the encoding for you. For more information about creating a .zip file, see <a href=
     *         "http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     *         >Execution Permissions</a>.
     */

    public java.nio.ByteBuffer getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        The contents of your zip file containing your deployment package. If you are using the web API directly,
     *        the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the
     *        SDKs or CLI will do the encoding for you. For more information about creating a .zip file, see <a href=
     *        "http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     *        >Execution Permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withZipFile(java.nio.ByteBuffer zipFile) {
        setZipFile(zipFile);
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS Region where you are creating the Lambda function.
     * </p>
     * 
     * @param s3Bucket
     *        Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must
     *        reside in the same AWS Region where you are creating the Lambda function.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS Region where you are creating the Lambda function.
     * </p>
     * 
     * @return Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must
     *         reside in the same AWS Region where you are creating the Lambda function.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS Region where you are creating the Lambda function.
     * </p>
     * 
     * @param s3Bucket
     *        Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must
     *        reside in the same AWS Region where you are creating the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 object (the deployment package) key name you want to upload.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     * 
     * @return The Amazon S3 object (the deployment package) key name you want to upload.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 object (the deployment package) key name you want to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The Amazon S3 object (the deployment package) version you want to upload.
     */

    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     * 
     * @return The Amazon S3 object (the deployment package) version you want to upload.
     */

    public String getS3ObjectVersion() {
        return this.s3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The Amazon S3 object (the deployment package) version you want to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withS3ObjectVersion(String s3ObjectVersion) {
        setS3ObjectVersion(s3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *        version as an atomic operation.
     */

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *        version as an atomic operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withPublish(Boolean publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean isPublish() {
        return this.publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a
     * version as an atomic operation. It will do all necessary computation and validation of your code but will not
     * upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of
     * the provided code will also be computed and returned in the response.
     * </p>
     * 
     * @param dryRun
     *        This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and
     *        publish a version as an atomic operation. It will do all necessary computation and validation of your code
     *        but will not upload it or a publish a version. Each time this operation is invoked, the
     *        <code>CodeSha256</code> hash value of the provided code will also be computed and returned in the
     *        response.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a
     * version as an atomic operation. It will do all necessary computation and validation of your code but will not
     * upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of
     * the provided code will also be computed and returned in the response.
     * </p>
     * 
     * @return This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and
     *         publish a version as an atomic operation. It will do all necessary computation and validation of your
     *         code but will not upload it or a publish a version. Each time this operation is invoked, the
     *         <code>CodeSha256</code> hash value of the provided code will also be computed and returned in the
     *         response.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a
     * version as an atomic operation. It will do all necessary computation and validation of your code but will not
     * upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of
     * the provided code will also be computed and returned in the response.
     * </p>
     * 
     * @param dryRun
     *        This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and
     *        publish a version as an atomic operation. It will do all necessary computation and validation of your code
     *        but will not upload it or a publish a version. Each time this operation is invoked, the
     *        <code>CodeSha256</code> hash value of the provided code will also be computed and returned in the
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a
     * version as an atomic operation. It will do all necessary computation and validation of your code but will not
     * upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of
     * the provided code will also be computed and returned in the response.
     * </p>
     * 
     * @return This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and
     *         publish a version as an atomic operation. It will do all necessary computation and validation of your
     *         code but will not upload it or a publish a version. Each time this operation is invoked, the
     *         <code>CodeSha256</code> hash value of the provided code will also be computed and returned in the
     *         response.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     * 
     * @param revisionId
     *        An optional value you can use to ensure you are updating the latest update of the function version or
     *        alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *        function or alias, it will fail with an error message, advising you to retrieve the latest function
     *        version or alias <code>RevisionID</code> using either or .
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     * 
     * @return An optional value you can use to ensure you are updating the latest update of the function version or
     *         alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *         function or alias, it will fail with an error message, advising you to retrieve the latest function
     *         version or alias <code>RevisionID</code> using either or .
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     * 
     * @param revisionId
     *        An optional value you can use to ensure you are updating the latest update of the function version or
     *        alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *        function or alias, it will fail with an error message, advising you to retrieve the latest function
     *        version or alias <code>RevisionID</code> using either or .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getZipFile() != null)
            sb.append("ZipFile: ").append(getZipFile()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getS3ObjectVersion() != null)
            sb.append("S3ObjectVersion: ").append(getS3ObjectVersion()).append(",");
        if (getPublish() != null)
            sb.append("Publish: ").append(getPublish()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionCodeRequest == false)
            return false;
        UpdateFunctionCodeRequest other = (UpdateFunctionCodeRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null)
            return false;
        if (other.getS3ObjectVersion() != null && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false)
            return false;
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionCodeRequest clone() {
        return (UpdateFunctionCodeRequest) super.clone();
    }

}
