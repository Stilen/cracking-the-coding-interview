package chapter1;

public class Q7 {

	//Time: O(n^2) Space: O(1)
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i < n/2 + n%2; i++){
			for(int j=0;j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][n-i];
				matrix[j][n-i] = matrix[n-i][n-j];
				matrix[n-i][n-j] = matrix[n-j][i];
				matrix[n-j][i] = temp;
			}
		}
	}
}
