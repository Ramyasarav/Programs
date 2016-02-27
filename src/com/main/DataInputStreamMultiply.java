package com.main;

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
		//InputStreamReader is = new InputStream(System.in);
		DataInputStream dis = new DataInputStream(new ObjectInputStream(System.in));
		ObjectInputStream ois = new ObjectInputStream(new DataInputStream(System.in));
		
		int f = ois.
		//int g = dis.readInt();
		System.out.println(f + "," );
		//System.out.println("output multiply " + (f * g));
	}

}
