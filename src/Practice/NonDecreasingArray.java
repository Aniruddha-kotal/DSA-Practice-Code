package Practice;

public class NonDecreasingArray {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {-98, -65 ,-18, 44, 6, 49, 64, 95, 81, 68};
        System.out.println(isPossible(arr,n));

    }
    public static boolean isPossible(int[] arr, int n) {

        if(n == 0 || n == 1){
            return true;
        }
        int count = 0;
        for(int i = 0;i < n-1;i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }

        if(count == 1){
            return true;

        }
        else
            return false;
    }
}
