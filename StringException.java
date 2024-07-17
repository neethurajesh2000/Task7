package com.task7;

public class StringException {

	public static void main(String[] args) {
		try {
		String word="Neethu Mathew";
		System.out.println(word.charAt(25));
	}catch(StringIndexOutOfBoundsException e) {
		
		System.out.println("String index os out off range");
	}

	}	
}
//Output
//String index os out off range