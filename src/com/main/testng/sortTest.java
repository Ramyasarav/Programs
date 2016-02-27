package com.main.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.main.arrays.SortArray;

public class sortTest {
	@Test
	public void positive()
	{    SortArray sa=new SortArray();
		int a[]={3,8,4,10,6,5};
		int expected[]={3,4,5,6,8,10};
		int actual[]=sa.sort(a);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void negative()
	{    SortArray sa=new SortArray();
		int a[]={-3,-8,-4,-10,-6,-5};
		int expected[]={-10,-8,-6,-5,-4,-3};
		int actual[]=sa.sort(a);
		Assert.assertArrayEquals(expected, actual);
	}
}
