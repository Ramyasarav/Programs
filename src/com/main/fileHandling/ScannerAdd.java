package com.main.fileHandling;
import java.util.Scanner;

public class ScannerAdd {

	public static void main(String[] args) {

		ScannerAdd s = new ScannerAdd();
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the two numbers " );
		int x = s1.nextInt();
		int y = s1.nextInt();
		int z=s.addScan(x, y);
		
		System.out.println("sum of two numbers "+ z);
		
		
	}
	public int addScan(int x,int y){
						
		int z = x+y;
		return z;
		
	}
}