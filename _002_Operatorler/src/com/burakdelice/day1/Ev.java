package com.burakdelice.day1;

public class Ev {

	String sifre = "123";

	public Ev() {
		sifre = "456";
		System.out.println("Hazırlayıcı-Yapıcı: " + sifre);
	}

	public static void main(String[] args) {

		Ev ev = new Ev();
		System.out.println("main scope: " + new Ev().sifre);

	}

}
