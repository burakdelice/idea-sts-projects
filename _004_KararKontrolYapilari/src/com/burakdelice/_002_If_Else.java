package com.burakdelice;

public class _002_If_Else {

	public static void main(String[] args) {

		System.out.println("-----------------------------");

		int haftaninGunu = 3;

		if (haftaninGunu == 1) {

			System.out.println("Pazartesi");

		} else if (haftaninGunu == 2) {

			System.out.println("Salı");

		} else if (haftaninGunu == 3) {

			System.out.println("Çarşamba");

		} else if (haftaninGunu == 4) {

			System.out.println("Perşembe");

		} else if (haftaninGunu == 5) {

			System.out.println("Cuma");

		} else if (haftaninGunu == 6) {

			System.out.println("Cumartesi");

		} else if (haftaninGunu == 7) {

			System.out.println("Pazar");
		} else {
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
		}
	}
}
