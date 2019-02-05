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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The stack name for display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     */
    private java.util.List<StorageConnector> storageConnectors;
    /**
     * <p>
     * The URL that users are redirected to after their streaming session ends.
     * </p>
     */
    private String redirectURL;
    /**
     * <p>
     * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send
     * Feedback link is displayed.
     * </p>
     */
    private String feedbackURL;
    /**
     * <p>
     * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are
     * enabled.
     * </p>
     */
    private java.util.List<UserSetting> userSettings;

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @param name
     *        The name of the stack.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @return The name of the stack.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @param name
     *        The name of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @return The description for display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @param displayName
     *        The stack name for display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @return The stack name for display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @param displayName
     *        The stack name for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @return The storage connectors to enable.
     */

    public java.util.List<StorageConnector> getStorageConnectors() {
        return storageConnectors;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     */

    public void setStorageConnectors(java.util.Collection<StorageConnector> storageConnectors) {
        if (storageConnectors == null) {
            this.storageConnectors = null;
            return;
        }

        this.storageConnectors = new java.util.ArrayList<StorageConnector>(storageConnectors);
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConnectors(java.util.Collection)} or {@link #withStorageConnectors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withStorageConnectors(StorageConnector... storageConnectors) {
        if (this.storageConnectors == null) {
            setStorageConnectors(new java.util.ArrayList<StorageConnector>(storageConnectors.length));
        }
        for (StorageConnector ele : storageConnectors) {
            this.storageConnectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withStorageConnectors(java.util.Collection<StorageConnector> storageConnectors) {
        setStorageConnectors(storageConnectors);
        return this;
    }

    /**
     * <p>
     * The URL that users are redirected to after their streaming session ends.
     * </p>
     * 
     * @param redirectURL
     *        The URL that users are redirected to after their streaming session ends.
     */

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    /**
     * <p>
     * The URL that users are redirected to after their streaming session ends.
     * </p>
     * 
     * @return The URL that users are redirected to after their streaming session ends.
     */

    public String getRedirectURL() {
        return this.redirectURL;
    }

    /**
     * <p>
     * The URL that users are redirected to after their streaming session ends.
     * </p>
     * 
     * @param redirectURL
     *        The URL that users are redirected to after their streaming session ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withRedirectURL(String redirectURL) {
        setRedirectURL(redirectURL);
        return this;
    }

    /**
     * <p>
     * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send
     * Feedback link is displayed.
     * </p>
     * 
     * @param feedbackURL
     *        The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no
     *        Send Feedback link is displayed.
     */

    public void setFeedbackURL(String feedbackURL) {
        this.feedbackURL = feedbackURL;
    }

    /**
     * <p>
     * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send
     * Feedback link is displayed.
     * </p>
     * 
     * @return The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no
     *         Send Feedback link is displayed.
     */

    public String getFeedbackURL() {
        return this.feedbackURL;
    }

    /**
     * <p>
     * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send
     * Feedback link is displayed.
     * </p>
     * 
     * @param feedbackURL
     *        The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no
     *        Send Feedback link is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withFeedbackURL(String feedbackURL) {
        setFeedbackURL(feedbackURL);
        return this;
    }

    /**
     * <p>
     * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are
     * enabled.
     * </p>
     * 
     * @return The actions that are enabled or disabled for users during their streaming sessions. By default, these
     *         actions are enabled.
     */

    public java.util.List<UserSetting> getUserSettings() {
        return userSettings;
    }

    /**
     * <p>
     * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are
     * enabled.
     * </p>
     * 
     * @param userSettings
     *        The actions that are enabled or disabled for users during their streaming sessions. By default, these
     *        actions are enabled.
     */

    public void setUserSettings(java.util.Collection<UserSetting> userSettings) {
        if (userSettings == null) {
            this.userSettings = null;
            return;
        }

        this.userSettings = new java.util.ArrayList<UserSetting>(userSettings);
    }

    /**
     * <p>
     * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are
     * enabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserSettings(java.util.Collection)} or {@link #withUserSettings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userSettings
     *        The actions that are enabled or disabled for users during their streaming sessions. By default, these
     *        actions are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withUserSettings(UserSetting... userSettings) {
        if (this.userSettings == null) {
            setUserSettings(new java.util.ArrayList<UserSetting>(userSettings.length));
        }
        for (UserSetting ele : userSettings) {
            this.userSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are
     * enabled.
     * </p>
     * 
     * @param userSettings
     *        The actions that are enabled or disabled for users during their streaming sessions. By default, these
     *        actions are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withUserSettings(java.util.Collection<UserSetting> userSettings) {
        setUserSettings(userSettings);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getStorageConnectors() != null)
            sb.append("StorageConnectors: ").append(getStorageConnectors()).append(",");
        if (getRedirectURL() != null)
            sb.append("RedirectURL: ").append(getRedirectURL()).append(",");
        if (getFeedbackURL() != null)
            sb.append("FeedbackURL: ").append(getFeedbackURL()).append(",");
        if (getUserSettings() != null)
            sb.append("UserSettings: ").append(getUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackRequest == false)
            return false;
        CreateStackRequest other = (CreateStackRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getStorageConnectors() == null ^ this.getStorageConnectors() == null)
            return false;
        if (other.getStorageConnectors() != null && other.getStorageConnectors().equals(this.getStorageConnectors()) == false)
            return false;
        if (other.getRedirectURL() == null ^ this.getRedirectURL() == null)
            return false;
        if (other.getRedirectURL() != null && other.getRedirectURL().equals(this.getRedirectURL()) == false)
            return false;
        if (other.getFeedbackURL() == null ^ this.getFeedbackURL() == null)
            return false;
        if (other.getFeedbackURL() != null && other.getFeedbackURL().equals(this.getFeedbackURL()) == false)
            return false;
        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getStorageConnectors() == null) ? 0 : getStorageConnectors().hashCode());
        hashCode = prime * hashCode + ((getRedirectURL() == null) ? 0 : getRedirectURL().hashCode());
        hashCode = prime * hashCode + ((getFeedbackURL() == null) ? 0 : getFeedbackURL().hashCode());
        hashCode = prime * hashCode + ((getUserSettings() == null) ? 0 : getUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateStackRequest clone() {
        return (CreateStackRequest) super.clone();
    }

}
