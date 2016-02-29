package com.main.loop;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber a= new ArmstrongNumber();
		Scanner s = new Scanner (System.in);		
		System.out.println("Enter the number ");
		int n=s.nextInt();
		a.Armstrong(n);
		
		}
	public int Armstrong (int n){
		int original = n;
		int d = 0;
		int sum = 0;
		while (n != 0){
			d=n%10;
			sum = sum + (d * d * d);
			n=n/10;			
			}
		if(sum == original){
			System.out.println("given number is an armstrong number ");	
		} else {
			System.out.println("given number is not an armstrong number ");
		}
		return n;
	}

	}


