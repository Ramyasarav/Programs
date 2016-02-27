package com.main.arrays;
import java.util.Random;

public class Merge2Arrays {

	public static void main(String[] args) {
		int a[]= new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(50);
			System.out.println(a[i]);			
			
		}
		int a1[]=new int[10];
		for (int i = 0; i < a1.length; i++) {
			a1[i]=  new Random().nextInt(50);
			System.out.println(a1[i]);
			
			}
		int a2[]=new int[a.length+a1.length];
		for (int i = 0; i < a.length; i++) {
			a2[i]=a[i];
			a2[i+10]=a1[i];
						
		}
		System.out.println();
		int k=0;
		 for (int i = 0; i < a2.length; i++) {
			 k = a2[i];
			System.out.print(k +" ");
			
		}
			
		}	}


