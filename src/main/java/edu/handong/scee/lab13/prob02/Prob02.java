/**
 * creater : JungYeun Yoo
 * creat day : 2018/05/01
 * class : Java programming
 */

package edu.handong.scee.lab13.prob02;		// class Science in the this package

public class Prob02 {

	public static void main(String[] args) {
		Book book = new Book("Simple Book");		// set Book type variable as 'book', bookName : Simple Book
		Science science = new Science("Hello Physics!", "ScienceWorld"); 	// set Science type variable as 'science', name : Hello Physics!, publisher : ScienceWorld
		History history1 = new History("What Is history?", "E.H.Carr" );	// set History type variable as 'history1' name : What Is history?, author : E.H.Carr
		History history2 = new History("The South Korea", "Judis");		// set History type variable as 'history2' name : The South Korea, author : Judis
		
		book.Show();		// activate Book class method 'Show()', input is book variable, and increase Id value
		science.Show();		// activate Science class method 'Show()', input is science variable, and increase Id value
		history1.Show();	// activate History class method 'Show()', input is history1 variable, and increase Id value
		history2.Show(); 	// activate History class method 'Show()', input is history2 variable, and increase Id value

	}

}
