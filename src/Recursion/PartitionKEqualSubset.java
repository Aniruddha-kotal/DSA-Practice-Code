package Recursion;

public class PartitionKEqualSubset {
    public static void main(String[] args) {
        int[] nums = {4 ,3, 1, 3, 4, 3, 1, 2};
        int n = nums.length;
        int k = 3;
        System.out.println(canPartitionKSubsets(nums,n,k));

    }
    public static boolean canPartitionKSubsets(int[] nums, int n, int K) {
        int reqSum = 0;
        for(int i = 0;i<nums.length;i++){
            reqSum+=nums[i];
        }
        int[] visited = new int[n];
        if(reqSum%K != 0)return false;
        return help(0,0,0,reqSum/K,K,nums,visited);
    }
    public static boolean help(int i,int bucketNum,int bucketSum, int reqSum,int K,int[] nums,int[] visited){

        // base conditions
        if(bucketNum == K) return true; // we got our K buckets

        if(bucketSum == reqSum){
            // we got our perfect bucket, we will check for other buckets from start
            return help(0,bucketNum + 1,0,reqSum,K,nums,visited);

        }
        if(bucketSum > reqSum) return false;
        if(i>=nums.length) return false;


        // first we will check if the i th element is taken or not
        // if not, we will take it.


        if( visited[i] == 1){
            return help(i+1,bucketNum,bucketSum,reqSum,K,nums,visited);
        }
        // if not taken we have two option , 1 - to take , 2 -  to ignore

        else{
            // pick
            bucketSum += nums[i];
            visited[i] = 1;
            boolean op1 = help(i+1,bucketNum,bucketSum,reqSum,K,nums,visited);

            // ignore
            //backtracking
            bucketSum -= nums[i];
            visited[i] = 0;
            boolean op2 = help(i+1,bucketNum,bucketSum,reqSum,K,nums,visited);

            return op1 || op2;

        }
    }
}
