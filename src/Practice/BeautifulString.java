package Practice;

public class BeautifulString {
    public static void main(String[] args) {
        String str = "0000";
        int ans = makeBeautiful(str);

        System.out.println(ans);
    }
    public static int makeBeautiful(String str) {

        int n = str.length() - 1;

        String str1 = generateString(n,true);
        String str2 = generateString(n,false);

        int diff1 = deference(str,str1,n);
        int diff2 = deference(str,str2,n);

        return Math.min(diff1,diff2);
    }

    public static String generateString(int n, boolean zero){

        // if(n == 0) return str;
        String GenetratedString = "";
        if(zero){
            GenetratedString += "0";
            n--;
        }
        if(!zero){
            GenetratedString += "1";
            n--;
        }

        while(n>=0){

            if(GenetratedString.charAt(GenetratedString.length() - 1) == '0'){
                GenetratedString += "1";
            }
            else{
                GenetratedString += "0";
            }
            n--;
        }

        return GenetratedString;

    }

    public static int deference(String originalString, String generatedString, int n){
        int diff = 0;

        for (int i = 0; i<=n; i++) {
            if(originalString.charAt(i) != generatedString.charAt(i))
                diff++;
        }

        return diff;
    }
}
