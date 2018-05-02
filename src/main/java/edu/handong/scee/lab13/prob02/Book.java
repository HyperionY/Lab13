package edu.handong.scee.lab13.prob02;		// this class in the package of edu.handong.scee.lab13.prob02

public class Book {
	
	private static int idCount = 0;		// set the static int type variable 'idCount' 
	private String bookName;		// set the String type variable 'bookName'
	private int id;		// set the int type variable 'id'
	
	public Book(String Name) {
		
		this.bookName = Name;		// set input variable 'Name' into class variable 'bookName'
		idCount++;		// idCount variable increase 1
		id = idCount;	// set idCount variable into id variable
	}
	
	public String ToString() {
		
		return "\n\tId : " + id + "\n\tBook Name : " + bookName;		// return the data behind return
	}
	
	public void Show() {
		
		System.out.println("===BOOK===" + this.toString());		// print in the "" and class Book method 'toString()' result on console
	}
}
