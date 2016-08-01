public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
		int L = matrix[0][0], R = matrix[0][n - 1] + 1;
		for (int i = 1; i < n; i++) {
			L = Math.min(L, matrix[i][0]);
			R = Math.max(R, matrix[i][n - 1] + 1);
		}
		while (L < R) {
			int mid = L + ((R - L) >> 1);
			int temp = 0;
			for (int i = 0; i < n; i++) temp += binary_search(matrix[i], n, mid);
			if (temp < k) L = mid + 1;
			else R = mid;
		}
		return L;
	}
	
	private int binary_search(int[] row,int R,int x){
	    int L = 0;
	    while (L < R){
	        int mid = (L + R) >> 1;
	        if(row[mid] <= x) L = mid + 1;
	        else R = mid;
	    }
	    return L;
	}
}