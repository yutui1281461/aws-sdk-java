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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyPairRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for your new key pair.
     * </p>
     */
    private String keyPairName;

    /**
     * <p>
     * The name for your new key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name for your new key pair.
     */

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name for your new key pair.
     * </p>
     * 
     * @return The name for your new key pair.
     */

    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * <p>
     * The name for your new key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name for your new key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairRequest withKeyPairName(String keyPairName) {
        setKeyPairName(keyPairName);
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
        if (getKeyPairName() != null)
            sb.append("KeyPairName: ").append(getKeyPairName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyPairRequest == false)
            return false;
        CreateKeyPairRequest other = (CreateKeyPairRequest) obj;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyPairRequest clone() {
        return (CreateKeyPairRequest) super.clone();
    }

}
