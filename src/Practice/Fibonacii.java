package Practice;

public class Fibonacii {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1,num3;
        int n = 10;
        System.out.print(num1 +" "+num2);

        for (int i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.print(" " + num3);
        }
    }
}
