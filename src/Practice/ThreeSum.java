package Practice;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,2,-1,-4};
        int target = 0;
        threeSum(arr,target);
    }

    //  Brute force - TC - O(n^3) + log(unique element)
    // SC -> 2* o(no. of triplets)
    // very high complexity

    public static void threeSum(int[] arr,int target){
        //List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> Unique = new HashSet<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Unique.add(temp);
                    }
                }

            }
        }
        System.out.println(Arrays.toString(new Set[]{Unique}));
    }
}
