package com.spring.beans;

public class Student extends person {
    String course;
    int roll_no;
    Food food;
    public Student(Food food) {
    	System.out.println("student 1 param contractor");
    	this.food=food;
    }
	@Override
	public void work() {
		 System.out.println("student "+food);
	}

}
