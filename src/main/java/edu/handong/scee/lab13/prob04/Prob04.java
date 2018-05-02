/**
 * creater : JungYeun Yoo
 * creat day : 2018/05/01
 * class : Java programming
 */

package edu.handong.scee.lab13.prob04;		// this package include class Prob04

import java.util.Scanner;		// import java.util.Scanner library


public class Prob04 {
	
	public static void main(String[] args) {
		
		String cat_name, dog_name;		// set String type variable 'cat_name, dog_name'

		Master master = new Master();		// set Master() as Master type variable 'master'
		Cat cat = new Cat();		// set Cat() as Cat type variable 'cat'
		Dog dog = new Dog();		// set Dog() as Dog type variable 'dog'

		Scanner keyboard = new Scanner(System.in);		// set Scanner(System.in) as keyboard
		System.out.print("Enter the cat name and dog name: ");		// print in the "" string on console
		cat_name = keyboard.next();		// get the string and input the cat_name variable
		dog_name = keyboard.next();		// get the string and input the dog_name variable

		cat.setName(cat_name);		// activate cat.setName() method
		cat.getName();				// activate cat.getName() method
		master.feed(cat);			// activate master.feed() method and input cat value

		dog.setName(dog_name);		// activate dog.setName() method
		dog.getName();				// activate dog.getName() method
		master.feed(dog);			// activate master.feed() method and input dog value

	}

}
