package edu.handong.scee.lab13.prob06;		// this package include class DownPoint

public class DownPoint {

	private int x, y;		// set int type local variable x, y
	DownPoint(int x, int y){
		
		this.x = x; this.y = y;		// input the input value 'x' and 'y' to class variable x and y
	}
	
	public String toString() {
		
		return "x : " + x + " y : " + y;		// return the x and y value
	}

}
