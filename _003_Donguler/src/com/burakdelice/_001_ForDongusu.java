package com.burakdelice;

public class _001_ForDongusu {

	public static void main(String[] args) {
	
		for (int i = 0; i < 10 ; i++) {
			
			if(i == 3)
				System.out.println("ÜÇ SAYISINI BULDUM. " + i);
//			else
//			System.out.println(i);
			
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.println("i: " + i + "\t" + "j: " + j);
				}
			}
		}

	}

}
