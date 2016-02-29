package com.main.fileHandling;

import java.io.Console;

public class ConsolReader {
	
	public static void main(String[] args) {
		ConsolReader r = new ConsolReader();
		r.readAndPrint();
	}
	
	private void readAndPrint(){
		Console console = System.console();
		if(console == null){
			System.out.println("Cannot get console , quiting");
			return;
		}
		System.out.println("Enter first number ");
		int n1 = Integer.parseInt(console.readLine());
		
		System.out.println("Enter second number ");
		int n2 = Integer.parseInt(console.readLine());
		
		System.out.println("Divide result = " + n1/n2);
	}

}
