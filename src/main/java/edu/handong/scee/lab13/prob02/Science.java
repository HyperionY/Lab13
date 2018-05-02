package edu.handong.scee.lab13.prob02;		// class Science in the this package

public class Science extends Book {
	private String publisher;		// set String type variable 'publisher'
	
	public Science(String name, String publisher) {
		
		super(name);		// Inheritance the class Book and input the name variable
		this.publisher = publisher;		// set class variable 'publisher' as input variable 'publisher'
	}
	
	public String ToString() {
		
		return super.ToString() + "\n\tPublisher : " + publisher;		// return the class Book method 'ToString()' result, in the "" string and publisher variable as String
	}
	
	public void Show() {
		
		System.out.println("===Science===" + this.ToString());		// print in "" string and class Book method ToString() result on console
	}
}
