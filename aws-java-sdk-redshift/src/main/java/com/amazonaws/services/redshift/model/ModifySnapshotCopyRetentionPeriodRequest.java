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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotCopyRetentionPeriod"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotCopyRetentionPeriodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for automated snapshots
     * that are copied to a destination region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The number of days to retain automated snapshots in the destination region after they are copied from the source
     * region.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination region, Amazon
     * Redshift will delete any existing automated snapshots that were copied to the destination region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     */
    private Integer retentionPeriod;

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for automated snapshots
     * that are copied to a destination region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which you want to change the retention period for automated
     *        snapshots that are copied to a destination region.</p>
     *        <p>
     *        Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for automated snapshots
     * that are copied to a destination region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     * 
     * @return The unique identifier of the cluster for which you want to change the retention period for automated
     *         snapshots that are copied to a destination region.</p>
     *         <p>
     *         Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for automated snapshots
     * that are copied to a destination region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which you want to change the retention period for automated
     *        snapshots that are copied to a destination region.</p>
     *        <p>
     *        Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotCopyRetentionPeriodRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination region after they are copied from the source
     * region.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination region, Amazon
     * Redshift will delete any existing automated snapshots that were copied to the destination region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days to retain automated snapshots in the destination region after they are copied from the
     *        source region.</p>
     *        <p>
     *        If you decrease the retention period for automated snapshots that are copied to a destination region,
     *        Amazon Redshift will delete any existing automated snapshots that were copied to the destination region
     *        and that fall outside of the new retention period.
     *        </p>
     *        <p>
     *        Constraints: Must be at least 1 and no more than 35.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination region after they are copied from the source
     * region.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination region, Amazon
     * Redshift will delete any existing automated snapshots that were copied to the destination region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     * 
     * @return The number of days to retain automated snapshots in the destination region after they are copied from the
     *         source region.</p>
     *         <p>
     *         If you decrease the retention period for automated snapshots that are copied to a destination region,
     *         Amazon Redshift will delete any existing automated snapshots that were copied to the destination region
     *         and that fall outside of the new retention period.
     *         </p>
     *         <p>
     *         Constraints: Must be at least 1 and no more than 35.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination region after they are copied from the source
     * region.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination region, Amazon
     * Redshift will delete any existing automated snapshots that were copied to the destination region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days to retain automated snapshots in the destination region after they are copied from the
     *        source region.</p>
     *        <p>
     *        If you decrease the retention period for automated snapshots that are copied to a destination region,
     *        Amazon Redshift will delete any existing automated snapshots that were copied to the destination region
     *        and that fall outside of the new retention period.
     *        </p>
     *        <p>
     *        Constraints: Must be at least 1 and no more than 35.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotCopyRetentionPeriodRequest withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotCopyRetentionPeriodRequest == false)
            return false;
        ModifySnapshotCopyRetentionPeriodRequest other = (ModifySnapshotCopyRetentionPeriodRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotCopyRetentionPeriodRequest clone() {
        return (ModifySnapshotCopyRetentionPeriodRequest) super.clone();
    }

}
