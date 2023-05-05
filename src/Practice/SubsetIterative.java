package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        int[] arr = {2,1,2,1};

        System.out.println(subsetDuplicate(arr));
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outter = new ArrayList<>();

        outter.add((new ArrayList<>()));

        for (int num : arr) {
            int n = outter.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outter.get(i));
                internal.add(num);
                outter.add(internal);
            }
        }


        return outter;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add((new ArrayList<>()));

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length;i++) {
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}