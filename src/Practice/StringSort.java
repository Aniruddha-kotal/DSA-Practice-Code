package Practice;

public class StringSort {
    public static void sortString() {
        String str = "Computer Portal";
       //uppercase -  65 - 90
        // lower - 97 - 122;
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] - 0 < 90 && charArray[i] > 65){
                charArray[i] = (char)(charArray[i] + 32);
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i+1; j < charArray.length; j++) {
                if(charArray[i] > charArray[j]){
                    char ch = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = ch;
                }
            }
        }
        System.out.print("Sorted String : ");

        for (int i = 1; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }


//str  = "str  = "Computer Portal"
//
//insert String = "Science""
//
//insert String = "Science"

//ans = Computer Science Portal
public static void main(String[] args) {
    String str = "Computer Portal";

    String insert = "Science";
    sortString();
//    insert(str,insert);
}
public static void insert(String str, String insert){
    int n = str.length();
    int m = insert.length();
    String ans = "";

    int i = 0;
    int j = 0;

    while(i<n){
        ans = ans + str.charAt(i);

        if(str.charAt(i) == ' '){
            ans = ans + " ";
            while(j < m){
                ans = ans + insert.charAt(j);
                j++;
            }
            ans = ans + " ";
        }
        i++;
    }
    System.out.println(ans);
}

}
