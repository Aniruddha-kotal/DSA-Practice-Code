package Practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        long reverse = 0;

        while (input != 0)
        {
            long reminder = input % 10;

            reverse = reverse * 10 + reminder;

            input /= 10;
        }

        System.out.println(reverse);
    }
}
