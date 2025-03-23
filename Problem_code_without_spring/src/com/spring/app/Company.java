package com.spring.app;

import com.spring.beans.Food;
import com.spring.beans.employee;

public class Company {

	public static void main(String[] args) {
		Food f = new Food();
		employee e = new employee(f);
		
	   e.work();

	}

}
