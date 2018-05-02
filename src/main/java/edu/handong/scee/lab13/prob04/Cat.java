package edu.handong.scee.lab13.prob04;		// class Cat include this package

public class Cat extends Animal implements Pet {		// class Cat extended Animal class and base on Pet interface
	
	public String food() {
	
		return "(Cat!)" +"Fish";		// return the string "(Cat!)Fish"
	}

}