package Practice;

public class Palindrome1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};

        if(isPalindrome(arr))
            System.out.println("is palindrom");
        else
            System.out.println("not Palindrom");

    }
    public static boolean isPalindrome(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 1)
            return true;

        while(start < end)
        {
            if (arr[start]!= arr[end]) {
                return false;

            }
            start++;
            end--;
        }
        return true;


    }
}
