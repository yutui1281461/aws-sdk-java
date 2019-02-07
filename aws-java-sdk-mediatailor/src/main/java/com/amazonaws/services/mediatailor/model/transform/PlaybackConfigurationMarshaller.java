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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PlaybackConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlaybackConfigurationMarshaller {

    private static final MarshallingInfo<String> ADDECISIONSERVERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdDecisionServerUrl").build();
    private static final MarshallingInfo<StructuredPojo> CDNCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdnConfiguration").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SLATEADURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlateAdUrl").build();
    private static final MarshallingInfo<String> VIDEOCONTENTSOURCEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VideoContentSourceUrl").build();

    private static final PlaybackConfigurationMarshaller instance = new PlaybackConfigurationMarshaller();

    public static PlaybackConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PlaybackConfiguration playbackConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (playbackConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(playbackConfiguration.getAdDecisionServerUrl(), ADDECISIONSERVERURL_BINDING);
            protocolMarshaller.marshall(playbackConfiguration.getCdnConfiguration(), CDNCONFIGURATION_BINDING);
            protocolMarshaller.marshall(playbackConfiguration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(playbackConfiguration.getSlateAdUrl(), SLATEADURL_BINDING);
            protocolMarshaller.marshall(playbackConfiguration.getVideoContentSourceUrl(), VIDEOCONTENTSOURCEURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
