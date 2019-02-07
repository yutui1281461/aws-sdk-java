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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Ac3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ac3Settings implements Serializable, Cloneable, StructuredPojo {

    /** Average bitrate in bits/second. Valid bitrates depend on the coding mode. */
    private Integer bitrate;

    private String bitstreamMode;

    private String codingMode;
    /** Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through. */
    private Integer dialnorm;

    private String dynamicRangeCompressionProfile;

    private String lfeFilter;

    private String metadataControl;
    /** Sample rate in hz. Sample rate is always 48000. */
    private Integer sampleRate;

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * 
     * @return Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * @param bitstreamMode
     * @see Ac3BitstreamMode
     */

    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * @return
     * @see Ac3BitstreamMode
     */

    public String getBitstreamMode() {
        return this.bitstreamMode;
    }

    /**
     * @param bitstreamMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3BitstreamMode
     */

    public Ac3Settings withBitstreamMode(String bitstreamMode) {
        setBitstreamMode(bitstreamMode);
        return this;
    }

    /**
     * @param bitstreamMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3BitstreamMode
     */

    public Ac3Settings withBitstreamMode(Ac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * @param codingMode
     * @see Ac3CodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * @return
     * @see Ac3CodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * @param codingMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3CodingMode
     */

    public Ac3Settings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * @param codingMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3CodingMode
     */

    public Ac3Settings withCodingMode(Ac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed
     *        through.
     */

    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @return Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed
     *         through.
     */

    public Integer getDialnorm() {
        return this.dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed
     *        through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withDialnorm(Integer dialnorm) {
        setDialnorm(dialnorm);
        return this;
    }

    /**
     * @param dynamicRangeCompressionProfile
     * @see Ac3DynamicRangeCompressionProfile
     */

    public void setDynamicRangeCompressionProfile(String dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile;
    }

    /**
     * @return
     * @see Ac3DynamicRangeCompressionProfile
     */

    public String getDynamicRangeCompressionProfile() {
        return this.dynamicRangeCompressionProfile;
    }

    /**
     * @param dynamicRangeCompressionProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionProfile
     */

    public Ac3Settings withDynamicRangeCompressionProfile(String dynamicRangeCompressionProfile) {
        setDynamicRangeCompressionProfile(dynamicRangeCompressionProfile);
        return this;
    }

    /**
     * @param dynamicRangeCompressionProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionProfile
     */

    public Ac3Settings withDynamicRangeCompressionProfile(Ac3DynamicRangeCompressionProfile dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile.toString();
        return this;
    }

    /**
     * @param lfeFilter
     * @see Ac3LfeFilter
     */

    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * @return
     * @see Ac3LfeFilter
     */

    public String getLfeFilter() {
        return this.lfeFilter;
    }

    /**
     * @param lfeFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3LfeFilter
     */

    public Ac3Settings withLfeFilter(String lfeFilter) {
        setLfeFilter(lfeFilter);
        return this;
    }

    /**
     * @param lfeFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3LfeFilter
     */

    public Ac3Settings withLfeFilter(Ac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * @param metadataControl
     * @see Ac3MetadataControl
     */

    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * @return
     * @see Ac3MetadataControl
     */

    public String getMetadataControl() {
        return this.metadataControl;
    }

    /**
     * @param metadataControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3MetadataControl
     */

    public Ac3Settings withMetadataControl(String metadataControl) {
        setMetadataControl(metadataControl);
        return this;
    }

    /**
     * @param metadataControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3MetadataControl
     */

    public Ac3Settings withMetadataControl(Ac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
        return this;
    }

    /**
     * Sample rate in hz. Sample rate is always 48000.
     * 
     * @param sampleRate
     *        Sample rate in hz. Sample rate is always 48000.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in hz. Sample rate is always 48000.
     * 
     * @return Sample rate in hz. Sample rate is always 48000.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Sample rate in hz. Sample rate is always 48000.
     * 
     * @param sampleRate
     *        Sample rate in hz. Sample rate is always 48000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
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
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBitstreamMode() != null)
            sb.append("BitstreamMode: ").append(getBitstreamMode()).append(",");
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
        if (getDialnorm() != null)
            sb.append("Dialnorm: ").append(getDialnorm()).append(",");
        if (getDynamicRangeCompressionProfile() != null)
            sb.append("DynamicRangeCompressionProfile: ").append(getDynamicRangeCompressionProfile()).append(",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: ").append(getLfeFilter()).append(",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: ").append(getMetadataControl()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ac3Settings == false)
            return false;
        Ac3Settings other = (Ac3Settings) obj;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBitstreamMode() == null ^ this.getBitstreamMode() == null)
            return false;
        if (other.getBitstreamMode() != null && other.getBitstreamMode().equals(this.getBitstreamMode()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getDialnorm() == null ^ this.getDialnorm() == null)
            return false;
        if (other.getDialnorm() != null && other.getDialnorm().equals(this.getDialnorm()) == false)
            return false;
        if (other.getDynamicRangeCompressionProfile() == null ^ this.getDynamicRangeCompressionProfile() == null)
            return false;
        if (other.getDynamicRangeCompressionProfile() != null
                && other.getDynamicRangeCompressionProfile().equals(this.getDynamicRangeCompressionProfile()) == false)
            return false;
        if (other.getLfeFilter() == null ^ this.getLfeFilter() == null)
            return false;
        if (other.getLfeFilter() != null && other.getLfeFilter().equals(this.getLfeFilter()) == false)
            return false;
        if (other.getMetadataControl() == null ^ this.getMetadataControl() == null)
            return false;
        if (other.getMetadataControl() != null && other.getMetadataControl().equals(this.getMetadataControl()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBitstreamMode() == null) ? 0 : getBitstreamMode().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getDialnorm() == null) ? 0 : getDialnorm().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeCompressionProfile() == null) ? 0 : getDynamicRangeCompressionProfile().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public Ac3Settings clone() {
        try {
            return (Ac3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Ac3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
