package com.main.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class SortArray {
public int[] sort(int a[])
{
	
	
		for (int i =1; i < a.length; i++) {
			for (int j=0;j < a.length-i; j++){
				if( a[j]>a[j+1])
				{
					int temp= a[j+1];
					a[j+1]=a[j];
			        a[j]=temp;
				}
			}
		}
		for(int b:a)
		{
			System.out.println(b);
		}
		return a;	
			
			
		}
		
	}

