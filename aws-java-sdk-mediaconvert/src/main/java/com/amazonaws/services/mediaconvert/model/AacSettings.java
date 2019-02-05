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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of
 * two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate
 * control mode (rateControlMode) to "VBR" or "CBR". In VBR mode, you control the audio quality with the setting VBR
 * quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the
 * rate control mode.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AacSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AacSettings implements Serializable, Cloneable, StructuredPojo {

    private String audioDescriptionBroadcasterMix;
    /** Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile. */
    private Integer bitrate;

    private String codecProfile;

    private String codingMode;

    private String rateControlMode;

    private String rawFormat;
    /** Sample rate in Hz. Valid values depend on rate control mode and profile. */
    private Integer sampleRate;

    private String specification;

    private String vbrQuality;

    /**
     * @param audioDescriptionBroadcasterMix
     * @see AacAudioDescriptionBroadcasterMix
     */

    public void setAudioDescriptionBroadcasterMix(String audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix;
    }

    /**
     * @return
     * @see AacAudioDescriptionBroadcasterMix
     */

    public String getAudioDescriptionBroadcasterMix() {
        return this.audioDescriptionBroadcasterMix;
    }

    /**
     * @param audioDescriptionBroadcasterMix
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacAudioDescriptionBroadcasterMix
     */

    public AacSettings withAudioDescriptionBroadcasterMix(String audioDescriptionBroadcasterMix) {
        setAudioDescriptionBroadcasterMix(audioDescriptionBroadcasterMix);
        return this;
    }

    /**
     * @param audioDescriptionBroadcasterMix
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacAudioDescriptionBroadcasterMix
     */

    public AacSettings withAudioDescriptionBroadcasterMix(AacAudioDescriptionBroadcasterMix audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
     * 
     * @return Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AacSettings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * @param codecProfile
     * @see AacCodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * @return
     * @see AacCodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * @param codecProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodecProfile
     */

    public AacSettings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * @param codecProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodecProfile
     */

    public AacSettings withCodecProfile(AacCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * @param codingMode
     * @see AacCodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * @return
     * @see AacCodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * @param codingMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodingMode
     */

    public AacSettings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * @param codingMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodingMode
     */

    public AacSettings withCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * @param rateControlMode
     * @see AacRateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * @return
     * @see AacRateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * @param rateControlMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRateControlMode
     */

    public AacSettings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * @param rateControlMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRateControlMode
     */

    public AacSettings withRateControlMode(AacRateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * @param rawFormat
     * @see AacRawFormat
     */

    public void setRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
    }

    /**
     * @return
     * @see AacRawFormat
     */

    public String getRawFormat() {
        return this.rawFormat;
    }

    /**
     * @param rawFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRawFormat
     */

    public AacSettings withRawFormat(String rawFormat) {
        setRawFormat(rawFormat);
        return this;
    }

    /**
     * @param rawFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRawFormat
     */

    public AacSettings withRawFormat(AacRawFormat rawFormat) {
        this.rawFormat = rawFormat.toString();
        return this;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @param sampleRate
     *        Sample rate in Hz. Valid values depend on rate control mode and profile.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @return Sample rate in Hz. Valid values depend on rate control mode and profile.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @param sampleRate
     *        Sample rate in Hz. Valid values depend on rate control mode and profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AacSettings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * @param specification
     * @see AacSpecification
     */

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * @return
     * @see AacSpecification
     */

    public String getSpecification() {
        return this.specification;
    }

    /**
     * @param specification
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacSpecification
     */

    public AacSettings withSpecification(String specification) {
        setSpecification(specification);
        return this;
    }

    /**
     * @param specification
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacSpecification
     */

    public AacSettings withSpecification(AacSpecification specification) {
        this.specification = specification.toString();
        return this;
    }

    /**
     * @param vbrQuality
     * @see AacVbrQuality
     */

    public void setVbrQuality(String vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * @return
     * @see AacVbrQuality
     */

    public String getVbrQuality() {
        return this.vbrQuality;
    }

    /**
     * @param vbrQuality
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacVbrQuality
     */

    public AacSettings withVbrQuality(String vbrQuality) {
        setVbrQuality(vbrQuality);
        return this;
    }

    /**
     * @param vbrQuality
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacVbrQuality
     */

    public AacSettings withVbrQuality(AacVbrQuality vbrQuality) {
        this.vbrQuality = vbrQuality.toString();
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
        if (getAudioDescriptionBroadcasterMix() != null)
            sb.append("AudioDescriptionBroadcasterMix: ").append(getAudioDescriptionBroadcasterMix()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getRawFormat() != null)
            sb.append("RawFormat: ").append(getRawFormat()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSpecification() != null)
            sb.append("Specification: ").append(getSpecification()).append(",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: ").append(getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AacSettings == false)
            return false;
        AacSettings other = (AacSettings) obj;
        if (other.getAudioDescriptionBroadcasterMix() == null ^ this.getAudioDescriptionBroadcasterMix() == null)
            return false;
        if (other.getAudioDescriptionBroadcasterMix() != null
                && other.getAudioDescriptionBroadcasterMix().equals(this.getAudioDescriptionBroadcasterMix()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getRawFormat() == null ^ this.getRawFormat() == null)
            return false;
        if (other.getRawFormat() != null && other.getRawFormat().equals(this.getRawFormat()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDescriptionBroadcasterMix() == null) ? 0 : getAudioDescriptionBroadcasterMix().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRawFormat() == null) ? 0 : getRawFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public AacSettings clone() {
        try {
            return (AacSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AacSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
