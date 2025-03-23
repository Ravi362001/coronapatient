package com.spring.beans;

public class employee extends person {
    String designation;
    float salary;
    Food food ;
    
    public employee(Food food) {
    	System.out.println("emp 1 param contractor");
        this.food=food;
    }
	@Override
	public void work() {
       System.out.println("employee  "+food);
	}

}
