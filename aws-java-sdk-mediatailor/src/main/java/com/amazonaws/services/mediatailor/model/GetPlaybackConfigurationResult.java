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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlaybackConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is
     * 25000 characters.
     * </p>
     */
    private String adDecisionServerUrl;
    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     */
    private CdnConfiguration cdnConfiguration;
    /**
     * <p>
     * The configuration object for DASH content.
     * </p>
     */
    private DashConfiguration dashConfiguration;
    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     */
    private HlsConfiguration hlsConfiguration;
    /**
     * <p>
     * The identifier for the configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     * server-side reporting.
     * </p>
     */
    private String playbackEndpointPrefix;
    /**
     * <p>
     * The URL that the player uses to initialize a session that uses client-side reporting.
     * </p>
     */
    private String sessionInitializationEndpointPrefix;
    /**
     * <p>
     * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots
     * designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     */
    private String slateAdUrl;
    /**
     * <p>
     * Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     * transcoding defaults. Do not include this field if you have not setup custom profiles with the MediaTailor
     * service team.
     * </p>
     */
    private String transcodeProfileName;
    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     */
    private String videoContentSourceUrl;

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is
     * 25000 characters.
     * </p>
     * 
     * @param adDecisionServerUrl
     *        The URL for the ad decision server (ADS). This includes the specification of static parameters and
     *        placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     *        session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a
     *        static VAST URL. The maximum length is 25000 characters.
     */

    public void setAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is
     * 25000 characters.
     * </p>
     * 
     * @return The URL for the ad decision server (ADS). This includes the specification of static parameters and
     *         placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     *         session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a
     *         static VAST URL. The maximum length is 25000 characters.
     */

    public String getAdDecisionServerUrl() {
        return this.adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is
     * 25000 characters.
     * </p>
     * 
     * @param adDecisionServerUrl
     *        The URL for the ad decision server (ADS). This includes the specification of static parameters and
     *        placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     *        session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a
     *        static VAST URL. The maximum length is 25000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withAdDecisionServerUrl(String adDecisionServerUrl) {
        setAdDecisionServerUrl(adDecisionServerUrl);
        return this;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     * 
     * @param cdnConfiguration
     *        The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad
     *        segment management.
     */

    public void setCdnConfiguration(CdnConfiguration cdnConfiguration) {
        this.cdnConfiguration = cdnConfiguration;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     * 
     * @return The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad
     *         segment management.
     */

    public CdnConfiguration getCdnConfiguration() {
        return this.cdnConfiguration;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     * 
     * @param cdnConfiguration
     *        The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad
     *        segment management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withCdnConfiguration(CdnConfiguration cdnConfiguration) {
        setCdnConfiguration(cdnConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration object for DASH content.
     * </p>
     * 
     * @param dashConfiguration
     *        The configuration object for DASH content.
     */

    public void setDashConfiguration(DashConfiguration dashConfiguration) {
        this.dashConfiguration = dashConfiguration;
    }

    /**
     * <p>
     * The configuration object for DASH content.
     * </p>
     * 
     * @return The configuration object for DASH content.
     */

    public DashConfiguration getDashConfiguration() {
        return this.dashConfiguration;
    }

    /**
     * <p>
     * The configuration object for DASH content.
     * </p>
     * 
     * @param dashConfiguration
     *        The configuration object for DASH content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withDashConfiguration(DashConfiguration dashConfiguration) {
        setDashConfiguration(dashConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     * 
     * @param hlsConfiguration
     *        The configuration for HLS content.
     */

    public void setHlsConfiguration(HlsConfiguration hlsConfiguration) {
        this.hlsConfiguration = hlsConfiguration;
    }

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     * 
     * @return The configuration for HLS content.
     */

    public HlsConfiguration getHlsConfiguration() {
        return this.hlsConfiguration;
    }

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     * 
     * @param hlsConfiguration
     *        The configuration for HLS content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withHlsConfiguration(HlsConfiguration hlsConfiguration) {
        setHlsConfiguration(hlsConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier for the configuration.
     * </p>
     * 
     * @param name
     *        The identifier for the configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The identifier for the configuration.
     * </p>
     * 
     * @return The identifier for the configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The identifier for the configuration.
     * </p>
     * 
     * @param name
     *        The identifier for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     * server-side reporting.
     * </p>
     * 
     * @param playbackEndpointPrefix
     *        The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     *        server-side reporting.
     */

    public void setPlaybackEndpointPrefix(String playbackEndpointPrefix) {
        this.playbackEndpointPrefix = playbackEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     * server-side reporting.
     * </p>
     * 
     * @return The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     *         server-side reporting.
     */

    public String getPlaybackEndpointPrefix() {
        return this.playbackEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     * server-side reporting.
     * </p>
     * 
     * @param playbackEndpointPrefix
     *        The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use
     *        server-side reporting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withPlaybackEndpointPrefix(String playbackEndpointPrefix) {
        setPlaybackEndpointPrefix(playbackEndpointPrefix);
        return this;
    }

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses client-side reporting.
     * </p>
     * 
     * @param sessionInitializationEndpointPrefix
     *        The URL that the player uses to initialize a session that uses client-side reporting.
     */

    public void setSessionInitializationEndpointPrefix(String sessionInitializationEndpointPrefix) {
        this.sessionInitializationEndpointPrefix = sessionInitializationEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses client-side reporting.
     * </p>
     * 
     * @return The URL that the player uses to initialize a session that uses client-side reporting.
     */

    public String getSessionInitializationEndpointPrefix() {
        return this.sessionInitializationEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses client-side reporting.
     * </p>
     * 
     * @param sessionInitializationEndpointPrefix
     *        The URL that the player uses to initialize a session that uses client-side reporting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withSessionInitializationEndpointPrefix(String sessionInitializationEndpointPrefix) {
        setSessionInitializationEndpointPrefix(sessionInitializationEndpointPrefix);
        return this;
    }

    /**
     * <p>
     * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots
     * designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     * 
     * @param slateAdUrl
     *        URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS
     *        Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional
     *        for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides
     *        it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains
     *        both audio and video.
     */

    public void setSlateAdUrl(String slateAdUrl) {
        this.slateAdUrl = slateAdUrl;
    }

    /**
     * <p>
     * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots
     * designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     * 
     * @return URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS
     *         Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional
     *         for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides
     *         it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains
     *         both audio and video.
     */

    public String getSlateAdUrl() {
        return this.slateAdUrl;
    }

    /**
     * <p>
     * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots
     * designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     * 
     * @param slateAdUrl
     *        URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS
     *        Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional
     *        for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides
     *        it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains
     *        both audio and video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withSlateAdUrl(String slateAdUrl) {
        setSlateAdUrl(slateAdUrl);
        return this;
    }

    /**
     * <p>
     * Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     * transcoding defaults. Do not include this field if you have not setup custom profiles with the MediaTailor
     * service team.
     * </p>
     * 
     * @param transcodeProfileName
     *        Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     *        transcoding defaults. Do not include this field if you have not setup custom profiles with the MediaTailor
     *        service team.
     */

    public void setTranscodeProfileName(String transcodeProfileName) {
        this.transcodeProfileName = transcodeProfileName;
    }

    /**
     * <p>
     * Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     * transcoding defaults. Do not include this field if you have not setup custom profiles with the MediaTailor
     * service team.
     * </p>
     * 
     * @return Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     *         transcoding defaults. Do not include this field if you have not setup custom profiles with the
     *         MediaTailor service team.
     */

    public String getTranscodeProfileName() {
        return this.transcodeProfileName;
    }

    /**
     * <p>
     * Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     * transcoding defaults. Do not include this field if you have not setup custom profiles with the MediaTailor
     * service team.
     * </p>
     * 
     * @param transcodeProfileName
     *        Associate this playbackConfiguration with a custom transcode profile, overriding MediaTailor's dynamic
     *        transcoding defaults. Do not include this field if you have not setup custom profiles with the MediaTailor
     *        service team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withTranscodeProfileName(String transcodeProfileName) {
        setTranscodeProfileName(transcodeProfileName);
        return this;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     * 
     * @param videoContentSourceUrl
     *        The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512
     *        characters.
     */

    public void setVideoContentSourceUrl(String videoContentSourceUrl) {
        this.videoContentSourceUrl = videoContentSourceUrl;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     * 
     * @return The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512
     *         characters.
     */

    public String getVideoContentSourceUrl() {
        return this.videoContentSourceUrl;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     * 
     * @param videoContentSourceUrl
     *        The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaybackConfigurationResult withVideoContentSourceUrl(String videoContentSourceUrl) {
        setVideoContentSourceUrl(videoContentSourceUrl);
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
        if (getAdDecisionServerUrl() != null)
            sb.append("AdDecisionServerUrl: ").append(getAdDecisionServerUrl()).append(",");
        if (getCdnConfiguration() != null)
            sb.append("CdnConfiguration: ").append(getCdnConfiguration()).append(",");
        if (getDashConfiguration() != null)
            sb.append("DashConfiguration: ").append(getDashConfiguration()).append(",");
        if (getHlsConfiguration() != null)
            sb.append("HlsConfiguration: ").append(getHlsConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlaybackEndpointPrefix() != null)
            sb.append("PlaybackEndpointPrefix: ").append(getPlaybackEndpointPrefix()).append(",");
        if (getSessionInitializationEndpointPrefix() != null)
            sb.append("SessionInitializationEndpointPrefix: ").append(getSessionInitializationEndpointPrefix()).append(",");
        if (getSlateAdUrl() != null)
            sb.append("SlateAdUrl: ").append(getSlateAdUrl()).append(",");
        if (getTranscodeProfileName() != null)
            sb.append("TranscodeProfileName: ").append(getTranscodeProfileName()).append(",");
        if (getVideoContentSourceUrl() != null)
            sb.append("VideoContentSourceUrl: ").append(getVideoContentSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlaybackConfigurationResult == false)
            return false;
        GetPlaybackConfigurationResult other = (GetPlaybackConfigurationResult) obj;
        if (other.getAdDecisionServerUrl() == null ^ this.getAdDecisionServerUrl() == null)
            return false;
        if (other.getAdDecisionServerUrl() != null && other.getAdDecisionServerUrl().equals(this.getAdDecisionServerUrl()) == false)
            return false;
        if (other.getCdnConfiguration() == null ^ this.getCdnConfiguration() == null)
            return false;
        if (other.getCdnConfiguration() != null && other.getCdnConfiguration().equals(this.getCdnConfiguration()) == false)
            return false;
        if (other.getDashConfiguration() == null ^ this.getDashConfiguration() == null)
            return false;
        if (other.getDashConfiguration() != null && other.getDashConfiguration().equals(this.getDashConfiguration()) == false)
            return false;
        if (other.getHlsConfiguration() == null ^ this.getHlsConfiguration() == null)
            return false;
        if (other.getHlsConfiguration() != null && other.getHlsConfiguration().equals(this.getHlsConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlaybackEndpointPrefix() == null ^ this.getPlaybackEndpointPrefix() == null)
            return false;
        if (other.getPlaybackEndpointPrefix() != null && other.getPlaybackEndpointPrefix().equals(this.getPlaybackEndpointPrefix()) == false)
            return false;
        if (other.getSessionInitializationEndpointPrefix() == null ^ this.getSessionInitializationEndpointPrefix() == null)
            return false;
        if (other.getSessionInitializationEndpointPrefix() != null
                && other.getSessionInitializationEndpointPrefix().equals(this.getSessionInitializationEndpointPrefix()) == false)
            return false;
        if (other.getSlateAdUrl() == null ^ this.getSlateAdUrl() == null)
            return false;
        if (other.getSlateAdUrl() != null && other.getSlateAdUrl().equals(this.getSlateAdUrl()) == false)
            return false;
        if (other.getTranscodeProfileName() == null ^ this.getTranscodeProfileName() == null)
            return false;
        if (other.getTranscodeProfileName() != null && other.getTranscodeProfileName().equals(this.getTranscodeProfileName()) == false)
            return false;
        if (other.getVideoContentSourceUrl() == null ^ this.getVideoContentSourceUrl() == null)
            return false;
        if (other.getVideoContentSourceUrl() != null && other.getVideoContentSourceUrl().equals(this.getVideoContentSourceUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdDecisionServerUrl() == null) ? 0 : getAdDecisionServerUrl().hashCode());
        hashCode = prime * hashCode + ((getCdnConfiguration() == null) ? 0 : getCdnConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDashConfiguration() == null) ? 0 : getDashConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHlsConfiguration() == null) ? 0 : getHlsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackEndpointPrefix() == null) ? 0 : getPlaybackEndpointPrefix().hashCode());
        hashCode = prime * hashCode + ((getSessionInitializationEndpointPrefix() == null) ? 0 : getSessionInitializationEndpointPrefix().hashCode());
        hashCode = prime * hashCode + ((getSlateAdUrl() == null) ? 0 : getSlateAdUrl().hashCode());
        hashCode = prime * hashCode + ((getTranscodeProfileName() == null) ? 0 : getTranscodeProfileName().hashCode());
        hashCode = prime * hashCode + ((getVideoContentSourceUrl() == null) ? 0 : getVideoContentSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetPlaybackConfigurationResult clone() {
        try {
            return (GetPlaybackConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
