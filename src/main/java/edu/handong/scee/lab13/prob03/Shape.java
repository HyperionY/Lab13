package edu.handong.scee.lab13.prob03;		// class Shape include this package

public abstract class Shape {
	
	public abstract double area();		// set the abstract double type area() method
	public abstract double perimeter();		// set the abstract double type perimeter() method
	
	public void display() {
	
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n");		// print in "" string, area() result and perimeter() result
	}

}
