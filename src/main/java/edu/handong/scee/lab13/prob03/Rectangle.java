package edu.handong.scee.lab13.prob03;		// class Rectangle include this package

public class Rectangle extends Shape {		// class Rectangle extended class Shape
	
	private double length;		// set the double type variable 'length'
	private double width;		// set the double type variable 'width'
	
	public Rectangle(double length, double width) {
		
		this.length = length;		// set the class Rectangle length variable as input length
		this.width = width;			// set the class Rectangle width variable as input width
	}
	
	public double area() {
	
		return length * width;		// return 'length * width' result
	}
	
	public double perimeter() {
	
		return 2*(length+width);	// return '2 * (length + width)' result
	}
	
	public double get_Length() {
	
		return length;		// return the length value
	}
	
	public double get_Width() {
	
		return width;		// return width value
	}

}
