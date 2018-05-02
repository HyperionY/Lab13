package edu.handong.csee.lab13.prob05;		// this package include class Prob05

import java.util.Scanner;		// import java.util.Scanner library

public class Prob05 {

	public static void main(String[] args) {
		
		int n1, n2 = 0;		// set int type local variable n1, n2 as 0
		Scanner keyboard = new Scanner(System.in);		// set Scanner(System.in) as keyboard
		
		System.out.print("Enter row size(maximum 5): ");		// print in "" string on console
		n1 = keyboard.nextInt();		// get the number and input the n1
		System.out.print("Enter column size(maximum 5): ");		// print in "" string on console
		n2 = keyboard.nextInt();		// get the number and input the n2
		
		int[][] m1 = new int[n1][n2];		// set the int type m1[n1][n2] matrix
		System.out.print("Enter row size(maximum 5): ");		// print in "" string on console
		n1 = keyboard.nextInt();		// get the number and input the n1
		System.out.print("Enter column size(maximum 5): ");		// print in "" string on console
		n2 = keyboard.nextInt();		// get the number and input the n1
		int[][] m2 = new int[n1][n2];		// set the int type m2[n1][n2] matrix
		
	    System.out.print("Enter List1: ");		// print in "" string on console
	    for (int i = 0; i < m1.length; i++) {
	    	for (int j = 0; j < m1[i].length; j++) m1[i][j] = keyboard.nextInt();		// loop the m1 matrix and, input the number to m1 matrix one by one
	    }
		
	    System.out.print("Enter list2: ");		// print in "" string on console
	    for (int i = 0; i < m2.length; i++){
	    	for (int j = 0; j < m2[i].length; j++)
	    		m2[i][j] = keyboard.nextInt();		// loop the m1 matrix and, input the number to m1 matrix one by one
	    }
	    
	    for (int i = 0; i < m1.length; i++){
	       for (int j = 0; j < m1[i].length; j++)
	    	   System.out.print(m1[i][j] + " ");		// print the values in m1 matrix on console
		       System.out.println();
	    }
		    
	    System.out.println();
	    for (int i = 0; i < m2.length; i++) {
	       for (int j = 0; j < m2[i].length; j++)
	    	   System.out.print(m2[i][j] + " ");		// print the values in m2 matrix on console
		       System.out.println();
	    }
	    
	    System.out.println();		          	        
		if (Equals.equals(m1, m2)) 		// if result of Equals.equals(m1, m2) is true, print under the line on console
			System.out.println("The two arrays are approximately identical.");
		else 		// if result of Equals.equals(m1, m2) is false, print under the line on console
			System.out.println("The two arrays are not identical");

	}

}
