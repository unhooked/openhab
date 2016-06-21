/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.cul.internal;

import org.openhab.io.transport.cul.CULCommunicationException;
import org.openhab.io.transport.cul.CULDeviceException;
import org.openhab.io.transport.cul.CULHandler;

/**
 * Internal interface for the CULManager. CULHandler should always implement this.
 *
 * @author Till Klocke
 * @since 1.4.0
 */
public interface CULHandlerInternal<T extends CULConfig> extends CULHandler {

    public void open() throws CULDeviceException;

    public void close();

    public boolean hasListeners();

    public void sendWithoutCheck(String message) throws CULCommunicationException;

    public T getConfig();

}
