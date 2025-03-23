package com.beans;

public class DeviceFactory {

	public static Device getDevice(String type) {
		
	     Power p = new Power();
		if(type.equalsIgnoreCase("m")) {
		     Device m = new Mobile(p);
		     return m;
		     
		}
		else if(type.equalsIgnoreCase("l")) {
		     Device l = new Laptop(p);
		     return l;
		     
		}
		else {
			return null;
		}
	}
}
