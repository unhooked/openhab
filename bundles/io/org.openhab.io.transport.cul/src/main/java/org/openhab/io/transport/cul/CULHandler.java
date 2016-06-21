/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.cul;

/**
 * An interface representing a culfw based device. Is handled by {@link CULLifecycleManager}.
 * Classes implementing this interface need to have a constructor with a CULConfiguration as a parameter.
 *
 * @author Till Klocke
 * @since 1.4.0
 */
public interface CULHandler {

    /**
     * Register a listener to receive data and get notified about exceptions.
     *
     * @param listener
     */
    public void registerListener(CULListener listener);

    /**
     * Unregister a previous registered listener. If you don't need the
     * CULHanlder anymore and want to close it, unregister your listener first.
     *
     * @param listener
     */
    public void unregisterListener(CULListener listener);

    /**
     * Send a String representing a culfw command to the CULHandler. Note that
     * Strings changing the RF mode will be discarded silently.
     *
     * @param command
     * @throws CULCommunicationException
     */
    public void send(String command) throws CULCommunicationException;

    /**
     * Get the number of transmit credits remaining. This
     * value is updated every time data is RX'd or TX'd
     *
     * @return number of 10ms transmit credits remaining
     */
    public int getCredit10ms();

}
