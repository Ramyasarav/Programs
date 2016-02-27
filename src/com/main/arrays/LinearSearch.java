package com.main.arrays;
import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

	public String linear(int a[],int search)
	{
	String found="no";
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==search)
			found="yes";
	}
return found;
}}
