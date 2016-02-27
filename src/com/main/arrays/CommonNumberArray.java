package com.main.arrays;

import java.util.Random;

public class CommonNumberArray {

				public static void main(String[] args) {

		    int a[]= new int[20];
		    System.out.print("[a] = [");
		    for (int j = 0; j < a.length; j++) {
				a[j] = new Random().nextInt(50);
				System.out.print(a[j] + ",");
			}   
		   System.out.println("]");
		   System.out.print("[a1] = [");
		    int a1[]= new int[20];
		    for (int j = 0; j < a1.length; j++) {
				a1[j] = new Random().nextInt(50);
				System.out.print(a1[j] + ",");
			}  
		    System.out.println();
		     for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a1.length; j++) {
					if (a[i] == a1[j]){
						System.out.println( a[i] );
					}
				}
			}
		    
		    } // END of Main		
			
			
		   
		   

			}


