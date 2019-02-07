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
 * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created
 * from it.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/JobTemplateSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplateSettings implements Serializable, Cloneable, StructuredPojo {

    /** When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. */
    private Integer adAvailOffset;
    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     */
    private AvailBlanking availBlanking;
    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     */
    private java.util.List<InputTemplate> inputs;
    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups.
     */
    private MotionImageInserter motionImageInserter;

    private NielsenConfiguration nielsenConfiguration;
    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */
    private java.util.List<OutputGroup> outputGroups;
    /** Contains settings used to acquire and adjust timecode information from inputs. */
    private TimecodeConfig timecodeConfig;

    private TimedMetadataInsertion timedMetadataInsertion;

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * 
     * @param adAvailOffset
     *        When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     */

    public void setAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * 
     * @return When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     */

    public Integer getAdAvailOffset() {
        return this.adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * 
     * @param adAvailOffset
     *        When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withAdAvailOffset(Integer adAvailOffset) {
        setAdAvailOffset(adAvailOffset);
        return this;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     * 
     * @param availBlanking
     *        Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during
     *        SCTE-35 triggered ad avails.
     */

    public void setAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     * 
     * @return Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during
     *         SCTE-35 triggered ad avails.
     */

    public AvailBlanking getAvailBlanking() {
        return this.availBlanking;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     * 
     * @param availBlanking
     *        Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during
     *        SCTE-35 triggered ad avails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withAvailBlanking(AvailBlanking availBlanking) {
        setAvailBlanking(availBlanking);
        return this;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * 
     * @return Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *         job template. Using the API, you can include multiple inputs when referencing a job template.
     */

    public java.util.List<InputTemplate> getInputs() {
        return inputs;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * 
     * @param inputs
     *        Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *        job template. Using the API, you can include multiple inputs when referencing a job template.
     */

    public void setInputs(java.util.Collection<InputTemplate> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<InputTemplate>(inputs);
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *        job template. Using the API, you can include multiple inputs when referencing a job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withInputs(InputTemplate... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<InputTemplate>(inputs.length));
        }
        for (InputTemplate ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * 
     * @param inputs
     *        Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *        job template. Using the API, you can include multiple inputs when referencing a job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withInputs(java.util.Collection<InputTemplate> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups.
     * 
     * @param motionImageInserter
     *        Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all
     *        outputs in all output groups.
     */

    public void setMotionImageInserter(MotionImageInserter motionImageInserter) {
        this.motionImageInserter = motionImageInserter;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups.
     * 
     * @return Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all
     *         outputs in all output groups.
     */

    public MotionImageInserter getMotionImageInserter() {
        return this.motionImageInserter;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups.
     * 
     * @param motionImageInserter
     *        Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all
     *        outputs in all output groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withMotionImageInserter(MotionImageInserter motionImageInserter) {
        setMotionImageInserter(motionImageInserter);
        return this;
    }

    /**
     * @param nielsenConfiguration
     */

    public void setNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        this.nielsenConfiguration = nielsenConfiguration;
    }

    /**
     * @return
     */

    public NielsenConfiguration getNielsenConfiguration() {
        return this.nielsenConfiguration;
    }

    /**
     * @param nielsenConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        setNielsenConfiguration(nielsenConfiguration);
        return this;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * 
     * @return (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *         All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *         group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *         required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *         settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *         HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *         MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */

    public java.util.List<OutputGroup> getOutputGroups() {
        return outputGroups;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * 
     * @param outputGroups
     *        (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *        All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *        group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *        required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *        settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *        HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *        MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */

    public void setOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        if (outputGroups == null) {
            this.outputGroups = null;
            return;
        }

        this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups);
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputGroups(java.util.Collection)} or {@link #withOutputGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputGroups
     *        (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *        All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *        group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *        required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *        settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *        HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *        MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withOutputGroups(OutputGroup... outputGroups) {
        if (this.outputGroups == null) {
            setOutputGroups(new java.util.ArrayList<OutputGroup>(outputGroups.length));
        }
        for (OutputGroup ele : outputGroups) {
            this.outputGroups.add(ele);
        }
        return this;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * 
     * @param outputGroups
     *        (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *        All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *        group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *        required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *        settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *        HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *        MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        setOutputGroups(outputGroups);
        return this;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs.
     * 
     * @param timecodeConfig
     *        Contains settings used to acquire and adjust timecode information from inputs.
     */

    public void setTimecodeConfig(TimecodeConfig timecodeConfig) {
        this.timecodeConfig = timecodeConfig;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs.
     * 
     * @return Contains settings used to acquire and adjust timecode information from inputs.
     */

    public TimecodeConfig getTimecodeConfig() {
        return this.timecodeConfig;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs.
     * 
     * @param timecodeConfig
     *        Contains settings used to acquire and adjust timecode information from inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withTimecodeConfig(TimecodeConfig timecodeConfig) {
        setTimecodeConfig(timecodeConfig);
        return this;
    }

    /**
     * @param timedMetadataInsertion
     */

    public void setTimedMetadataInsertion(TimedMetadataInsertion timedMetadataInsertion) {
        this.timedMetadataInsertion = timedMetadataInsertion;
    }

    /**
     * @return
     */

    public TimedMetadataInsertion getTimedMetadataInsertion() {
        return this.timedMetadataInsertion;
    }

    /**
     * @param timedMetadataInsertion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withTimedMetadataInsertion(TimedMetadataInsertion timedMetadataInsertion) {
        setTimedMetadataInsertion(timedMetadataInsertion);
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
        if (getAdAvailOffset() != null)
            sb.append("AdAvailOffset: ").append(getAdAvailOffset()).append(",");
        if (getAvailBlanking() != null)
            sb.append("AvailBlanking: ").append(getAvailBlanking()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getMotionImageInserter() != null)
            sb.append("MotionImageInserter: ").append(getMotionImageInserter()).append(",");
        if (getNielsenConfiguration() != null)
            sb.append("NielsenConfiguration: ").append(getNielsenConfiguration()).append(",");
        if (getOutputGroups() != null)
            sb.append("OutputGroups: ").append(getOutputGroups()).append(",");
        if (getTimecodeConfig() != null)
            sb.append("TimecodeConfig: ").append(getTimecodeConfig()).append(",");
        if (getTimedMetadataInsertion() != null)
            sb.append("TimedMetadataInsertion: ").append(getTimedMetadataInsertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplateSettings == false)
            return false;
        JobTemplateSettings other = (JobTemplateSettings) obj;
        if (other.getAdAvailOffset() == null ^ this.getAdAvailOffset() == null)
            return false;
        if (other.getAdAvailOffset() != null && other.getAdAvailOffset().equals(this.getAdAvailOffset()) == false)
            return false;
        if (other.getAvailBlanking() == null ^ this.getAvailBlanking() == null)
            return false;
        if (other.getAvailBlanking() != null && other.getAvailBlanking().equals(this.getAvailBlanking()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getMotionImageInserter() == null ^ this.getMotionImageInserter() == null)
            return false;
        if (other.getMotionImageInserter() != null && other.getMotionImageInserter().equals(this.getMotionImageInserter()) == false)
            return false;
        if (other.getNielsenConfiguration() == null ^ this.getNielsenConfiguration() == null)
            return false;
        if (other.getNielsenConfiguration() != null && other.getNielsenConfiguration().equals(this.getNielsenConfiguration()) == false)
            return false;
        if (other.getOutputGroups() == null ^ this.getOutputGroups() == null)
            return false;
        if (other.getOutputGroups() != null && other.getOutputGroups().equals(this.getOutputGroups()) == false)
            return false;
        if (other.getTimecodeConfig() == null ^ this.getTimecodeConfig() == null)
            return false;
        if (other.getTimecodeConfig() != null && other.getTimecodeConfig().equals(this.getTimecodeConfig()) == false)
            return false;
        if (other.getTimedMetadataInsertion() == null ^ this.getTimedMetadataInsertion() == null)
            return false;
        if (other.getTimedMetadataInsertion() != null && other.getTimedMetadataInsertion().equals(this.getTimedMetadataInsertion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdAvailOffset() == null) ? 0 : getAdAvailOffset().hashCode());
        hashCode = prime * hashCode + ((getAvailBlanking() == null) ? 0 : getAvailBlanking().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getMotionImageInserter() == null) ? 0 : getMotionImageInserter().hashCode());
        hashCode = prime * hashCode + ((getNielsenConfiguration() == null) ? 0 : getNielsenConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputGroups() == null) ? 0 : getOutputGroups().hashCode());
        hashCode = prime * hashCode + ((getTimecodeConfig() == null) ? 0 : getTimecodeConfig().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataInsertion() == null) ? 0 : getTimedMetadataInsertion().hashCode());
        return hashCode;
    }

    @Override
    public JobTemplateSettings clone() {
        try {
            return (JobTemplateSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.JobTemplateSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
