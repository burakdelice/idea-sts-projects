package com.burakdelice;

public class _003_If_else_icice {

	public static void main(String[] args) {
		
		boolean saglikRaporu = false;
		int yasi = 15;
		
		if(saglikRaporu == true && yasi > 18) {
			System.out.println("EVET ehliyet almaya uygunsunuz.");
		}else {
			if(saglikRaporu == false) {
				System.out.println("Sağlık raporunuz geçersiz.");
			}
			if(yasi<18) {
				System.out.println("Yaşınız henüz 18 değil.");
			}
			System.out.println("Hayır ehliyet almaya uygun değilsiniz.");
		}
		System.out.println("----------------------------------");
		
		saglikRaporu = false;
		yasi = 15;
		
		if(saglikRaporu == true && yasi >= 18) {
			System.out.println("EVET ehliyet almaya uygunsunuz.");
		}else {
			if(saglikRaporu == false) {
				System.out.println("Sağlık raporunuz geçersiz.");
			}else {
				System.out.println("Sağlık raporunuz geçerlidir.");
			}
			
			if(yasi<18) {
				System.out.println("Yaşınız henüz 18 değil.");
			}else {
				System.out.println("Yaşınız uygundur.");
			}
			System.out.println("Hayır ehliyet almaya uygun değilsiniz.");

		}

	 }
	}
