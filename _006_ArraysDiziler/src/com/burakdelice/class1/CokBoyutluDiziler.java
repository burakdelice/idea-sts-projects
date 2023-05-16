package com.burakdelice.class1;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] myNumbers = new int[3];
	//	int [] myNumbers = {8, 44, 55};
		
		int [][] myNumbers = new int [3][5];
		
		myNumbers[0][0] = 10;
		myNumbers[0][1] = 15;
		myNumbers[0][2] = 15; 
		
		int[][]Array2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0;i<Array2.length ;i++) {
			for(int j=0; j<Array2[i].length ;j++) {
				System.out.print(Array2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
