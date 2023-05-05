package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr1 = {1,5,9,11,13,15,17,20,21};
        int[] arr2 = {3,5,9,11};

        int[] ans = new int[arr1.length+arr2.length];
        sort(arr1,arr2,ans);

    }

    static void sort(int[] arr1,int[] arr2,int[] ans) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j])
            {
                ans[k] = arr1[i];
                i++;
            }
            else
            {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(ans));

    }


}
