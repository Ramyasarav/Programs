package com.main.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.main.arrays.LargeNumArray;

public class LargeNumArrayTest {
	LargeNumArray ln;
@BeforeSuite
public void declare(){
	ln= new LargeNumArray();
}
	
  @Test
  public void positive() {
	  int a[]={2,1,5,9,3,6,8,};
	  //LargeNumArray L= new LargeNumArray();
	 int m= ln.largenumber(a);
	  Assert.assertEquals(m,9);	  
	  
  }
  
 /* @Test
  public void negative(){
	  int a[]={-12,-11,-5,-19,-13,-6,-8,};
	 // LargeNumArray L= new LargeNumArray();
	 int m= ln.largenumber(a);
	  Assert.assertEquals(m,-5);	
  }*/
  
  @Test
  public void empty(){
  int a[]={};
 // LargeNumArray L= new LargeNumArray();
 int m= ln.largenumber(a);
  Assert.assertEquals(m,0);	
  }
  @Test
  public void mixed(){
	  int a[]={2,11,7,-19,-13,-6,8,};
	  //LargeNumArray L= new LargeNumArray();
	 int m= ln.largenumber(a);
	  Assert.assertEquals(m,11);	
  }
}
