
package com.beans;

public class Laptop extends Device {

	Power power;
	
	public Laptop(Power power) {
		this.power=power;
		
	}
	@Override
	public void use() {
		System.out.println("laptop  "+ power);

	}

}
