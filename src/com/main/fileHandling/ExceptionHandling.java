package com.main.fileHandling;

public class ExceptionHandling {
	public static void main(String args[]) {

		ExceptionHandling tc = new ExceptionHandling();
		tc.tryExp();
		try {
			tc.throwExp();
		} catch (ArithmeticException e) {
			System.out.println("Catched Arithmetic Exception");
		}

	}

	private void tryExp() {
		String nullString = null;
		try {
			nullString.equals("mytest");
		} catch (Exception e) {
			System.out.println("Exception Catched");
		}

	}

	private void throwExp() throws ArithmeticException {
		throw new ArithmeticException();
	}
}
