package Practice;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2};
        System.out.println(findPeak(arr));

    }
    static int findPeak(int[] arr){
        int e = arr.length -1;

        int s = 0;
        while(s<e)
        {
            int mid = (s+e) / 2;
            if(arr[mid]<arr[mid+1])
                s=mid+1;
            else
                e=mid;
        }
        return e;

    }
}
