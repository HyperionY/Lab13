package edu.handong.scee.lab13.prob06;		// this package include class Printer

public class Printer {

	public static void print(Object object) {
		
	String str = object.toString();		// set object.toString() as String type local variable  'str'
	
	if(object instanceof CapitalPrint)		// if object type is CapicalPrint class activate under line command
		str = str.toUpperCase();		// input the str.toUpperCase() result to str
	System.out.println(str);		// print the str value
	}

}
