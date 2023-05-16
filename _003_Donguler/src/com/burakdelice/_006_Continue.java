package com.burakdelice;

public class _006_Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 25; i++) {
			if(i==20) {
				System.out.println("20'yi buldum.");
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
