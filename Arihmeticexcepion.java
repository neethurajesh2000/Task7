package com.task7;

import java.util.Scanner;

public class Arihmeticexcepion {

	public static void main(String[] args) {
			
	        try {
	        	Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter first number");
	    		int num1=sc.nextInt();
	    		System.out.println("Enter second number");
	    		int num2=sc.nextInt();
	    		int result=num1/num2;
	    		System.out.println(result);
	        }
	        catch (ArithmeticException e) {
	            
	            System.out.println("Division by zero is no possible");
	        }
	}
}
//Output
//Enter first number
//12
//Enter second number
//0
//Division by zero is no possible