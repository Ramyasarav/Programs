package com.main.fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {

	public static void main(String[] args) {
		try {
			new BufferReaderInput().readAndSubtract();
		} catch (IOException e) {
			System.out.println("Hey , you are not entering a number !!");
		} catch (Exception e) {
			System.out.println("Hey , you are not entering a number !!");
		}

	}
	
	public void readAndSubtract () throws IOException {
		BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));	
		
		String num1 = br.readLine();				
		Integer n1 = Integer.valueOf(num1);
		
		String num2 = br.readLine();
		Double n2 = Double.valueOf(num2);
		
		System.out.println("Result of " + n1 + " - " + n2 + " = " + (n1 - n2));
		
	}

}
