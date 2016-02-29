//Write a program to reverse a string.
package com.main.string;

import java.util.Scanner;

public class Reverse {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String word=s.nextLine();
	System.out.println();
	String reverseWord="";
	for(int i=word.length()-1;i>=0;i--)
	{
		reverseWord+=word.charAt(i);
	}
	System.out.println("Reversed String");
	System.out.println(reverseWord);
}

}
