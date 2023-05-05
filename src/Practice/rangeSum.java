package Practice;

public class rangeSum {
    public static void main(String[] args) {

        int[] nums = {1,5,3,2};
        long ans = sloution(nums);
        System.out.println(ans);
    }

    public static long sloution(int[] nums){

        int n = nums.length;

        int ans = 0;

        for (int i = 0; i < n; ++i) {
            int min = nums[i],max = nums[i];
            for (int j = i; j < n; ++j) {
                min = Math.min(nums[i],nums[j]);
                max = Math.max(nums[i],nums[j]);
                ans += max - min;

            }
        }
        return ans;



    }
}
