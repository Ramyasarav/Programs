package com.main;
import java.util.Random;

public class Randomnumbers {
	
	public static void main(String[] args) {
		Random r = new Random() ;
		int num;
		for (int i = 0; i < 10; i++) {
				
		System.out.println(r.nextInt(100));
		}

	}

}