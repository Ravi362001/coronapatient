package com.spring.app;

import com.spring.beans.Food;
import com.spring.beans.Student;


public class Collage {

	public static void main(String[] args) {
		Food f = new Food();
		Student s = new Student(f);
		
	   s.work();
	}

}
