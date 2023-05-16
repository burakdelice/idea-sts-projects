package com.burakdelice;

public class _005_Break {
	
	public static void main(String[] args) {
		
	/*for (int i=0; i < 25; i++) {
		
		if(i==20) {
			System.out.println("20 SAYISINI BULDUM.");
			break;
		}
		else {
			System.out.println("DEĞİL: " +i);
		}
	
	}
	*/
	int i=0;
	while(i<25) {	
		if(i==20) {
			System.out.println("20 SAYISINI BULDUM.");
			break;
		}
		else {
			System.out.println("DEĞİL: " +i);
		}
		i++;
	}
		
	}
}
