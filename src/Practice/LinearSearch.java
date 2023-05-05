package Practice;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {23,45,1,2,8,1,9,-3};
    int target = -3;
        int ans = linear(arr, target);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        if(arr.length == 0)
         return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
            return i;
        }
        return -1;
    }
}
