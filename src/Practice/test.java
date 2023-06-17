package Practice;

public class test {
    public static void main(String[] args) {
        String str = "Reverse it";

        String ans = "";

        for (int i = str.length() - 1; i >=0; i--) {
            ans = ans + str.charAt(i);

        }

        System.out.println(ans);
    }
}

