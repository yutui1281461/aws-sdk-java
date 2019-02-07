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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshotFromVolumeRecoveryPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotFromVolumeRecoveryPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String snapshotId;

    private String volumeARN;

    private String volumeRecoveryPointTime;

    /**
     * @param snapshotId
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * @return
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @param snapshotId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotFromVolumeRecoveryPointResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * @param volumeARN
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * @return
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * @param volumeARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * @param volumeRecoveryPointTime
     */

    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }

    /**
     * @return
     */

    public String getVolumeRecoveryPointTime() {
        return this.volumeRecoveryPointTime;
    }

    /**
     * @param volumeRecoveryPointTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        setVolumeRecoveryPointTime(volumeRecoveryPointTime);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getVolumeRecoveryPointTime() != null)
            sb.append("VolumeRecoveryPointTime: ").append(getVolumeRecoveryPointTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotFromVolumeRecoveryPointResult == false)
            return false;
        CreateSnapshotFromVolumeRecoveryPointResult other = (CreateSnapshotFromVolumeRecoveryPointResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null)
            return false;
        if (other.getVolumeRecoveryPointTime() != null && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotFromVolumeRecoveryPointResult clone() {
        try {
            return (CreateSnapshotFromVolumeRecoveryPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
