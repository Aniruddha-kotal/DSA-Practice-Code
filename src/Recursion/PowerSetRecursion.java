package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PowerSetRecursion {
    public static void main(String[] args) {

        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println((pwset(set)));


    }

    public static void helper(ArrayList<Integer> v, int i, ArrayList<Integer> subSet, ArrayList<ArrayList<Integer>> ans) {
        // base condition

        if (i == v.size()) {
            ans.add(new ArrayList<>(subSet));
            return;
        }

        // pick the ith element

        subSet.add(v.get(i));
        helper(v, i + 1, subSet, ans);

        // backtrack & undo the changes that were made

        subSet.remove(subSet.size() - 1);

        // skip the ith element

        helper(v, i + 1, subSet, ans);
    }

    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();  // 2D arraylist for the result
        ArrayList<Integer> subSet = new ArrayList<>();  // 1D arraylist for saving the subset
        helper(arr, 0, subSet, ans); // this will take 1D arratlist from main, and create subset ans save that subset in the ans 2d arraylist and return that.
        return ans;
    }
}
