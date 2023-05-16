package com.burakdelice.class2;

import java.util.Random;
import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir tablo sayısı girin: ");
		int table = scanner.nextInt();
		System.out.println("Bir satır sayısı girin: ");
		int satir = scanner.nextInt();
		System.out.println("Bir sütun sayısı girin: ");
		int sutun = scanner.nextInt();
		int[][][] yourArr = new int[table][satir][sutun];

		Random random = new Random();

		for (int i = 0; i < table; i++) {
			for (int j = 0; j < satir; j++) {
				for (int k = 0; k < sutun; k++) {
					yourArr[i][j][k] = random.nextInt(200);
				}
			}
		}

		for (int i = 0; i < table; i++) {
			System.out.println("------- Table ("+(i+1)+")----------");
			for (int j = 0; j < satir; j++) {
				for (int k = 0; k < sutun; k++) {
					System.out.print(yourArr[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
