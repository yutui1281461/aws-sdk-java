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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda API
     * operations, such as <a>Invoke</a>. Note that the length constraint applies only to the ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to "dotnetcore1.0". To use the
     * .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     */
    private String runtime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     */
    private String handler;
    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     */
    private FunctionCode code;
    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     */
    private Integer memorySize;
    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     */
    private Boolean publish;
    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * For more information, see <a>dlq</a>.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;

    private Environment environment;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     */
    private String kMSKeyArn;
    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     */
    private TracingConfig tracingConfig;
    /**
     * <p>
     * The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda
     * Developer Guide</b>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda API
     * operations, such as <a>Invoke</a>. Note that the length constraint applies only to the ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name you want to assign to the function you are uploading. The function names appear in the console
     *        and are returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other
     *        AWS Lambda API operations, such as <a>Invoke</a>. Note that the length constraint applies only to the ARN.
     *        If you specify only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda API
     * operations, such as <a>Invoke</a>. Note that the length constraint applies only to the ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @return The name you want to assign to the function you are uploading. The function names appear in the console
     *         and are returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other
     *         AWS Lambda API operations, such as <a>Invoke</a>. Note that the length constraint applies only to the
     *         ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda API
     * operations, such as <a>Invoke</a>. Note that the length constraint applies only to the ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name you want to assign to the function you are uploading. The function names appear in the console
     *        and are returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other
     *        AWS Lambda API operations, such as <a>Invoke</a>. Note that the length constraint applies only to the ARN.
     *        If you specify only the function name, it is limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to "dotnetcore1.0". To use the
     * .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to
     *        "dotnetcore1.0". To use the .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to "dotnetcore1.0". To use the
     * .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @return The runtime environment for the Lambda function you are uploading.</p>
     *         <p>
     *         To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *         value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *         runtime v4.3, set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to
     *         "dotnetcore1.0". To use the .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     *         </p>
     *         <note>
     *         <p>
     *         Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *         runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *         will result in an invalid parameter error being returned. Note that you will have to follow this
     *         procedure for each region that contains functions written in the Node v0.10.42 runtime.
     *         </p>
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to "dotnetcore1.0". To use the
     * .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to
     *        "dotnetcore1.0". To use the .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CreateFunctionRequest withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to "dotnetcore1.0". To use the
     * .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to
     *        "dotnetcore1.0". To use the .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @see Runtime
     */

    public void setRuntime(Runtime runtime) {
        withRuntime(runtime);
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to "dotnetcore1.0". To use the
     * .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the .NET Core runtime v1.0, set the value to
     *        "dotnetcore1.0". To use the .NET Core runtime v2.0, set the value to "dotnetcore2.0".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CreateFunctionRequest withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to
     *        access any other Amazon Web Services (AWS) resources. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to
     *         access any other Amazon Web Services (AWS) resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to
     *        access any other Amazon Web Services (AWS) resources. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     * 
     * @param handler
     *        The function within your code that Lambda calls to begin execution. For Node.js, it is the
     *        <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     *        <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *        Function Handler (Java)</a>.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     * 
     * @return The function within your code that Lambda calls to begin execution. For Node.js, it is the
     *         <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     *         <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *         Function Handler (Java)</a>.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     * 
     * @param handler
     *        The function within your code that Lambda calls to begin execution. For Node.js, it is the
     *        <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     *        <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *        Function Handler (Java)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withHandler(String handler) {
        setHandler(handler);
        return this;
    }

    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     * 
     * @param code
     *        The code for the Lambda function.
     */

    public void setCode(FunctionCode code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     * 
     * @return The code for the Lambda function.
     */

    public FunctionCode getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     * 
     * @param code
     *        The code for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withCode(FunctionCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @param description
     *        A short, user-defined function description. Lambda does not use this value. Assign a meaningful
     *        description as you see fit.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @return A short, user-defined function description. Lambda does not use this value. Assign a meaningful
     *         description as you see fit.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @param description
     *        A short, user-defined function description. Lambda does not use this value. Assign a meaningful
     *        description as you see fit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the function. Because the execution time has
     *        cost implications, we recommend you set this value based on your expected execution time. The default is 3
     *        seconds.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     * 
     * @return The function execution time at which Lambda should terminate the function. Because the execution time has
     *         cost implications, we recommend you set this value based on your expected execution time. The default is
     *         3 seconds.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the function. Because the execution time has
     *        cost implications, we recommend you set this value based on your expected execution time. The default is 3
     *        seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the
     *        amount of CPU and memory allocated to your function. Your function use-case determines your CPU and memory
     *        requirements. For example, a database operation might need less memory compared to an image processing
     *        function. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @return The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the
     *         amount of CPU and memory allocated to your function. Your function use-case determines your CPU and
     *         memory requirements. For example, a database operation might need less memory compared to an image
     *         processing function. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the
     *        amount of CPU and memory allocated to your function. Your function use-case determines your CPU and memory
     *        requirements. For example, a database operation might need less memory compared to an image processing
     *        function. The default value is 128 MB. The value must be a multiple of 64 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *        version as an atomic operation.
     */

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *        version as an atomic operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withPublish(Boolean publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean isPublish() {
        return this.publish;
    }

    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     * 
     * @param vpcConfig
     *        If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of
     *        security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one
     *        security group and one subnet ID.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     * 
     * @return If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of
     *         security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one
     *         security group and one subnet ID.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     * 
     * @param vpcConfig
     *        If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of
     *        security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one
     *        security group and one subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * For more information, see <a>dlq</a>.
     * </p>
     * 
     * @param deadLetterConfig
     *        The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS
     *        topic. For more information, see <a>dlq</a>.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * For more information, see <a>dlq</a>.
     * </p>
     * 
     * @return The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon
     *         SNS topic. For more information, see <a>dlq</a>.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * For more information, see <a>dlq</a>.
     * </p>
     * 
     * @param deadLetterConfig
     *        The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS
     *        topic. For more information, see <a>dlq</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * @param environment
     */

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /**
     * @return
     */

    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * @param environment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withEnvironment(Environment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *        not provided, AWS Lambda will use a default service key.
     */

    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *         not provided, AWS Lambda will use a default service key.
     */

    public String getKMSKeyArn() {
        return this.kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *        not provided, AWS Lambda will use a default service key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withKMSKeyArn(String kMSKeyArn) {
        setKMSKeyArn(kMSKeyArn);
        return this;
    }

    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     * 
     * @param tracingConfig
     *        The parent object that contains your function's tracing settings.
     */

    public void setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     * 
     * @return The parent object that contains your function's tracing settings.
     */

    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     * 
     * @param tracingConfig
     *        The parent object that contains your function's tracing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTracingConfig(TracingConfig tracingConfig) {
        setTracingConfig(tracingConfig);
        return this;
    }

    /**
     * <p>
     * The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda
     * Developer Guide</b>.
     * </p>
     * 
     * @return The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the
     *         <b>AWS Lambda Developer Guide</b>.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda
     * Developer Guide</b>.
     * </p>
     * 
     * @param tags
     *        The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS
     *        Lambda Developer Guide</b>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda
     * Developer Guide</b>.
     * </p>
     * 
     * @param tags
     *        The list of tags (key-value pairs) assigned to the new function. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS
     *        Lambda Developer Guide</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateFunctionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getHandler() != null)
            sb.append("Handler: ").append(getHandler()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMemorySize() != null)
            sb.append("MemorySize: ").append(getMemorySize()).append(",");
        if (getPublish() != null)
            sb.append("Publish: ").append(getPublish()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getKMSKeyArn() != null)
            sb.append("KMSKeyArn: ").append(getKMSKeyArn()).append(",");
        if (getTracingConfig() != null)
            sb.append("TracingConfig: ").append(getTracingConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFunctionRequest == false)
            return false;
        CreateFunctionRequest other = (CreateFunctionRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMemorySize() == null ^ this.getMemorySize() == null)
            return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false)
            return false;
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getKMSKeyArn() == null ^ this.getKMSKeyArn() == null)
            return false;
        if (other.getKMSKeyArn() != null && other.getKMSKeyArn().equals(this.getKMSKeyArn()) == false)
            return false;
        if (other.getTracingConfig() == null ^ this.getTracingConfig() == null)
            return false;
        if (other.getTracingConfig() != null && other.getTracingConfig().equals(this.getTracingConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyArn() == null) ? 0 : getKMSKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTracingConfig() == null) ? 0 : getTracingConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionRequest clone() {
        return (CreateFunctionRequest) super.clone();
    }

}
