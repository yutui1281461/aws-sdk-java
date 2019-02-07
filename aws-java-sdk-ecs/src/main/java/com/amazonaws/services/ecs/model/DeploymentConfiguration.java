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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and
 * starting tasks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeploymentConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that are
     * allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment. The maximum
     * number of tasks during a deployment is the <code>desiredCount</code> multiplied by <code>maximumPercent</code>
     * /100, rounded down to the nearest integer value.
     * </p>
     */
    private Integer maximumPercent;
    /**
     * <p>
     * The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running tasks that
     * must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum number of healthy
     * tasks during a deployment is the <code>desiredCount</code> multiplied by <code>minimumHealthyPercent</code>/100,
     * rounded up to the nearest integer value.
     * </p>
     */
    private Integer minimumHealthyPercent;

    /**
     * <p>
     * The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that are
     * allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment. The maximum
     * number of tasks during a deployment is the <code>desiredCount</code> multiplied by <code>maximumPercent</code>
     * /100, rounded down to the nearest integer value.
     * </p>
     * 
     * @param maximumPercent
     *        The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that
     *        are allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment.
     *        The maximum number of tasks during a deployment is the <code>desiredCount</code> multiplied by
     *        <code>maximumPercent</code>/100, rounded down to the nearest integer value.
     */

    public void setMaximumPercent(Integer maximumPercent) {
        this.maximumPercent = maximumPercent;
    }

    /**
     * <p>
     * The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that are
     * allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment. The maximum
     * number of tasks during a deployment is the <code>desiredCount</code> multiplied by <code>maximumPercent</code>
     * /100, rounded down to the nearest integer value.
     * </p>
     * 
     * @return The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that
     *         are allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment.
     *         The maximum number of tasks during a deployment is the <code>desiredCount</code> multiplied by
     *         <code>maximumPercent</code>/100, rounded down to the nearest integer value.
     */

    public Integer getMaximumPercent() {
        return this.maximumPercent;
    }

    /**
     * <p>
     * The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that are
     * allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment. The maximum
     * number of tasks during a deployment is the <code>desiredCount</code> multiplied by <code>maximumPercent</code>
     * /100, rounded down to the nearest integer value.
     * </p>
     * 
     * @param maximumPercent
     *        The upper limit (as a percentage of the service's <code>desiredCount</code>) of the number of tasks that
     *        are allowed in the <code>RUNNING</code> or <code>PENDING</code> state in a service during a deployment.
     *        The maximum number of tasks during a deployment is the <code>desiredCount</code> multiplied by
     *        <code>maximumPercent</code>/100, rounded down to the nearest integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfiguration withMaximumPercent(Integer maximumPercent) {
        setMaximumPercent(maximumPercent);
        return this;
    }

    /**
     * <p>
     * The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running tasks that
     * must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum number of healthy
     * tasks during a deployment is the <code>desiredCount</code> multiplied by <code>minimumHealthyPercent</code>/100,
     * rounded up to the nearest integer value.
     * </p>
     * 
     * @param minimumHealthyPercent
     *        The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running
     *        tasks that must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum
     *        number of healthy tasks during a deployment is the <code>desiredCount</code> multiplied by
     *        <code>minimumHealthyPercent</code>/100, rounded up to the nearest integer value.
     */

    public void setMinimumHealthyPercent(Integer minimumHealthyPercent) {
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    /**
     * <p>
     * The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running tasks that
     * must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum number of healthy
     * tasks during a deployment is the <code>desiredCount</code> multiplied by <code>minimumHealthyPercent</code>/100,
     * rounded up to the nearest integer value.
     * </p>
     * 
     * @return The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running
     *         tasks that must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum
     *         number of healthy tasks during a deployment is the <code>desiredCount</code> multiplied by
     *         <code>minimumHealthyPercent</code>/100, rounded up to the nearest integer value.
     */

    public Integer getMinimumHealthyPercent() {
        return this.minimumHealthyPercent;
    }

    /**
     * <p>
     * The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running tasks that
     * must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum number of healthy
     * tasks during a deployment is the <code>desiredCount</code> multiplied by <code>minimumHealthyPercent</code>/100,
     * rounded up to the nearest integer value.
     * </p>
     * 
     * @param minimumHealthyPercent
     *        The lower limit (as a percentage of the service's <code>desiredCount</code>) of the number of running
     *        tasks that must remain in the <code>RUNNING</code> state in a service during a deployment. The minimum
     *        number of healthy tasks during a deployment is the <code>desiredCount</code> multiplied by
     *        <code>minimumHealthyPercent</code>/100, rounded up to the nearest integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfiguration withMinimumHealthyPercent(Integer minimumHealthyPercent) {
        setMinimumHealthyPercent(minimumHealthyPercent);
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
        if (getMaximumPercent() != null)
            sb.append("MaximumPercent: ").append(getMaximumPercent()).append(",");
        if (getMinimumHealthyPercent() != null)
            sb.append("MinimumHealthyPercent: ").append(getMinimumHealthyPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfiguration == false)
            return false;
        DeploymentConfiguration other = (DeploymentConfiguration) obj;
        if (other.getMaximumPercent() == null ^ this.getMaximumPercent() == null)
            return false;
        if (other.getMaximumPercent() != null && other.getMaximumPercent().equals(this.getMaximumPercent()) == false)
            return false;
        if (other.getMinimumHealthyPercent() == null ^ this.getMinimumHealthyPercent() == null)
            return false;
        if (other.getMinimumHealthyPercent() != null && other.getMinimumHealthyPercent().equals(this.getMinimumHealthyPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumPercent() == null) ? 0 : getMaximumPercent().hashCode());
        hashCode = prime * hashCode + ((getMinimumHealthyPercent() == null) ? 0 : getMinimumHealthyPercent().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfiguration clone() {
        try {
            return (DeploymentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.DeploymentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
