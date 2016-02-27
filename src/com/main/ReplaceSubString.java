//Write a program to find a substring in a given string and then replace it with another string.
package com.main;
import java.util.Scanner;

public class ReplaceSubString {
public String replace(String input,String subString,String replaced)
{
	String replacedString;
	replacedString=input.replaceAll(subString, replaced);
	System.out.println("THe replaced string is  " +replacedString);
	return replacedString;
}

}

