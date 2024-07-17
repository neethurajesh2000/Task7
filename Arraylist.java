package com.task7;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
        al1.add("maya");
        al1.add("tom");
        al1.add("jerry");
        al1.add("neethu");
        al1.add("mathew");
        System.out.println(al1);
        al1.clear();
        System.out.println(al1);
	}

}
//Output
//[maya, tom, jerry, neethu, mathew]
//[]
