package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // String input = sc.next();
        String input = "My name is nitin and I speak malayalam";

        String[] words = input.split(" ");
        for (String str : words
         ) {
            if(isPalindrome(str))
            {
                System.out.println(str + " is palindrome");
            }

        }
    }
    public static boolean isPalindrome(String input)
    {
        int start = 0;
        int end = input.length() - 1;
        while (start<end)
        {
            if((input.charAt(start) != input.charAt(end)))
                return false;

            start++;
            end--;

        }
        return true;
    }
}
