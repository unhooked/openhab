/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.cul.internal.serial;

import java.util.Objects;

import org.openhab.io.transport.cul.CULMode;
import org.openhab.io.transport.cul.internal.CULConfig;

/**
 * Configuration for serial device handler implementation.
 *
 * @author Patrick Ruckstuhl
 * @since 1.9.0
 */
public class CULSerialConfig extends CULConfig {

    private int baudRate;
    private int parityMode;

    public CULSerialConfig(String deviceType, String deviceAddress, CULMode mode, int baudRate, int parityMode) {
        super(deviceType, deviceAddress, mode);
        this.baudRate = baudRate;
        this.parityMode = parityMode;
    }

    public int getBaudRate() {
        return baudRate;
    }

    public Integer getParityMode() {
        return parityMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baudRate, parityMode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CULSerialConfig other = (CULSerialConfig) obj;
        return baudRate == other.baudRate && parityMode == other.parityMode;
    }
}
