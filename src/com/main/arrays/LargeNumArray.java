//2.a Write a program to find the largest number in a given array

package com.main.arrays;



public class LargeNumArray {

public int largenumber(int a[])
{
	int large=0;
	for(int i=0;i<a.length;i++)
	{
		if (a[i]> large)
		{
			large=a[i];
		}
	}
	System.out.println(large);
	return large;
}}