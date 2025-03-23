package com.app;

import com.beans.Device;
import com.beans.DeviceFactory;

public class ElectronicShop {

	public static void main(String[] args) {
		
		
		Device d = DeviceFactory.getDevice("l");
		d.use();
	}

}
