package Practice;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String str = "Aniruddha";
        removeChar(str,'a');
    }

    public static void removeChar(String str,char c)
    {
        int n = str.length();
        String str2 = "";

        for (int i = 0; i < n; i++) {
            if(str.charAt(i)!=c)
            {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);


    }
}