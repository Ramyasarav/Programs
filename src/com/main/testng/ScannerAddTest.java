package com.main.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.fileHandling.ScannerAdd;

public class ScannerAddTest {
  @Test
  public void positive() {
	  ScannerAdd s= new ScannerAdd();
	  Assert.assertEquals(s.addScan(5,6), 11);
	 
}
  @Test
  public void negaitve(){
	  ScannerAdd s= new ScannerAdd();
	  Assert.assertEquals(s.addScan(-5,-6), -11);
	
	 
  }
  }
