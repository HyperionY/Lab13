package edu.handong.scee.lab13.prob04;		// class Cat include this package

public class Dog extends Animal implements Pet {		// class Dog extended Animal class and base on Pet interface

	public String food() {
	
		return "(Dog!)"+"Sausage";		// return the string "(Dog!)Sausage"
	}

}
