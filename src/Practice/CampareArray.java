package Practice;

import java.util.Arrays;

public class CampareArray {
    public static void main(String[] args) {

        int[] arr1 = {3,2,5,7,4};
        int[] arr2 = {2,3,5,7,4};
        if(campare(arr1,arr2)) {
            System.out.println("arrays are equal");
        }
        else
            System.out.println("arrays are not equal");


    }

    public static boolean campare(int[] arr1,int[] arr2)
    {
        if(arr1.length != arr2.length)
        {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;

    }
}
