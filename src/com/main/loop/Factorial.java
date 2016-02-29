package com.main.loop;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial x= new Factorial();
		   Scanner a = new Scanner(System.in);
		   int n= a.nextInt();
		   int r= x.calcFactorial(n);
		    
		   
    System.out.println("Factorial Result is " + r);
    		
	}
	public int calcFactorial(int y){
		int r = 1;
		for (int i = 1; i <= y; i++) {
			r = r * i;			
		   }
		return r;
	}

}
