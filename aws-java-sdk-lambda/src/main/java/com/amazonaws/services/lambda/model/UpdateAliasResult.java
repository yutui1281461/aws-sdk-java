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

/**
 * <p>
 * Provides configuration information about a Lambda function version alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     */
    private String aliasArn;
    /**
     * <p>
     * Alias name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * Alias description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic
     * will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     * </p>
     */
    private AliasRoutingConfiguration routingConfig;
    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     * 
     * @param aliasArn
     *        Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an
     *        alias called <code>BETA</code> that points to a helloworld function version, the ARN is
     *        <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     */

    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     * 
     * @return Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an
     *         alias called <code>BETA</code> that points to a helloworld function version, the ARN is
     *         <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     */

    public String getAliasArn() {
        return this.aliasArn;
    }

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     * 
     * @param aliasArn
     *        Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an
     *        alias called <code>BETA</code> that points to a helloworld function version, the ARN is
     *        <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasResult withAliasArn(String aliasArn) {
        setAliasArn(aliasArn);
        return this;
    }

    /**
     * <p>
     * Alias name.
     * </p>
     * 
     * @param name
     *        Alias name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Alias name.
     * </p>
     * 
     * @return Alias name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Alias name.
     * </p>
     * 
     * @param name
     *        Alias name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     * 
     * @param functionVersion
     *        Function version to which the alias points.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     * 
     * @return Function version to which the alias points.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     * 
     * @param functionVersion
     *        Function version to which the alias points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasResult withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Alias description.
     * </p>
     * 
     * @param description
     *        Alias description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Alias description.
     * </p>
     * 
     * @return Alias description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Alias description.
     * </p>
     * 
     * @param description
     *        Alias description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic
     * will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     * </p>
     * 
     * @param routingConfig
     *        Specifies an additional function versions the alias points to, allowing you to dictate what percentage of
     *        traffic will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     */

    public void setRoutingConfig(AliasRoutingConfiguration routingConfig) {
        this.routingConfig = routingConfig;
    }

    /**
     * <p>
     * Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic
     * will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     * </p>
     * 
     * @return Specifies an additional function versions the alias points to, allowing you to dictate what percentage of
     *         traffic will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     */

    public AliasRoutingConfiguration getRoutingConfig() {
        return this.routingConfig;
    }

    /**
     * <p>
     * Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic
     * will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     * </p>
     * 
     * @param routingConfig
     *        Specifies an additional function versions the alias points to, allowing you to dictate what percentage of
     *        traffic will invoke each version. For more information, see <a>lambda-traffic-shifting-using-aliases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasResult withRoutingConfig(AliasRoutingConfiguration routingConfig) {
        setRoutingConfig(routingConfig);
        return this;
    }

    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     * 
     * @param revisionId
     *        Represents the latest updated revision of the function or alias.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     * 
     * @return Represents the latest updated revision of the function or alias.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Represents the latest updated revision of the function or alias.
     * </p>
     * 
     * @param revisionId
     *        Represents the latest updated revision of the function or alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasResult withRevisionId(String revisionId) {
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
        if (getAliasArn() != null)
            sb.append("AliasArn: ").append(getAliasArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: ").append(getFunctionVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingConfig() != null)
            sb.append("RoutingConfig: ").append(getRoutingConfig()).append(",");
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

        if (obj instanceof UpdateAliasResult == false)
            return false;
        UpdateAliasResult other = (UpdateAliasResult) obj;
        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfig() == null ^ this.getRoutingConfig() == null)
            return false;
        if (other.getRoutingConfig() != null && other.getRoutingConfig().equals(this.getRoutingConfig()) == false)
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

        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfig() == null) ? 0 : getRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAliasResult clone() {
        try {
            return (UpdateAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
