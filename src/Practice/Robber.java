package Practice;

class Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int sum1 = 0;
        int sum2 = 0;
        while(i < n){
            sum1 += nums[i];
            i +=2;
        }

        while(j < n){
            sum2 += nums[j];
            j +=2;
        }


        return Math.max(sum1,sum2);
    }
}