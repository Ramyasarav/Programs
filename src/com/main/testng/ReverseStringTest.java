package com.main.testng;

import org.testng.annotations.Test;

import com.main.string.ReverseString;

public class ReverseStringTest {
	
@Test
public void testOneWord(){
	ReverseString r = new ReverseString();
	String rString = r.reverseString("ramya");
	
	
}

}
