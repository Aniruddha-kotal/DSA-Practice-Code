package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {3,5,4,5,1,2,5,6,4,1,2,3,6,4,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int low,int high){

        if( low >= high) return ;

        int start = low;
        int end = high;
        int pivot = start + (end - start) /2;

        while (start <= end){
            while(arr[start] < arr[pivot]){
                start++;
            }
            while(arr[end] > arr[pivot] ){
                end--;
            }
            // check if its already sorted , if () is required

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        sort(arr,low,end);
        sort(arr,start,high);
    }
}
