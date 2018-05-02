package edu.handong.scee.lab13.prob04;		// class Animal include this package

public class Animal {

	private String name;		// set the String type variable 'name'
	
	public void setName(String name) {
	
		this.name = name;		// set class variable 'name' as input value 'name'
	}
	
	public void getName() {
	
		System.out.println("Name: "+name); 		// print in "" string and name value on console
	}

}
