package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static int f(int n,int[] dp){
        if(n <=1){
            return n;
        }
        if(dp[n] != -1) return dp[n];
        return dp[n] = f(n-1,dp) + f(n-2,dp);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to get the fibonacci series");
        int n = sc.nextInt();

//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        System.out.print("0 ");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(f(i,dp) + " ");
//        }5
//        System.out.println(f(n,dp));


//        tabulation - memory optimized
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2 ; i <=n; i++) {
            int curi = prev1 + prev2;
            prev2 = prev1;
            prev1 = curi;
        }
        System.out.println(prev1);

    }
}
