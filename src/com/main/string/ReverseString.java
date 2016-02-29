//Write a program to reverse each individual word in a sentence.
package com.main.string;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println("enter the string ");
		String x = a.nextLine();
		ReverseString r = new ReverseString();
		System.out.println("reverse string "+ r.reverseString(x));	
	}
	
	public String reverseString(String input){
		byte y[] = input.getBytes();
		byte r[] = new byte[input.length()];
		
		for (int i=1;i<=y.length;i++){
			r[i-1]=y[y.length-i];
			
		}
		return new String(r);	
	}

}
