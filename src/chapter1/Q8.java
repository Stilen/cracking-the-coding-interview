package chapter1;

import java.util.BitSet;


public class Q8 {
	
	
	//Time: O(n^2) Space: O(m+n)
	public static void setZeroes(int[][] matrix) {
		BitSet rows = new BitSet(matrix.length);
		BitSet cols = new BitSet(matrix[0].length);
		
		getZeroes(rows, cols, matrix);
		
		for(int i=0; i<matrix.length; i++)
			for(int j=0;j<matrix[0].length; j++){
				if(rows.get(i) || cols.get(j)) matrix[i][j] = 0;
			}
	}
	
	private static void getZeroes(BitSet rows, BitSet cols, int[][] matrix) {
		for(int i=0; i<matrix.length; i++)
			for(int j=0;j<matrix[0].length; j++){
				if(matrix[i][j]==0){
					rows.set(i);
					cols.set(j);
				}
			}
	}

}
