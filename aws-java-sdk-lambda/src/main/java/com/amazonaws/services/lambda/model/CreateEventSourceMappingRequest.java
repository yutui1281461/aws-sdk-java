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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSourceMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event source. Any
     * record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends on the
     * <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your Lambda function as
     * JSON.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The Lambda function to invoke when AWS Lambda detects an event on the stream.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is true.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records. The default is 100 records.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     * >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is
     * supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis
     * streams</a>.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than the current trim horizon, the iterator
     * returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * </p>
     */
    private java.util.Date startingPositionTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event source. Any
     * record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends on the
     * <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your Lambda function as
     * JSON.
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event
     *        source. Any record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends
     *        on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your
     *        Lambda function as JSON.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event source. Any
     * record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends on the
     * <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your Lambda function as
     * JSON.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event
     *         source. Any record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends
     *         on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your
     *         Lambda function as JSON.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event source. Any
     * record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends on the
     * <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your Lambda function as
     * JSON.
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon DynamoDB stream that is the event
     *        source. Any record added to this stream could cause AWS Lambda to invoke your Lambda function, it depends
     *        on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon Kinesis event, containing records, to your
     *        Lambda function as JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The Lambda function to invoke when AWS Lambda detects an event on the stream.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function to invoke when AWS Lambda detects an event on the stream.</p>
     *        <p>
     *        You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *        </p>
     *        <p>
     *        If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with
     *        function version or alias name as suffix). For more information about versioning, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning
     *        and Aliases</a>
     *        </p>
     *        <p>
     *        AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     *        <code>account-id:Thumbnail</code>).
     *        </p>
     *        <p>
     *        Note that the length constraint applies only to the ARN. If you specify only the function name, it is
     *        limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The Lambda function to invoke when AWS Lambda detects an event on the stream.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 characters in length.
     * </p>
     * 
     * @return The Lambda function to invoke when AWS Lambda detects an event on the stream.</p>
     *         <p>
     *         You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         </p>
     *         <p>
     *         If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with
     *         function version or alias name as suffix). For more information about versioning, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning
     *         and Aliases</a>
     *         </p>
     *         <p>
     *         AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>).
     *         </p>
     *         <p>
     *         Note that the length constraint applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The Lambda function to invoke when AWS Lambda detects an event on the stream.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function to invoke when AWS Lambda detects an event on the stream.</p>
     *        <p>
     *        You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *        </p>
     *        <p>
     *        If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with
     *        function version or alias name as suffix). For more information about versioning, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning
     *        and Aliases</a>
     *        </p>
     *        <p>
     *        AWS Lambda also allows you to specify only the function name with the account ID qualifier (for example,
     *        <code>account-id:Thumbnail</code>).
     *        </p>
     *        <p>
     *        Note that the length constraint applies only to the ARN. If you specify only the function name, it is
     *        limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is true.
     * </p>
     * 
     * @param enabled
     *        Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is
     *        true.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is true.
     * </p>
     * 
     * @return Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is
     *         true.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is true.
     * </p>
     * 
     * @param enabled
     *        Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is
     *        true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is true.
     * </p>
     * 
     * @return Indicates whether AWS Lambda should begin polling the event source. By default, <code>Enabled</code> is
     *         true.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records. The default is 100 records.
     * </p>
     * 
     * @param batchSize
     *        The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking
     *        your function. Your function receives an event with all the retrieved records. The default is 100 records.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records. The default is 100 records.
     * </p>
     * 
     * @return The largest number of records that AWS Lambda will retrieve from your event source at the time of
     *         invoking your function. Your function receives an event with all the retrieved records. The default is
     *         100 records.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records. The default is 100 records.
     * </p>
     * 
     * @param batchSize
     *        The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking
     *        your function. Your function receives an event with all the retrieved records. The default is 100 records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     * >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is
     * supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis
     * streams</a>.
     * </p>
     * 
     * @param startingPosition
     *        The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *        >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     *        >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code>
     *        value is supported only for <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * @see EventSourcePosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     * >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is
     * supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis
     * streams</a>.
     * </p>
     * 
     * @return The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *         >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     *         >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code>
     *         value is supported only for <a
     *         href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * @see EventSourcePosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     * >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is
     * supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis
     * streams</a>.
     * </p>
     * 
     * @param startingPosition
     *        The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *        >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     *        >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code>
     *        value is supported only for <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingRequest withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     * >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is
     * supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis
     * streams</a>.
     * </p>
     * 
     * @param startingPosition
     *        The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *        >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     *        >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code>
     *        value is supported only for <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * @see EventSourcePosition
     */

    public void setStartingPosition(EventSourcePosition startingPosition) {
        withStartingPosition(startingPosition);
    }

    /**
     * <p>
     * The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     * >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is
     * supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis
     * streams</a>.
     * </p>
     * 
     * @param startingPosition
     *        The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *        >GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html"
     *        >GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code>
     *        value is supported only for <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingRequest withStartingPosition(EventSourcePosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than the current trim horizon, the iterator
     * returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        The timestamp of the data record from which to start reading. Used with <a href=
     *        "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *        >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     *        returned is for the next (later) record. If the timestamp is older than the current trim horizon, the
     *        iterator returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     */

    public void setStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        this.startingPositionTimestamp = startingPositionTimestamp;
    }

    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than the current trim horizon, the iterator
     * returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * </p>
     * 
     * @return The timestamp of the data record from which to start reading. Used with <a href=
     *         "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *         >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     *         returned is for the next (later) record. If the timestamp is older than the current trim horizon, the
     *         iterator returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     *         href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     */

    public java.util.Date getStartingPositionTimestamp() {
        return this.startingPositionTimestamp;
    }

    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     * >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than the current trim horizon, the iterator
     * returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        The timestamp of the data record from which to start reading. Used with <a href=
     *        "http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType"
     *        >shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator
     *        returned is for the next (later) record. If the timestamp is older than the current trim horizon, the
     *        iterator returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        setStartingPositionTimestamp(startingPositionTimestamp);
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
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getStartingPositionTimestamp() != null)
            sb.append("StartingPositionTimestamp: ").append(getStartingPositionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSourceMappingRequest == false)
            return false;
        CreateEventSourceMappingRequest other = (CreateEventSourceMappingRequest) obj;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getStartingPositionTimestamp() == null ^ this.getStartingPositionTimestamp() == null)
            return false;
        if (other.getStartingPositionTimestamp() != null && other.getStartingPositionTimestamp().equals(this.getStartingPositionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getStartingPositionTimestamp() == null) ? 0 : getStartingPositionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSourceMappingRequest clone() {
        return (CreateEventSourceMappingRequest) super.clone();
    }

}
