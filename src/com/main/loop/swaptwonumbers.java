 package com.main.loop;
import java.util.Scanner;

public class swaptwonumbers {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter the numbers x and y: ");
		Scanner A = new Scanner(System.in);
		 x = A.nextInt();
	      y = A.nextInt();
	      System.out.println("you entered x="+x);
	      System.out.println("you entered y="+y);
	      x=x+y;
	      y=x-y;
	      x=x-y;
	      System.out.println("swapped number x="+x);
	      System.out.println("swapped  number y="+y);
	      
	    		  

	}

}
