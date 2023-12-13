package Practice;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 7 ,3, 6,5 ,6};
        System.out.println(arrayEquilibriumIndex(arr));
    }
    public static int arrayEquilibriumIndex(int[] arr){

        int n= arr.length;
        for(int i = 0;i<n;i++){
            int sumleft = 0;
            int sumright = 0;
            for(int j = 0;j<i;j++){
                sumleft+=arr[j];
            }
            for(int j = i+1;j<n;j++){
                sumright+=arr[j];
            }
            if(sumleft == sumright)
            {
                return i;
            }
        }
        return -1;
    }
}
