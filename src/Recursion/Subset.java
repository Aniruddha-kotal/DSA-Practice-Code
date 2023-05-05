package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {3,5,9};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        helper(arr,0,ans,subset);
        System.out.println(ans);
    }
    static void helper(int[] arr,int i,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> subset){

        if(i>=arr.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[i]);
        helper(arr,i+1,ans,subset);

        subset.remove(subset.size()-1);
        helper(arr,i+1,ans,subset);
    }
}
