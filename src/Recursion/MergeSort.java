package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {3 ,4 ,1 ,6 ,2 ,5, 7};
//        arr = sort(arr);
//        System.out.println(Arrays.toString(arr));

        sortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] ans = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){

            if(first[i] < second[j]){
                ans[k] = first[i];
                i++;
            }else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;

    }

///////////////////////////////////////////////////////////////////////////////////////

    static void sortInPlace(int[] arr,int s,int e){
        if(e - s == 1) return;

        int mid = (s+e) / 2;
        sortInPlace(arr,s,mid);
        sortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr,int s,int m,int e) {

        int[] ans = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){

            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[s+l] = ans[l];
        }

    }
}
