package Recursion;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,18,32,23,0,5};
        int target = 0;
        System.out.println(search(arr,target,0));

    }
    static int search(int[] arr,int target,int index){
        if(arr[index] == target) return index;
        if(index == arr.length) return -1;

        return search(arr,target,index + 1);
    }
}
