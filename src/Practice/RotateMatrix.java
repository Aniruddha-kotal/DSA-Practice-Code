package Practice;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Transpose(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Transpose(int[][] arr)
    {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[i][n - j -1];
                arr[i][n - j -1] = temp;

            }

        }
        return arr;
    }
}
