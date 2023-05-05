package Practice;

class Solution {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    static public int strStr(String haystack, String needle) {
//        int n = haystack.length() - 1;
//        int m = needle.length() - 1;
//
//        for(int i = 0 ; i <= n;i++){
//            if(haystack.substring(i,i+m).equals(needle))
//                return i;
//        }
        return haystack.indexOf(needle);

    }
}