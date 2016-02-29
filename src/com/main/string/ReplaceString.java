//Write a program to find a substring in a given string and then replace it with another string.
package com.main.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceString {
	public static void main(String[] args) throws IOException {
		ReplaceString rs = new ReplaceString();
		rs.replace("driver", "testdriver");
	}

	private void replace(String find, String replace) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\work\\Desktop\\webdriver1.txt"));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\work\\Desktop\\webdriver.txt"));
		while (br.readLine() != null) {
			String line = br.readLine();			
			line = line.replaceAll(find, replace);
			bw.write(line);
		}

		bw.flush();
		bw.close();
	}

}