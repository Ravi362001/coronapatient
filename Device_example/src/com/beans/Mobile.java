package com.beans;

public class Mobile extends Device {

	Power power;
	
	public Mobile(Power power) {
		this.power=power;
		
	}
	public void camera() {
		System.out.println("mobile camera");
	}
	@Override
	public void use() {
		System.out.println("Mpobile "+ power);

	}

}
