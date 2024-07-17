package com.task7;

public class ArrayindexofboundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = new int[6];
		try {
			
			array[8]=100;
			System.out.println(array[8]);
		}
		catch(Exception e) {
			System.out.println("Array is out of the limit");
		}

	}

}
//Output
//Array is out of the limit