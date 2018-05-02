/**
 * creater : JungYeun Yoo
 * creat day : 2018/05/01
 * class : Java programming
 */

package edu.handong.csee.lab13.prob01;	// this class into the this package

public class Prob01 {

	public static void main(String[] args) {
		
		Friend friend1 = new Friend();		// set the Friend type variable to friend1
		SchoolFriend friend2 = new SchoolFriend();		// set the SchoolFriend type variable to friend2
		ClassFriend friend3 = new ClassFriend();		// set the ClassFriend type variable to friend3
		
		InstanceOf.WhatFriend(friend1);		// set input frined1 and activate the WhatFriend method in class InstancOf
		InstanceOf.WhatFriend(friend2);		// set input frined2 and activate the WhatFriend method in class InstancOf
		InstanceOf.WhatFriend(friend3);		// set input frined3 and activate the WhatFriend method in class InstancOf
	}

}
