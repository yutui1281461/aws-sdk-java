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
 * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio
 * encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec). For each codec
 * enum you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs.
 * * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioCodecSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioCodecSettings implements Serializable, Cloneable, StructuredPojo {

    private AacSettings aacSettings;

    private Ac3Settings ac3Settings;

    private AiffSettings aiffSettings;

    private String codec;

    private Eac3Settings eac3Settings;

    private Mp2Settings mp2Settings;

    private WavSettings wavSettings;

    /**
     * @param aacSettings
     */

    public void setAacSettings(AacSettings aacSettings) {
        this.aacSettings = aacSettings;
    }

    /**
     * @return
     */

    public AacSettings getAacSettings() {
        return this.aacSettings;
    }

    /**
     * @param aacSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withAacSettings(AacSettings aacSettings) {
        setAacSettings(aacSettings);
        return this;
    }

    /**
     * @param ac3Settings
     */

    public void setAc3Settings(Ac3Settings ac3Settings) {
        this.ac3Settings = ac3Settings;
    }

    /**
     * @return
     */

    public Ac3Settings getAc3Settings() {
        return this.ac3Settings;
    }

    /**
     * @param ac3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withAc3Settings(Ac3Settings ac3Settings) {
        setAc3Settings(ac3Settings);
        return this;
    }

    /**
     * @param aiffSettings
     */

    public void setAiffSettings(AiffSettings aiffSettings) {
        this.aiffSettings = aiffSettings;
    }

    /**
     * @return
     */

    public AiffSettings getAiffSettings() {
        return this.aiffSettings;
    }

    /**
     * @param aiffSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withAiffSettings(AiffSettings aiffSettings) {
        setAiffSettings(aiffSettings);
        return this;
    }

    /**
     * @param codec
     * @see AudioCodec
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * @return
     * @see AudioCodec
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * @param codec
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioCodec
     */

    public AudioCodecSettings withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * @param codec
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioCodec
     */

    public AudioCodecSettings withCodec(AudioCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * @param eac3Settings
     */

    public void setEac3Settings(Eac3Settings eac3Settings) {
        this.eac3Settings = eac3Settings;
    }

    /**
     * @return
     */

    public Eac3Settings getEac3Settings() {
        return this.eac3Settings;
    }

    /**
     * @param eac3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withEac3Settings(Eac3Settings eac3Settings) {
        setEac3Settings(eac3Settings);
        return this;
    }

    /**
     * @param mp2Settings
     */

    public void setMp2Settings(Mp2Settings mp2Settings) {
        this.mp2Settings = mp2Settings;
    }

    /**
     * @return
     */

    public Mp2Settings getMp2Settings() {
        return this.mp2Settings;
    }

    /**
     * @param mp2Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withMp2Settings(Mp2Settings mp2Settings) {
        setMp2Settings(mp2Settings);
        return this;
    }

    /**
     * @param wavSettings
     */

    public void setWavSettings(WavSettings wavSettings) {
        this.wavSettings = wavSettings;
    }

    /**
     * @return
     */

    public WavSettings getWavSettings() {
        return this.wavSettings;
    }

    /**
     * @param wavSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withWavSettings(WavSettings wavSettings) {
        setWavSettings(wavSettings);
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
        if (getAacSettings() != null)
            sb.append("AacSettings: ").append(getAacSettings()).append(",");
        if (getAc3Settings() != null)
            sb.append("Ac3Settings: ").append(getAc3Settings()).append(",");
        if (getAiffSettings() != null)
            sb.append("AiffSettings: ").append(getAiffSettings()).append(",");
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getEac3Settings() != null)
            sb.append("Eac3Settings: ").append(getEac3Settings()).append(",");
        if (getMp2Settings() != null)
            sb.append("Mp2Settings: ").append(getMp2Settings()).append(",");
        if (getWavSettings() != null)
            sb.append("WavSettings: ").append(getWavSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioCodecSettings == false)
            return false;
        AudioCodecSettings other = (AudioCodecSettings) obj;
        if (other.getAacSettings() == null ^ this.getAacSettings() == null)
            return false;
        if (other.getAacSettings() != null && other.getAacSettings().equals(this.getAacSettings()) == false)
            return false;
        if (other.getAc3Settings() == null ^ this.getAc3Settings() == null)
            return false;
        if (other.getAc3Settings() != null && other.getAc3Settings().equals(this.getAc3Settings()) == false)
            return false;
        if (other.getAiffSettings() == null ^ this.getAiffSettings() == null)
            return false;
        if (other.getAiffSettings() != null && other.getAiffSettings().equals(this.getAiffSettings()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getEac3Settings() == null ^ this.getEac3Settings() == null)
            return false;
        if (other.getEac3Settings() != null && other.getEac3Settings().equals(this.getEac3Settings()) == false)
            return false;
        if (other.getMp2Settings() == null ^ this.getMp2Settings() == null)
            return false;
        if (other.getMp2Settings() != null && other.getMp2Settings().equals(this.getMp2Settings()) == false)
            return false;
        if (other.getWavSettings() == null ^ this.getWavSettings() == null)
            return false;
        if (other.getWavSettings() != null && other.getWavSettings().equals(this.getWavSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAacSettings() == null) ? 0 : getAacSettings().hashCode());
        hashCode = prime * hashCode + ((getAc3Settings() == null) ? 0 : getAc3Settings().hashCode());
        hashCode = prime * hashCode + ((getAiffSettings() == null) ? 0 : getAiffSettings().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getEac3Settings() == null) ? 0 : getEac3Settings().hashCode());
        hashCode = prime * hashCode + ((getMp2Settings() == null) ? 0 : getMp2Settings().hashCode());
        hashCode = prime * hashCode + ((getWavSettings() == null) ? 0 : getWavSettings().hashCode());
        return hashCode;
    }

    @Override
    public AudioCodecSettings clone() {
        try {
            return (AudioCodecSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AudioCodecSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
