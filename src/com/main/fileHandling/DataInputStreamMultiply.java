package com.main.fileHandling;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class DataInputStreamMultiply {

	public static void main(String[] args) throws IOException {
		DataInputStreamMultiply dism = new DataInputStreamMultiply();
		dism.readAndMultiply();

	}
	
	void readAndMultiply() throws IOException{
	
		   DataInputStream ds=new DataInputStream(System.in);
		   try
		   {
		   System.out.println("Enter the first");
		   int a=Integer.parseInt(ds.readLine());
		   System.out.println("Enter the second");
		   int b=Integer.parseInt(ds.readLine());
		   int c=a*b;
		   System.out.println("Product of the number is "+c);
		   
		   }catch (Exception e)
		   {
			   e.printStackTrace();
		   }
	}

}
