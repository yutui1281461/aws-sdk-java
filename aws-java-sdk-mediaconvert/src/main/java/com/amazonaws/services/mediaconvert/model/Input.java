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
 * Specifies media input
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Input" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Input implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     */
    private java.util.Map<String, AudioSelectorGroup> audioSelectorGroups;
    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     */
    private java.util.Map<String, AudioSelector> audioSelectors;
    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     */
    private java.util.Map<String, CaptionSelector> captionSelectors;

    private String deblockFilter;

    private String denoiseFilter;
    /**
     * Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in a job.
     * These inputs are concantenated, in the order they are specified in the job, to create the output.
     */
    private String fileInput;

    private String filterEnable;
    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     */
    private Integer filterStrength;
    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     */
    private java.util.List<InputClipping> inputClippings;
    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     */
    private Integer programNumber;

    private String psiControl;

    private String timecodeSource;

    private VideoSelector videoSelector;

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * 
     * @return Specifies set of audio selectors within an input to combine. An input may have multiple audio selector
     *         groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
     */

    public java.util.Map<String, AudioSelectorGroup> getAudioSelectorGroups() {
        return audioSelectorGroups;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * 
     * @param audioSelectorGroups
     *        Specifies set of audio selectors within an input to combine. An input may have multiple audio selector
     *        groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
     */

    public void setAudioSelectorGroups(java.util.Map<String, AudioSelectorGroup> audioSelectorGroups) {
        this.audioSelectorGroups = audioSelectorGroups;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * 
     * @param audioSelectorGroups
     *        Specifies set of audio selectors within an input to combine. An input may have multiple audio selector
     *        groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withAudioSelectorGroups(java.util.Map<String, AudioSelectorGroup> audioSelectorGroups) {
        setAudioSelectorGroups(audioSelectorGroups);
        return this;
    }

    public Input addAudioSelectorGroupsEntry(String key, AudioSelectorGroup value) {
        if (null == this.audioSelectorGroups) {
            this.audioSelectorGroups = new java.util.HashMap<String, AudioSelectorGroup>();
        }
        if (this.audioSelectorGroups.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.audioSelectorGroups.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AudioSelectorGroups.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input clearAudioSelectorGroupsEntries() {
        this.audioSelectorGroups = null;
        return this;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     * 
     * @return Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use
     *         in your outputs. You can use mutiple Audio selectors per input.
     */

    public java.util.Map<String, AudioSelector> getAudioSelectors() {
        return audioSelectors;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     * 
     * @param audioSelectors
     *        Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use
     *        in your outputs. You can use mutiple Audio selectors per input.
     */

    public void setAudioSelectors(java.util.Map<String, AudioSelector> audioSelectors) {
        this.audioSelectors = audioSelectors;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     * 
     * @param audioSelectors
     *        Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use
     *        in your outputs. You can use mutiple Audio selectors per input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withAudioSelectors(java.util.Map<String, AudioSelector> audioSelectors) {
        setAudioSelectors(audioSelectors);
        return this;
    }

    public Input addAudioSelectorsEntry(String key, AudioSelector value) {
        if (null == this.audioSelectors) {
            this.audioSelectors = new java.util.HashMap<String, AudioSelector>();
        }
        if (this.audioSelectors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.audioSelectors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AudioSelectors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input clearAudioSelectorsEntries() {
        this.audioSelectors = null;
        return this;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     * 
     * @return Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use
     *         in your outputs. You can use mutiple captions selectors per input.
     */

    public java.util.Map<String, CaptionSelector> getCaptionSelectors() {
        return captionSelectors;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     * 
     * @param captionSelectors
     *        Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in
     *        your outputs. You can use mutiple captions selectors per input.
     */

    public void setCaptionSelectors(java.util.Map<String, CaptionSelector> captionSelectors) {
        this.captionSelectors = captionSelectors;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     * 
     * @param captionSelectors
     *        Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in
     *        your outputs. You can use mutiple captions selectors per input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withCaptionSelectors(java.util.Map<String, CaptionSelector> captionSelectors) {
        setCaptionSelectors(captionSelectors);
        return this;
    }

    public Input addCaptionSelectorsEntry(String key, CaptionSelector value) {
        if (null == this.captionSelectors) {
            this.captionSelectors = new java.util.HashMap<String, CaptionSelector>();
        }
        if (this.captionSelectors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.captionSelectors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CaptionSelectors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input clearCaptionSelectorsEntries() {
        this.captionSelectors = null;
        return this;
    }

    /**
     * @param deblockFilter
     * @see InputDeblockFilter
     */

    public void setDeblockFilter(String deblockFilter) {
        this.deblockFilter = deblockFilter;
    }

    /**
     * @return
     * @see InputDeblockFilter
     */

    public String getDeblockFilter() {
        return this.deblockFilter;
    }

    /**
     * @param deblockFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeblockFilter
     */

    public Input withDeblockFilter(String deblockFilter) {
        setDeblockFilter(deblockFilter);
        return this;
    }

    /**
     * @param deblockFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeblockFilter
     */

    public Input withDeblockFilter(InputDeblockFilter deblockFilter) {
        this.deblockFilter = deblockFilter.toString();
        return this;
    }

    /**
     * @param denoiseFilter
     * @see InputDenoiseFilter
     */

    public void setDenoiseFilter(String denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
    }

    /**
     * @return
     * @see InputDenoiseFilter
     */

    public String getDenoiseFilter() {
        return this.denoiseFilter;
    }

    /**
     * @param denoiseFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDenoiseFilter
     */

    public Input withDenoiseFilter(String denoiseFilter) {
        setDenoiseFilter(denoiseFilter);
        return this;
    }

    /**
     * @param denoiseFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDenoiseFilter
     */

    public Input withDenoiseFilter(InputDenoiseFilter denoiseFilter) {
        this.denoiseFilter = denoiseFilter.toString();
        return this;
    }

    /**
     * Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in a job.
     * These inputs are concantenated, in the order they are specified in the job, to create the output.
     * 
     * @param fileInput
     *        Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in
     *        a job. These inputs are concantenated, in the order they are specified in the job, to create the output.
     */

    public void setFileInput(String fileInput) {
        this.fileInput = fileInput;
    }

    /**
     * Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in a job.
     * These inputs are concantenated, in the order they are specified in the job, to create the output.
     * 
     * @return Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs
     *         in a job. These inputs are concantenated, in the order they are specified in the job, to create the
     *         output.
     */

    public String getFileInput() {
        return this.fileInput;
    }

    /**
     * Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in a job.
     * These inputs are concantenated, in the order they are specified in the job, to create the output.
     * 
     * @param fileInput
     *        Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in
     *        a job. These inputs are concantenated, in the order they are specified in the job, to create the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withFileInput(String fileInput) {
        setFileInput(fileInput);
        return this;
    }

    /**
     * @param filterEnable
     * @see InputFilterEnable
     */

    public void setFilterEnable(String filterEnable) {
        this.filterEnable = filterEnable;
    }

    /**
     * @return
     * @see InputFilterEnable
     */

    public String getFilterEnable() {
        return this.filterEnable;
    }

    /**
     * @param filterEnable
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFilterEnable
     */

    public Input withFilterEnable(String filterEnable) {
        setFilterEnable(filterEnable);
        return this;
    }

    /**
     * @param filterEnable
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFilterEnable
     */

    public Input withFilterEnable(InputFilterEnable filterEnable) {
        this.filterEnable = filterEnable.toString();
        return this;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     * 
     * @param filterStrength
     *        Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and
     *        Denoise). The range is -5 to 5. Default is 0.
     */

    public void setFilterStrength(Integer filterStrength) {
        this.filterStrength = filterStrength;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     * 
     * @return Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and
     *         Denoise). The range is -5 to 5. Default is 0.
     */

    public Integer getFilterStrength() {
        return this.filterStrength;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     * 
     * @param filterStrength
     *        Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and
     *        Denoise). The range is -5 to 5. Default is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withFilterStrength(Integer filterStrength) {
        setFilterStrength(filterStrength);
        return this;
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * 
     * @return (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *         used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *         to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *         specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *         together in the order you specify them.
     */

    public java.util.List<InputClipping> getInputClippings() {
        return inputClippings;
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * 
     * @param inputClippings
     *        (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *        used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *        to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *        specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *        together in the order you specify them.
     */

    public void setInputClippings(java.util.Collection<InputClipping> inputClippings) {
        if (inputClippings == null) {
            this.inputClippings = null;
            return;
        }

        this.inputClippings = new java.util.ArrayList<InputClipping>(inputClippings);
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputClippings(java.util.Collection)} or {@link #withInputClippings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputClippings
     *        (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *        used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *        to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *        specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *        together in the order you specify them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withInputClippings(InputClipping... inputClippings) {
        if (this.inputClippings == null) {
            setInputClippings(new java.util.ArrayList<InputClipping>(inputClippings.length));
        }
        for (InputClipping ele : inputClippings) {
            this.inputClippings.add(ele);
        }
        return this;
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * 
     * @param inputClippings
     *        (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *        used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *        to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *        specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *        together in the order you specify them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withInputClippings(java.util.Collection<InputClipping> inputClippings) {
        setInputClippings(inputClippings);
        return this;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     * 
     * @param programNumber
     *        Use Program (programNumber) to select a specific program from within a multi-program transport stream.
     *        Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If
     *        the program you specify doesn't exist, the transcoding service will use this default.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     * 
     * @return Use Program (programNumber) to select a specific program from within a multi-program transport stream.
     *         Note that Quad 4K is not currently supported. Default is the first program within the transport stream.
     *         If the program you specify doesn't exist, the transcoding service will use this default.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     * 
     * @param programNumber
     *        Use Program (programNumber) to select a specific program from within a multi-program transport stream.
     *        Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If
     *        the program you specify doesn't exist, the transcoding service will use this default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * @param psiControl
     * @see InputPsiControl
     */

    public void setPsiControl(String psiControl) {
        this.psiControl = psiControl;
    }

    /**
     * @return
     * @see InputPsiControl
     */

    public String getPsiControl() {
        return this.psiControl;
    }

    /**
     * @param psiControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPsiControl
     */

    public Input withPsiControl(String psiControl) {
        setPsiControl(psiControl);
        return this;
    }

    /**
     * @param psiControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPsiControl
     */

    public Input withPsiControl(InputPsiControl psiControl) {
        this.psiControl = psiControl.toString();
        return this;
    }

    /**
     * @param timecodeSource
     * @see InputTimecodeSource
     */

    public void setTimecodeSource(String timecodeSource) {
        this.timecodeSource = timecodeSource;
    }

    /**
     * @return
     * @see InputTimecodeSource
     */

    public String getTimecodeSource() {
        return this.timecodeSource;
    }

    /**
     * @param timecodeSource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputTimecodeSource
     */

    public Input withTimecodeSource(String timecodeSource) {
        setTimecodeSource(timecodeSource);
        return this;
    }

    /**
     * @param timecodeSource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputTimecodeSource
     */

    public Input withTimecodeSource(InputTimecodeSource timecodeSource) {
        this.timecodeSource = timecodeSource.toString();
        return this;
    }

    /**
     * @param videoSelector
     */

    public void setVideoSelector(VideoSelector videoSelector) {
        this.videoSelector = videoSelector;
    }

    /**
     * @return
     */

    public VideoSelector getVideoSelector() {
        return this.videoSelector;
    }

    /**
     * @param videoSelector
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withVideoSelector(VideoSelector videoSelector) {
        setVideoSelector(videoSelector);
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
        if (getAudioSelectorGroups() != null)
            sb.append("AudioSelectorGroups: ").append(getAudioSelectorGroups()).append(",");
        if (getAudioSelectors() != null)
            sb.append("AudioSelectors: ").append(getAudioSelectors()).append(",");
        if (getCaptionSelectors() != null)
            sb.append("CaptionSelectors: ").append(getCaptionSelectors()).append(",");
        if (getDeblockFilter() != null)
            sb.append("DeblockFilter: ").append(getDeblockFilter()).append(",");
        if (getDenoiseFilter() != null)
            sb.append("DenoiseFilter: ").append(getDenoiseFilter()).append(",");
        if (getFileInput() != null)
            sb.append("FileInput: ").append(getFileInput()).append(",");
        if (getFilterEnable() != null)
            sb.append("FilterEnable: ").append(getFilterEnable()).append(",");
        if (getFilterStrength() != null)
            sb.append("FilterStrength: ").append(getFilterStrength()).append(",");
        if (getInputClippings() != null)
            sb.append("InputClippings: ").append(getInputClippings()).append(",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getPsiControl() != null)
            sb.append("PsiControl: ").append(getPsiControl()).append(",");
        if (getTimecodeSource() != null)
            sb.append("TimecodeSource: ").append(getTimecodeSource()).append(",");
        if (getVideoSelector() != null)
            sb.append("VideoSelector: ").append(getVideoSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;
        if (other.getAudioSelectorGroups() == null ^ this.getAudioSelectorGroups() == null)
            return false;
        if (other.getAudioSelectorGroups() != null && other.getAudioSelectorGroups().equals(this.getAudioSelectorGroups()) == false)
            return false;
        if (other.getAudioSelectors() == null ^ this.getAudioSelectors() == null)
            return false;
        if (other.getAudioSelectors() != null && other.getAudioSelectors().equals(this.getAudioSelectors()) == false)
            return false;
        if (other.getCaptionSelectors() == null ^ this.getCaptionSelectors() == null)
            return false;
        if (other.getCaptionSelectors() != null && other.getCaptionSelectors().equals(this.getCaptionSelectors()) == false)
            return false;
        if (other.getDeblockFilter() == null ^ this.getDeblockFilter() == null)
            return false;
        if (other.getDeblockFilter() != null && other.getDeblockFilter().equals(this.getDeblockFilter()) == false)
            return false;
        if (other.getDenoiseFilter() == null ^ this.getDenoiseFilter() == null)
            return false;
        if (other.getDenoiseFilter() != null && other.getDenoiseFilter().equals(this.getDenoiseFilter()) == false)
            return false;
        if (other.getFileInput() == null ^ this.getFileInput() == null)
            return false;
        if (other.getFileInput() != null && other.getFileInput().equals(this.getFileInput()) == false)
            return false;
        if (other.getFilterEnable() == null ^ this.getFilterEnable() == null)
            return false;
        if (other.getFilterEnable() != null && other.getFilterEnable().equals(this.getFilterEnable()) == false)
            return false;
        if (other.getFilterStrength() == null ^ this.getFilterStrength() == null)
            return false;
        if (other.getFilterStrength() != null && other.getFilterStrength().equals(this.getFilterStrength()) == false)
            return false;
        if (other.getInputClippings() == null ^ this.getInputClippings() == null)
            return false;
        if (other.getInputClippings() != null && other.getInputClippings().equals(this.getInputClippings()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getPsiControl() == null ^ this.getPsiControl() == null)
            return false;
        if (other.getPsiControl() != null && other.getPsiControl().equals(this.getPsiControl()) == false)
            return false;
        if (other.getTimecodeSource() == null ^ this.getTimecodeSource() == null)
            return false;
        if (other.getTimecodeSource() != null && other.getTimecodeSource().equals(this.getTimecodeSource()) == false)
            return false;
        if (other.getVideoSelector() == null ^ this.getVideoSelector() == null)
            return false;
        if (other.getVideoSelector() != null && other.getVideoSelector().equals(this.getVideoSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioSelectorGroups() == null) ? 0 : getAudioSelectorGroups().hashCode());
        hashCode = prime * hashCode + ((getAudioSelectors() == null) ? 0 : getAudioSelectors().hashCode());
        hashCode = prime * hashCode + ((getCaptionSelectors() == null) ? 0 : getCaptionSelectors().hashCode());
        hashCode = prime * hashCode + ((getDeblockFilter() == null) ? 0 : getDeblockFilter().hashCode());
        hashCode = prime * hashCode + ((getDenoiseFilter() == null) ? 0 : getDenoiseFilter().hashCode());
        hashCode = prime * hashCode + ((getFileInput() == null) ? 0 : getFileInput().hashCode());
        hashCode = prime * hashCode + ((getFilterEnable() == null) ? 0 : getFilterEnable().hashCode());
        hashCode = prime * hashCode + ((getFilterStrength() == null) ? 0 : getFilterStrength().hashCode());
        hashCode = prime * hashCode + ((getInputClippings() == null) ? 0 : getInputClippings().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getPsiControl() == null) ? 0 : getPsiControl().hashCode());
        hashCode = prime * hashCode + ((getTimecodeSource() == null) ? 0 : getTimecodeSource().hashCode());
        hashCode = prime * hashCode + ((getVideoSelector() == null) ? 0 : getVideoSelector().hashCode());
        return hashCode;
    }

    @Override
    public Input clone() {
        try {
            return (Input) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.InputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
