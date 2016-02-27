package com.main.loop;
import java.util.Scanner;

public class swapwiththirdNumber {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter the two numbers ");
			
		Scanner a = new Scanner(System.in);
		x=a.nextInt();
		y=a.nextInt();
		System.out.println("you entered x=" +x);
		System.out.println("you entered y=" +y);
		
		z=y;
		y=x;
		x=z;
		System.out.println("swapped number x= "+x );
		System.out.println("swapped number y="+y );
		
		

	}

}
