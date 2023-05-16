package com.burakdelice;

public class MethodCagirma {

	void selamVer() {
		System.out.println("SELAM VER METODU");
	}

	void selamAl() {
		System.out.println("SELAM AL METODU");
	}

	public static void main(String[] args) {
		
		MethodCagirma obj = new MethodCagirma();
		obj.selamAl();
		obj.selamVer();
	}

}
