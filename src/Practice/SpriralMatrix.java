package Practice;

public class SpriralMatrix {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3 },
				{4,5,6},
				{7,8,9}
		};

		System.out.println("hello");


		spiralPrint(matrix);
	}

	public static void spiralPrint(int matrix[][]){
		int n = matrix.length;
		if(n == 0) {
			return;
		}
		int m = matrix[0].length;

		int left = 0;
		int right = n-1;
		int top = 0;
		int bottom = m-1;

		while(top<=bottom && left<=right){
			for(int j = left;j<=right;j++){
				System.out.print(matrix[top][j] + " ");
			}
			top++;
			for(int i = top;i<=bottom;i++){
				System.out.print(matrix[i][right] + " ");
			}
			right--;
			if(top<=bottom){
			for(int j = right;j>=left;j--){
				System.out.print(matrix[bottom][j] + " ");
			}

			bottom--;
			}
			if(left<=right){
			for(int i = bottom;i>=top;i--){
				System.out.print(matrix[i][left] + " ");
			}
			left++;
			}
		}
	}
}