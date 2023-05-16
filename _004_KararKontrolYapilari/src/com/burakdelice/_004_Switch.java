package com.burakdelice;

public class _004_Switch {

	public static void main(String[] args) {

		
		char harf = 'A';
		switch (harf) {
		
		case 'A':
			System.out.println("Seçilen : " + harf);
			break;

		case 'B':
			System.out.println("Seçilen : " + harf);
			break;
			
		case 'C':
			System.out.println("Seçilen : " + harf);
			break;
			
		case 'D':
			System.out.println("Seçilen : " + harf);
			break;
			
		case 'E':
			System.out.println("Seçilen : " + harf);
			break;
			
		default:
			System.out.println("Seçiminiz uygun değil.");
			break;
		
		}
		
		int haftaninGunu = 7;
		switch (haftaninGunu) {
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			
		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
			break;
		}

		
	}
	
}
