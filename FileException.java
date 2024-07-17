package com.task7;

import java.io.File;
import java.io.FileReader;


public class FileException {

	public static void main(String[] args) {
		
		File fileObj = new File("Test.txt");  
     try {
    	 FileReader fr=new FileReader(fileObj);
    }catch(Exception e) {
		System.out.println("File not found");
		}
	}
}
//Output
//File not found