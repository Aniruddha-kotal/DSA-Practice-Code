package Practice;

import java.util.Scanner;

public class SubStringBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String input = sc.nextLine();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '0'){
                counter++;
            }else{
                counter--;
            }
        }

        if(counter == 0) System.out.println("String Balanced");
        else System.out.println("String not Balanced");
    }
}
