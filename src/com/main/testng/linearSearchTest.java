package com.main.testng;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.main.arrays.LinearSearch;

public class linearSearchTest {


	@Test
	public void positive()
	{
		LinearSearch ls=new LinearSearch();
		int a[]={2,4,8,5,3,7};
		
		String accepted=ls.linear(a, 5);
		assertEquals(accepted,"yes");
	}
		
	@Test
	public void negative()
	{
		LinearSearch ls=new LinearSearch();
		int a[]={-2,-4,-8,-5,-3,-7};
		
		String accepted=ls.linear(a, -5);
		assertEquals(accepted,"yes");
	}
	@Test
	public void mixed()
	{
		LinearSearch ls=new LinearSearch();
		int a[]={2,4,-8,-5,3,-7};
		
		String accepted=ls.linear(a, -7);
		assertEquals(accepted,"yes");
	}
	@Test
	public void notfound()
	{
		LinearSearch ls=new LinearSearch();
		int a[]={2,4,8,5,3,7};
		
		String accepted=ls.linear(a, 10);
		assertEquals(accepted,"no");
	}
		
	
	}
	

