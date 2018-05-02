/**
 * creater : JungYeun Yoo
 * creat day : 2018/05/01
 * class : Java programming
 */

package edu.handong.scee.lab13.prob03;		// class Prob93 include this package

import java.util.Scanner;		// import java.util.Scanner library

public class Prob03 {

	public static void main(String[] args) {
		double n1, n2;		// set double type local variable n1, n2
		Scanner keyboard = new Scanner(System.in);		// set the Scanner() as Scanner type variable 'keyboard'

		System.out.print("Enter radius: ");		// print in "" strings on console
		n1 = keyboard.nextDouble();		// input the double value and set into n1 variable
		Circle c1 = new Circle(n1);		// set Circle() as Circle variable 'c1' and input the n1 value

		System.out.println("Radius: "+ c1.get_Radius());		// print in "" strings and c1.det_Radius() method result on console
		c1.display();		// activate class Circle display() method

		System.out.print("Enter length and width: ");		// print in "" strings on console
		n1 = keyboard.nextDouble();		// input the double value and set into n1 variable
		n2 = keyboard.nextDouble();		// input the double value and set into n2 variable
		Rectangle r1 = new Rectangle(n1, n2);		// set Rectangle() as Rectangle type variable 'r1' and input n1, n2 value

		System.out.println("Length: "+ r1.get_Length());	// print in "" strings and r1.get_Length() result on console
		System.out.println("Width: "+ r1.get_Width());		// print in "" strings r1.get_Width() result on console
		r1.display();		// activate display() method in class Rectangle
	}

}

