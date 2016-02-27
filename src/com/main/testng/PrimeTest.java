package com.main.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.loop.PrimeNumber;

public class PrimeTest {
  @Test
  public void positive() {
	  PrimeNumber a = new PrimeNumber();
	  Assert.assertEquals(a.checkPrime(5),"prime number");
	  
  }
  @Test
  public void negative(){
	  PrimeNumber a = new PrimeNumber();
	  Assert.assertEquals(a.checkPrime(-6)," not a prime number");
	  
  }
}
