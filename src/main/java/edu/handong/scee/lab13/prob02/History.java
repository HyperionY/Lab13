package edu.handong.scee.lab13.prob02;		// class History in the this package

public class History extends Book {		// class History extended class Book
	
	private String author;		// set the String type variable 'author'
	
	public History(String name, String author) {
		
		super(name);	// Inheritance the class Book and input the name variable
		this.author = author;	// set class variable 'author' as input variable 'author'
	}
	
	public String ToString() {
		
		return super.ToString() + "\n\tAuthor: " + author;		// return the class Book method 'ToString()' result , "~" and author as String;
	}
	public void Show() {
		
		System.out.println("<<<History>>>" + this.ToString());		// print in the "" and class History method 'Tostring()' result
	}

}