package com.main.loop;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber z = new PrimeNumber();
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
	 z.checkPrime(n);
			
		
	}
	public boolean checkPrime(int y){
		
		for (int i=2;i<=y/2;i++){
			if(y%i == 0){
				System.out.println(" not a prime number ");
				return false ;
			}
			
			}
		System.out.println(" prime number");
		return true;
	}
	
	

}
