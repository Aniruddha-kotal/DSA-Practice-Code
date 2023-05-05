package Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        //helper("",4);
        System.out.println(helperret("",4));
    }
    static void helper(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            helper(p + i,target - i);
        }
    }

    static ArrayList<String> helperret(String p,int target){
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(helperret(p + i,target - i));
        }
        return list;
    }
}
