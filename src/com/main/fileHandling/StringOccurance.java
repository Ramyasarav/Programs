// Write a program to search for a string in a file and then return the count of number of occurrences of the string.
package com.main.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringOccurance {
	public static void main(String[] args) throws IOException {
		StringOccurance so=new StringOccurance();
		so.occurance("driver");		
	}
	
	private void occurance(String a) throws IOException{
		BufferedReader bi = new BufferedReader(new FileReader("C:\\Users\\work\\Desktop\\webdriver.txt"));
		int totalct = 0;
		while(bi.readLine() != null){
		String line = bi.readLine();
		String[] sArray = line.split(" ");
		for (int i = 0; i < sArray.length; i++) {
			if(sArray[i].contains(a)){
				totalct++;
			}			
		}
		}
		
		System.out.println("Total # of match " + totalct);
		

}}
