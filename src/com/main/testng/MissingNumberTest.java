package com.main.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.arrays.MissingNumberArray;

public class MissingNumberTest {

  @Test
  public void missingNumber() {
    MissingNumberArray m = new MissingNumberArray();
    int mNumber = m.missingNumber();
    Assert.assertEquals(mNumber, 6);
  }
}
