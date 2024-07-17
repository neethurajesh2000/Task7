package com.task7;

import java.util.Scanner;

public class InvalidException {

	public static void main(String[] args) {
	
		try {
        	Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the age");
    		int age=sc.nextInt();
    		
    		if(age>18) {
    			System.out.println("You are above 18");
    		}else {
    			System.out.println("You are  not above 18");
    		}
        }
        catch (Exception e) {
            
            System.out.println("Exception occured");
        }
	}

}
//Output
//Enter the age
//20
//You are above 18
