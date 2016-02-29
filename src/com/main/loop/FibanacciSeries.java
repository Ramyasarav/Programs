package com.main.loop;
import java.util.Scanner;

public class FibanacciSeries {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the value for n: ");
	int n = s.nextInt();
	fibanacci(n);
	
	
	}
	public static void fibanacci(int n){
		
		int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) { 
        	int nextNumber = a + b;
            System.out.print(nextNumber + " ");
            a = b;
            b = nextNumber;
			
		
	}
	}
		
	}
			

