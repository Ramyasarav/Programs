package com.main.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.loop.ArmstrongNumber;

public class ArmstrongNumberTest {
  @Test
  public void positive() {
	  ArmstrongNumber a=new ArmstrongNumber();
	  Assert.assertEquals(a.Armstrong(371), "given number is an armstrong number");
  }
}
