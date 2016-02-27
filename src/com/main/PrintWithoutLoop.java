package com.main;

public class PrintWithoutLoop {

	public static void Pnt(int value){
		
		if (value<=15)		{
			System.out.println(value);
			value+=1;
		     Pnt(value);
		}
	}
  public static void main(String args[])
  {
	  int value=1;
	 PrintWithoutLoop.Pnt(value);
  }
}

