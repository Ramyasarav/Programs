package com.main.fileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	public static void main(String[] args) throws IOException {
		CountWords cw=new CountWords();
		cw.words();			
	}


	private void words() throws IOException{
		BufferedReader bi = new BufferedReader(new FileReader("C:\\Users\\work\\Desktop\\webdriver.txt"));
		int totalct = 0;
		while(bi.readLine() != null){
		String line = bi.readLine();
		String[] sArray = line.split(" ");
		int lcount = sArray.length;
		totalct = totalct + lcount;
		}
		System.out.println("Total words " + totalct);
		
	}
}
