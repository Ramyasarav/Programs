package com.main.fileHandling;

import java.io.File;

public class ListFiles {
	
	public static void main(String[] args) {
		ListFiles lf = new ListFiles();
		lf.listFiles("C:\\");
	}

	private void listFiles(String path){
		File f = new File(path);
		if (f.isDirectory()) {
			String[] list = f.list();
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		} else {
			System.out.println("Not a directory");
		}
	}
}
