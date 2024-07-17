package com.task7;

import java.util.LinkedList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		
		 List<String> names = new LinkedList<String>();           
         names.add("Parvathy");  
         names.add("Don");  
         names.add("Jack");  
         names.add("Robert");  
         names.add("Mery");          
         String[] namesArray = names.toArray(new String[0]);  
                System.out.println("After converting List into an Array");           
         for (int i = 0; i < namesArray.length; i++) {  
         System.out.println(namesArray[i]);
         }  
	}
}
//Output
//After converting List into an Array
//Parvathy
//Don
//Jack
//Robert
//Mery