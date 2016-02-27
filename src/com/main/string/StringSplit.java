////Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
package com.main.string;
import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the string ");
    String x= s.nextLine();
    String y[]= x.split(" ");
for (int i = 0; i < y.length; i++) {
	System.out.print(y[i] + (i+1) +" ");
}
	}

}
