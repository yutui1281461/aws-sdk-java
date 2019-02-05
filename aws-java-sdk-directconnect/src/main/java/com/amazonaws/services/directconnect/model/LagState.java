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
package com.amazonaws.services.directconnect.model;

import javax.annotation.Generated;

/**
 * <p>
 * The state of the LAG.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Requested</b>: The initial state of a LAG. The LAG stays in the requested state until the Letter of Authorization
 * (LOA) is available.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Pending</b>: The LAG has been approved, and is being initialized.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Available</b>: The network link is established, and the LAG is ready for use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Down</b>: The network link is down.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleting</b>: The LAG is in the process of being deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleted</b>: The LAG has been deleted.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LagState {

    Requested("requested"),
    Pending("pending"),
    Available("available"),
    Down("down"),
    Deleting("deleting"),
    Deleted("deleted");

    private String value;

    private LagState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return LagState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LagState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LagState enumEntry : LagState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
