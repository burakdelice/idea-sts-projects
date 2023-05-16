package com.burakdelice;

public class Hello implements IHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello obj = new Hello();
		obj.selamVer();
		obj.kural3("Burak Delice");
	}

	@Override
	public void selamVer() {
		// TODO Auto-generated method stub
		System.out.println("SELAM");
	}

	@Override
	public void kural2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kural3(String mesaj) {
		System.out.println("Kural 3: "+mesaj);
		
	}
	
	

}
