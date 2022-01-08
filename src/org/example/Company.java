package org.example;

public class Company {

	private void m1() {
		System.out.println("m1 created by A branch");

	}
	private void m2() {
		System.out.println("method created by B");
	}
	private void m3() {
		System.out.println("m3 created by C branch");
	}


	public static void main(String[] args) {
		int a=100;
		System.out.println(a);
	}

}
