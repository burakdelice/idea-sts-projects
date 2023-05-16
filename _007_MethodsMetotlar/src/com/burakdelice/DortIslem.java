package com.burakdelice;

public class DortIslem {


	public static void main(String[] args) {
		
		DortIslem obj = new DortIslem();
		
		int sonuc = obj.toplama(10, 5);
		System.out.println(sonuc);
		System.out.println(obj.bolme(10, 1));
		
	}

	private double bolme(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	private int toplama(int i, int j) {
		return i + j;
		
	}

}
