/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.cul.internal;

import java.util.Objects;

import org.openhab.io.transport.cul.CULMode;

/**
 * Configuration for cul. Can be optained from the {@link CULConfigFactory}.
 *
 * @author Patrick Ruckstuhl
 * @since 1.9.0
 */
public abstract class CULConfig {

    private String deviceType;
    private CULMode mode;
    private String deviceAddress;

    public CULConfig(String deviceType, String deviceAddress, CULMode mode) {
        this.deviceType = deviceType;
        this.deviceAddress = deviceAddress;
        this.mode = mode;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public CULMode getMode() {
        return mode;
    }

    public String getDeviceName() {
        return deviceType + ":" + deviceAddress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceAddress, deviceType, mode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CULConfig other = (CULConfig) obj;
        return Objects.equals(deviceAddress, other.deviceAddress) && Objects.equals(deviceType, other.deviceType)
                && mode == other.mode;
    }

}
