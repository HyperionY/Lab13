package edu.handong.scee.lab13.prob03;		// class Circle include this package

public class Circle extends Shape {		// class Circle extended class Shape

	private double radius;		// return the double type value 'radius'
	
	public Circle(double r) {
	
		radius = r;		// set the radius variable and input the 'r' value
	}
	public double area() {
	
		return Math.PI * Math.pow(radius, 2); // return the 'pi * r * r' result
	}
	public double perimeter() {
	
		return 2.0 * Math.PI * radius; // return the '2 * pi * radius' result
	}
	
	public double get_Radius() {

		return radius;		// return the radius value 
	}
}
