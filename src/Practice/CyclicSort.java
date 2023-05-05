package Practice;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       int[] arr = {9,8,7,6,5,4,3,2,1};
       cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static public void cyclicsort(int[] arr){
        int i = 0;
        while (i < arr.length-1){
            if(arr[i] == i+1){
                i++;
            }else{
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
