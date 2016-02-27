package com.main.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.loop.Factorial;

public class FactorialTest {
  @Test(priority=3)
  public void positive() {
	   Factorial x = new Factorial();	  
		Assert.assertEquals(x.calcFactorial(5),120);
  }	

  @Test(priority=2)
  public void negative(){
	  Factorial x= new Factorial();
	 Assert.assertEquals(x.calcFactorial(-2),1);
  }
  @Test(priority=1)
  public void zero(){
	  Factorial x= new Factorial();
	 Assert.assertEquals(x.calcFactorial(0),1); 
}
}