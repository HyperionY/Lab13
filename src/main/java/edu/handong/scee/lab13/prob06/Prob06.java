package edu.handong.scee.lab13.prob06;		// this package include class Prob06

public class Prob06 {

	public static void main(String[] args) {
		UpPoint p1 = new UpPoint(3,3);		// set UpPoint() as upPoint type p1 variable and input the value 3, 3
		DownPoint p2 = new DownPoint(2,5);		// set DownPoint() as DownPoint type p2 variable and input the value 2, 5
		DownPoint p3 = new DownPoint(4,7);		// set DownPoint() as DownPoint type p3 variable and input the value 4, 7
		UpPoint p4 = new UpPoint(9,12);		// set UpPoint() as upPoint type p1 variable and input the value 3, 3
		
		Printer.print(p1) ;		// activate Printer.print(p1) method
		Printer.print(p2) ;		// activate Printer.print(p2) method
		Printer.print(p3) ;		// activate Printer.print(p3) method
		Printer.print(p4) ;		// activate Printer.print(p4) method
	}

}
