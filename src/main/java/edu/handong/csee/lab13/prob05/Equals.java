package edu.handong.csee.lab13.prob05;		// this package include class Equals

public class Equals {

	public static boolean equals(int[][] m1, int[][] m2) {
		
		int count = 0;		// set int type local variable 'count' as 0
		
		if (m1.length != m2.length) // if the number of row is different, return false
			return false;
		for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j])		// increase i, j value(to count 2D matrix) by step and if m1 and m2 is different count 1 increase
                count++;
            }
        }
		
        if(count <= 3) return true;		// if count value smaller than 3, return true
	    else return false;		// if count value larger than 3, return false
	}

}
