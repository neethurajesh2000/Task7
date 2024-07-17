package com.task7;

import java.util.Collections;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap tm1=new TreeMap();
		tm1.put(3, "maya");
		tm1.put(5, "tom");
		tm1.put(2, "jerry");
		tm1.put(4, "neethu");
		tm1.put(1, "ann");
		System.out.println(tm1);

	}

}
//Output
//{1=ann, 2=jerry, 3=maya, 4=neethu, 5=tom}