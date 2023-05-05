package Practice;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int ans = missingPositive(arr);
        System.out.println(ans);

    }
    public static int missingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1)
                return index + 1;
            
        }
        return arr.length + 1;
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
