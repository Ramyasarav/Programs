package com.main.loop;

public class pingPong {

	public static void main(java.lang.String[] args) {
		int i  = 1;
		while (i <= 50){
			if (i%3==0){
				System.out.println("fuzz");
			}
			else if (i%5==0){
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			
			i++;
		}

	}

}
