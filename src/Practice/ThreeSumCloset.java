package Practice;

import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0};
        int target = -100;
        System.out.println(threeSumClosest(arr,target));
    }
    static public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length;i++){

            int lo = i+1;
            int hi = nums.length - 1;



            while(lo<hi){
                if(nums[i] + nums[lo] + nums[hi] == target){
                    return target;
                }
                else if(Math.abs(nums[i]+nums[lo] + nums[hi] - target) < diff) {
                    diff = Math.abs(nums[i]+nums[lo] + nums[hi] - target);
                    ans = nums[i] + nums[lo] + nums[hi];
                }

                if(nums[i] + nums[lo] + nums[hi] > target){
                    hi--;

                }else{
                    lo++;

                }

            }
        }
        return ans;
    }
}
