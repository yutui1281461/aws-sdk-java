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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     * sqlserver.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an
     * argument.
     * </p>
     */
    private String extraConnectionAttributes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     */
    private String sslMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The external table definition.
     * </p>
     */
    private String externalTableDefinition;
    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using Object
     * Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private DynamoDbSettings dynamoDbSettings;
    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring">Extra
     * Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database Migration Service
     * User Guide.</i>
     * </p>
     */
    private S3Settings s3Settings;
    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the default) or do
     * not use to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     * </p>
     * <p>
     * JSON syntax:
     * </p>
     * <p>
     * { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     * </p>
     */
    private DmsTransferSettings dmsTransferSettings;
    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the configuration properties section in <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a Target for
     * AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private MongoDbSettings mongoDbSettings;
    /**
     * <p>
     * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the
     * available settings, see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     * >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     * Guide.</i>
     * </p>
     */
    private KinesisSettings kinesisSettings;
    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings,
     * see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     * Migration User Guide.</i>
     * </p>
     */
    private ElasticsearchSettings elasticsearchSettings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *         digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public ModifyEndpointRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        withEndpointType(endpointType);
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public ModifyEndpointRequest withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     * sqlserver.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     *        postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb,
     *        mongodb, and sqlserver.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     * sqlserver.
     * </p>
     * 
     * @return The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     *         postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb,
     *         mongodb, and sqlserver.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     * sqlserver.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     *        postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb,
     *        mongodb, and sqlserver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to login to the endpoint database.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @return The user name to be used to login to the endpoint database.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to login to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @param password
     *        The password to be used to login to the endpoint database.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @return The password to be used to login to the endpoint database.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @param password
     *        The password to be used to login to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @return The name of the server where the endpoint database resides.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @param port
     *        The port used by the endpoint database.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @return The port used by the endpoint database.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @param port
     *        The port used by the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @return The name of the endpoint database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an
     * argument.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection. To reset this parameter, pass the empty string ("")
     *        as an argument.
     */

    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an
     * argument.
     * </p>
     * 
     * @return Additional attributes associated with the connection. To reset this parameter, pass the empty string ("")
     *         as an argument.
     */

    public String getExtraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an
     * argument.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection. To reset this parameter, pass the empty string ("")
     *        as an argument.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withExtraConnectionAttributes(String extraConnectionAttributes) {
        setExtraConnectionAttributes(extraConnectionAttributes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @return The SSL mode to be used.</p>
     *         <p>
     *         SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *         </p>
     *         <p>
     *         The default value is none.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public ModifyEndpointRequest withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(DmsSslModeValue sslMode) {
        withSslMode(sslMode);
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public ModifyEndpointRequest withSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @param externalTableDefinition
     *        The external table definition.
     */

    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @return The external table definition.
     */

    public String getExternalTableDefinition() {
        return this.externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @param externalTableDefinition
     *        The external table definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withExternalTableDefinition(String externalTableDefinition) {
        setExternalTableDefinition(externalTableDefinition);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using Object
     * Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param dynamoDbSettings
     *        Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     *        settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using
     *        Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     */

    public void setDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using Object
     * Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     *         settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using
     *         Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     */

    public DynamoDbSettings getDynamoDbSettings() {
        return this.dynamoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using Object
     * Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param dynamoDbSettings
     *        Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     *        settings, see <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html">Using
     *        Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        setDynamoDbSettings(dynamoDbSettings);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring">Extra
     * Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database Migration Service
     * User Guide.</i>
     * </p>
     * 
     * @param s3Settings
     *        Settings in JSON format for the target Amazon S3 endpoint. For more information about the available
     *        settings, see <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     *        >Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database
     *        Migration Service User Guide.</i>
     */

    public void setS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring">Extra
     * Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database Migration Service
     * User Guide.</i>
     * </p>
     * 
     * @return Settings in JSON format for the target Amazon S3 endpoint. For more information about the available
     *         settings, see <a
     *         href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     *         >Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database
     *         Migration Service User Guide.</i>
     */

    public S3Settings getS3Settings() {
        return this.s3Settings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring">Extra
     * Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database Migration Service
     * User Guide.</i>
     * </p>
     * 
     * @param s3Settings
     *        Settings in JSON format for the target Amazon S3 endpoint. For more information about the available
     *        settings, see <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     *        >Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS</a> in the <i>AWS Database
     *        Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withS3Settings(S3Settings s3Settings) {
        setS3Settings(s3Settings);
        return this;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the default) or do
     * not use to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     * </p>
     * <p>
     * JSON syntax:
     * </p>
     * <p>
     * { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     * </p>
     * 
     * @param dmsTransferSettings
     *        The settings in JSON format for the DMS transfer type of source endpoint. </p>
     *        <p>
     *        Attributes include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BucketName - The name of the S3 bucket to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the
     *        default) or do not use to leave the files uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     *        </p>
     *        <p>
     *        JSON syntax:
     *        </p>
     *        <p>
     *        { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     */

    public void setDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        this.dmsTransferSettings = dmsTransferSettings;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the default) or do
     * not use to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     * </p>
     * <p>
     * JSON syntax:
     * </p>
     * <p>
     * { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     * </p>
     * 
     * @return The settings in JSON format for the DMS transfer type of source endpoint. </p>
     *         <p>
     *         Attributes include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BucketName - The name of the S3 bucket to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the
     *         default) or do not use to leave the files uncompressed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     *         </p>
     *         <p>
     *         JSON syntax:
     *         </p>
     *         <p>
     *         { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     */

    public DmsTransferSettings getDmsTransferSettings() {
        return this.dmsTransferSettings;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the default) or do
     * not use to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     * </p>
     * <p>
     * JSON syntax:
     * </p>
     * <p>
     * { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     * </p>
     * 
     * @param dmsTransferSettings
     *        The settings in JSON format for the DMS transfer type of source endpoint. </p>
     *        <p>
     *        Attributes include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BucketName - The name of the S3 bucket to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the
     *        default) or do not use to leave the files uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string
     *        </p>
     *        <p>
     *        JSON syntax:
     *        </p>
     *        <p>
     *        { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        setDmsTransferSettings(dmsTransferSettings);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the configuration properties section in <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a Target for
     * AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param mongoDbSettings
     *        Settings in JSON format for the source MongoDB endpoint. For more information about the available
     *        settings, see the configuration properties section in <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a Target
     *        for AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     */

    public void setMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the configuration properties section in <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a Target for
     * AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return Settings in JSON format for the source MongoDB endpoint. For more information about the available
     *         settings, see the configuration properties section in <a
     *         href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a
     *         Target for AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     */

    public MongoDbSettings getMongoDbSettings() {
        return this.mongoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the configuration properties section in <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a Target for
     * AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param mongoDbSettings
     *        Settings in JSON format for the source MongoDB endpoint. For more information about the available
     *        settings, see the configuration properties section in <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using MongoDB as a Target
     *        for AWS Database Migration Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withMongoDbSettings(MongoDbSettings mongoDbSettings) {
        setMongoDbSettings(mongoDbSettings);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the
     * available settings, see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     * >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     * Guide.</i>
     * </p>
     * 
     * @param kinesisSettings
     *        Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about
     *        the available settings, see <a href=
     *        "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     *        >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     *        Guide.</i>
     */

    public void setKinesisSettings(KinesisSettings kinesisSettings) {
        this.kinesisSettings = kinesisSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the
     * available settings, see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     * >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     * Guide.</i>
     * </p>
     * 
     * @return Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about
     *         the available settings, see <a href=
     *         "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     *         >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     *         Guide.</i>
     */

    public KinesisSettings getKinesisSettings() {
        return this.kinesisSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the
     * available settings, see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     * >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     * Guide.</i>
     * </p>
     * 
     * @param kinesisSettings
     *        Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about
     *        the available settings, see <a href=
     *        "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping "
     *        >Using Object Mapping to Migrate Data to a Kinesis Data Stream</a> in the <i>AWS Database Migration User
     *        Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withKinesisSettings(KinesisSettings kinesisSettings) {
        setKinesisSettings(kinesisSettings);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings,
     * see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     * Migration User Guide.</i>
     * </p>
     * 
     * @param elasticsearchSettings
     *        Settings in JSON format for the target Elasticsearch endpoint. For more information about the available
     *        settings, see <a href=
     *        "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     *        >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     *        Migration User Guide.</i>
     */

    public void setElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        this.elasticsearchSettings = elasticsearchSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings,
     * see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     * Migration User Guide.</i>
     * </p>
     * 
     * @return Settings in JSON format for the target Elasticsearch endpoint. For more information about the available
     *         settings, see <a href=
     *         "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     *         >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     *         Migration User Guide.</i>
     */

    public ElasticsearchSettings getElasticsearchSettings() {
        return this.elasticsearchSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings,
     * see <a href=
     * "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     * Migration User Guide.</i>
     * </p>
     * 
     * @param elasticsearchSettings
     *        Settings in JSON format for the target Elasticsearch endpoint. For more information about the available
     *        settings, see <a href=
     *        "http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     *        >Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS</a> in the <i>AWS Database
     *        Migration User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        setElasticsearchSettings(elasticsearchSettings);
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: ").append(getExtraConnectionAttributes()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: ").append(getExternalTableDefinition()).append(",");
        if (getDynamoDbSettings() != null)
            sb.append("DynamoDbSettings: ").append(getDynamoDbSettings()).append(",");
        if (getS3Settings() != null)
            sb.append("S3Settings: ").append(getS3Settings()).append(",");
        if (getDmsTransferSettings() != null)
            sb.append("DmsTransferSettings: ").append(getDmsTransferSettings()).append(",");
        if (getMongoDbSettings() != null)
            sb.append("MongoDbSettings: ").append(getMongoDbSettings()).append(",");
        if (getKinesisSettings() != null)
            sb.append("KinesisSettings: ").append(getKinesisSettings()).append(",");
        if (getElasticsearchSettings() != null)
            sb.append("ElasticsearchSettings: ").append(getElasticsearchSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEndpointRequest == false)
            return false;
        ModifyEndpointRequest other = (ModifyEndpointRequest) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getExtraConnectionAttributes() == null ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getExternalTableDefinition() == null ^ this.getExternalTableDefinition() == null)
            return false;
        if (other.getExternalTableDefinition() != null && other.getExternalTableDefinition().equals(this.getExternalTableDefinition()) == false)
            return false;
        if (other.getDynamoDbSettings() == null ^ this.getDynamoDbSettings() == null)
            return false;
        if (other.getDynamoDbSettings() != null && other.getDynamoDbSettings().equals(this.getDynamoDbSettings()) == false)
            return false;
        if (other.getS3Settings() == null ^ this.getS3Settings() == null)
            return false;
        if (other.getS3Settings() != null && other.getS3Settings().equals(this.getS3Settings()) == false)
            return false;
        if (other.getDmsTransferSettings() == null ^ this.getDmsTransferSettings() == null)
            return false;
        if (other.getDmsTransferSettings() != null && other.getDmsTransferSettings().equals(this.getDmsTransferSettings()) == false)
            return false;
        if (other.getMongoDbSettings() == null ^ this.getMongoDbSettings() == null)
            return false;
        if (other.getMongoDbSettings() != null && other.getMongoDbSettings().equals(this.getMongoDbSettings()) == false)
            return false;
        if (other.getKinesisSettings() == null ^ this.getKinesisSettings() == null)
            return false;
        if (other.getKinesisSettings() != null && other.getKinesisSettings().equals(this.getKinesisSettings()) == false)
            return false;
        if (other.getElasticsearchSettings() == null ^ this.getElasticsearchSettings() == null)
            return false;
        if (other.getElasticsearchSettings() != null && other.getElasticsearchSettings().equals(this.getElasticsearchSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition().hashCode());
        hashCode = prime * hashCode + ((getDynamoDbSettings() == null) ? 0 : getDynamoDbSettings().hashCode());
        hashCode = prime * hashCode + ((getS3Settings() == null) ? 0 : getS3Settings().hashCode());
        hashCode = prime * hashCode + ((getDmsTransferSettings() == null) ? 0 : getDmsTransferSettings().hashCode());
        hashCode = prime * hashCode + ((getMongoDbSettings() == null) ? 0 : getMongoDbSettings().hashCode());
        hashCode = prime * hashCode + ((getKinesisSettings() == null) ? 0 : getKinesisSettings().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchSettings() == null) ? 0 : getElasticsearchSettings().hashCode());
        return hashCode;
    }

    @Override
    public ModifyEndpointRequest clone() {
        return (ModifyEndpointRequest) super.clone();
    }

}
