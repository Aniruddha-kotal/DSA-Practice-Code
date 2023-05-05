package Practice;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,2,345,1732};

        System.out.println(findDigits(arr));
    }
    static int findDigits(int[] arr)
    {
        int ans = 0;
        for(int nums : arr)
        {
            if(even(nums))
            {
                ans++;
            }
        }
        return ans;
    }

    private static boolean even(int nums) {
        int count = 0;

        while (nums > 0 )
        {
            count++;
            nums = nums/10;

        }
        if(count%2 == 0) {
            return true;
        }
        return false;
    }
}
