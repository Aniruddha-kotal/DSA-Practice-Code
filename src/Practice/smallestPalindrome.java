package Practice;

import java.util.* ;
import java.io.*; 
public class smallestPalindrome {
//	public static String nextLargestPalindrome(String number, int length) {
//		int[] nums = new int[length];
//		for (int i = 0; i < length; i++) {
//			nums[i] = number.charAt(i) - '0';
//		}
//
//		int[] ans = generateNextPalindrome(nums, length);
//
//		String ansString = "";
//
//		for (int i = 0; i < ans.length; i++) {
//			ansString += ans[i];
//		}
//
//		return ansString;
//	}
	static String generatePalindrome(String num,int n){

		char[] CharArray = num.toCharArray();
		int mid = n/2;
		int i = mid-1;
		int j = (n % 2 == 0) ? mid : mid+1;

		boolean leftSmaller = false;
		while(i>=0 && CharArray[i] == CharArray[j]){
			i--;
			j++;
		}
		if(i<0 || CharArray[i]<CharArray[j]){
			// left side is smaller
			leftSmaller = true;
		}
		while(i>=0){
			CharArray[j]=CharArray[i];
			j++;
			i--;
		}
		if(leftSmaller){
			int carry = 1;
			if(n % 2 == 1){
				CharArray[mid]  +=1;
				carry = CharArray[mid] / 10;
				CharArray[mid] %= 10;
			}
			i = mid -1;
			j = (n % 2 == 0) ? mid : mid+1;
			while(i >= 0)
			{
				CharArray[i] = (char)((int)CharArray[i] + carry);
				carry = CharArray[i] / 10;
				CharArray[i] %= 10;
				CharArray[j] = CharArray[i];
				i--;
				j++;
			}
		}
		num = new String(CharArray);
		return num;
	}

//	static int[] generateNextPalindrome(int num[], int n)
//	{
//
//		if (isAll9(num, n)) {
//			int[] arr = new int[n+1];
//			arr[0] = 1;
//			arr[n] = 1;
////			for (int i = 1; i < n; i++){
////				arr[i] = 0;
////			}
////			arr[n-1] = 1;
//			return arr;
//
//		}
//		else {
//			return generatePalindrome(num, n);
//		}
//	}
	static boolean isAll9(int num[], int n) {
		for (int i = 0; i < n; i++)
			if (num[i] != 9)
				return false;
		return true;
	}

	static void printarray(int num[]) {
		for (int i = 0; i < num.length; i++)
			System.out.print(num[i]);
		System.out.println();
	}

	public static void main(String[] args)
	{
		//int num[] = { 1,0,0};
		String num = "23545";
		//String ans = nextLargestPalindrome(num, num.length());
		String ans = generatePalindrome(num, num.length());
		System.out.println(ans);
	}
	
}