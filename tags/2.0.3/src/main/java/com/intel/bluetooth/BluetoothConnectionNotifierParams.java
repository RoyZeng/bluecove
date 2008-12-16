/**
 *  BlueCove - Java library for Bluetooth
 *  Copyright (C) 2006-2008 Vlad Skarzhevskyy
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  @version $Id$
 */
package com.intel.bluetooth;

import javax.bluetooth.UUID;

/**
 * @author vlads
 * 
 */
class BluetoothConnectionNotifierParams {

	UUID uuid;

	boolean authenticate;

	boolean encrypt;

	boolean authorize;

	String name;

	boolean master;

	boolean obex;

	boolean timeouts;

	/**
	 * Enables L2CAP server PSM selections. Usage:
	 * btl2cap://localhost;name=test;bluecovepsm=11 where bluecovepsm is
	 * 4*4(HEXDIG)
	 */
	int bluecove_ext_psm = 0;

	public BluetoothConnectionNotifierParams(UUID uuid, boolean authenticate, boolean encrypt, boolean authorize,
			String name, boolean master) {
		super();
		this.uuid = uuid;
		this.authenticate = authenticate;
		this.encrypt = encrypt;
		this.authorize = authorize;
		this.name = name;
		this.master = master;
		this.obex = false;
	}
}