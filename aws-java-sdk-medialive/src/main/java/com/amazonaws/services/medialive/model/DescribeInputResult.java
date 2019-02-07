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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for DescribeInputResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Unique ARN of the input (generated, immutable). */
    private String arn;
    /** A list of channel IDs that that input is attached to (currently an input can only be attached to one channel). */
    private java.util.List<String> attachedChannels;
    /** A list of the destinations of the input (PUSH-type). */
    private java.util.List<InputDestination> destinations;
    /** The generated ID of the input (unique for user account, immutable). */
    private String id;
    /** A list of MediaConnect Flows for this input. */
    private java.util.List<MediaConnectFlow> mediaConnectFlows;
    /** The user-assigned name (This is a mutable value). */
    private String name;
    /** The Amazon Resource Name (ARN) of the role this input assumes during and after creation. */
    private String roleArn;
    /** A list of IDs for all the security groups attached to the input. */
    private java.util.List<String> securityGroups;
    /** A list of the sources of the input (PULL-type). */
    private java.util.List<InputSource> sources;

    private String state;

    private String type;

    /**
     * The Unique ARN of the input (generated, immutable).
     * 
     * @param arn
     *        The Unique ARN of the input (generated, immutable).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Unique ARN of the input (generated, immutable).
     * 
     * @return The Unique ARN of the input (generated, immutable).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The Unique ARN of the input (generated, immutable).
     * 
     * @param arn
     *        The Unique ARN of the input (generated, immutable).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
     * 
     * @return A list of channel IDs that that input is attached to (currently an input can only be attached to one
     *         channel).
     */

    public java.util.List<String> getAttachedChannels() {
        return attachedChannels;
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
     * 
     * @param attachedChannels
     *        A list of channel IDs that that input is attached to (currently an input can only be attached to one
     *        channel).
     */

    public void setAttachedChannels(java.util.Collection<String> attachedChannels) {
        if (attachedChannels == null) {
            this.attachedChannels = null;
            return;
        }

        this.attachedChannels = new java.util.ArrayList<String>(attachedChannels);
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedChannels(java.util.Collection)} or {@link #withAttachedChannels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attachedChannels
     *        A list of channel IDs that that input is attached to (currently an input can only be attached to one
     *        channel).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withAttachedChannels(String... attachedChannels) {
        if (this.attachedChannels == null) {
            setAttachedChannels(new java.util.ArrayList<String>(attachedChannels.length));
        }
        for (String ele : attachedChannels) {
            this.attachedChannels.add(ele);
        }
        return this;
    }

    /**
     * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
     * 
     * @param attachedChannels
     *        A list of channel IDs that that input is attached to (currently an input can only be attached to one
     *        channel).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withAttachedChannels(java.util.Collection<String> attachedChannels) {
        setAttachedChannels(attachedChannels);
        return this;
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     * 
     * @return A list of the destinations of the input (PUSH-type).
     */

    public java.util.List<InputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     * 
     * @param destinations
     *        A list of the destinations of the input (PUSH-type).
     */

    public void setDestinations(java.util.Collection<InputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<InputDestination>(destinations);
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of the destinations of the input (PUSH-type).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withDestinations(InputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<InputDestination>(destinations.length));
        }
        for (InputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * A list of the destinations of the input (PUSH-type).
     * 
     * @param destinations
     *        A list of the destinations of the input (PUSH-type).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withDestinations(java.util.Collection<InputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The generated ID of the input (unique for user account, immutable).
     * 
     * @param id
     *        The generated ID of the input (unique for user account, immutable).
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The generated ID of the input (unique for user account, immutable).
     * 
     * @return The generated ID of the input (unique for user account, immutable).
     */

    public String getId() {
        return this.id;
    }

    /**
     * The generated ID of the input (unique for user account, immutable).
     * 
     * @param id
     *        The generated ID of the input (unique for user account, immutable).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * A list of MediaConnect Flows for this input.
     * 
     * @return A list of MediaConnect Flows for this input.
     */

    public java.util.List<MediaConnectFlow> getMediaConnectFlows() {
        return mediaConnectFlows;
    }

    /**
     * A list of MediaConnect Flows for this input.
     * 
     * @param mediaConnectFlows
     *        A list of MediaConnect Flows for this input.
     */

    public void setMediaConnectFlows(java.util.Collection<MediaConnectFlow> mediaConnectFlows) {
        if (mediaConnectFlows == null) {
            this.mediaConnectFlows = null;
            return;
        }

        this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlow>(mediaConnectFlows);
    }

    /**
     * A list of MediaConnect Flows for this input.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaConnectFlows(java.util.Collection)} or {@link #withMediaConnectFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mediaConnectFlows
     *        A list of MediaConnect Flows for this input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withMediaConnectFlows(MediaConnectFlow... mediaConnectFlows) {
        if (this.mediaConnectFlows == null) {
            setMediaConnectFlows(new java.util.ArrayList<MediaConnectFlow>(mediaConnectFlows.length));
        }
        for (MediaConnectFlow ele : mediaConnectFlows) {
            this.mediaConnectFlows.add(ele);
        }
        return this;
    }

    /**
     * A list of MediaConnect Flows for this input.
     * 
     * @param mediaConnectFlows
     *        A list of MediaConnect Flows for this input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withMediaConnectFlows(java.util.Collection<MediaConnectFlow> mediaConnectFlows) {
        setMediaConnectFlows(mediaConnectFlows);
        return this;
    }

    /**
     * The user-assigned name (This is a mutable value).
     * 
     * @param name
     *        The user-assigned name (This is a mutable value).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The user-assigned name (This is a mutable value).
     * 
     * @return The user-assigned name (This is a mutable value).
     */

    public String getName() {
        return this.name;
    }

    /**
     * The user-assigned name (This is a mutable value).
     * 
     * @param name
     *        The user-assigned name (This is a mutable value).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * 
     * @return The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * A list of IDs for all the security groups attached to the input.
     * 
     * @return A list of IDs for all the security groups attached to the input.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * A list of IDs for all the security groups attached to the input.
     * 
     * @param securityGroups
     *        A list of IDs for all the security groups attached to the input.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * A list of IDs for all the security groups attached to the input.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs for all the security groups attached to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * A list of IDs for all the security groups attached to the input.
     * 
     * @param securityGroups
     *        A list of IDs for all the security groups attached to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * A list of the sources of the input (PULL-type).
     * 
     * @return A list of the sources of the input (PULL-type).
     */

    public java.util.List<InputSource> getSources() {
        return sources;
    }

    /**
     * A list of the sources of the input (PULL-type).
     * 
     * @param sources
     *        A list of the sources of the input (PULL-type).
     */

    public void setSources(java.util.Collection<InputSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<InputSource>(sources);
    }

    /**
     * A list of the sources of the input (PULL-type).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        A list of the sources of the input (PULL-type).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withSources(InputSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<InputSource>(sources.length));
        }
        for (InputSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * A list of the sources of the input (PULL-type).
     * 
     * @param sources
     *        A list of the sources of the input (PULL-type).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputResult withSources(java.util.Collection<InputSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * @param state
     * @see InputState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see InputState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputState
     */

    public DescribeInputResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputState
     */

    public DescribeInputResult withState(InputState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @param type
     * @see InputType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see InputType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public DescribeInputResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public DescribeInputResult withType(InputType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAttachedChannels() != null)
            sb.append("AttachedChannels: ").append(getAttachedChannels()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMediaConnectFlows() != null)
            sb.append("MediaConnectFlows: ").append(getMediaConnectFlows()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputResult == false)
            return false;
        DescribeInputResult other = (DescribeInputResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAttachedChannels() == null ^ this.getAttachedChannels() == null)
            return false;
        if (other.getAttachedChannels() != null && other.getAttachedChannels().equals(this.getAttachedChannels()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMediaConnectFlows() == null ^ this.getMediaConnectFlows() == null)
            return false;
        if (other.getMediaConnectFlows() != null && other.getMediaConnectFlows().equals(this.getMediaConnectFlows()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAttachedChannels() == null) ? 0 : getAttachedChannels().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMediaConnectFlows() == null) ? 0 : getMediaConnectFlows().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInputResult clone() {
        try {
            return (DescribeInputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
