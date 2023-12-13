//Find a Pair Whose Sum is Closest to zero in Array [1,3,-5,7,8,20,-40,6]

class slotution{
    public static void main(String[] args) {
        int[] arr = {1,3,-5,7,8,20,-40,6};
        int n = arr.length;
        int[] ans = new int[2];
        int sum1 = Integer.MAX_VALUE;
        int sum2 = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = arr[i] + arr[j];

                if(sum > 0){
                    if(sum < sum1 ){
                        a = arr[i];
                        b = arr[j];
                        sum1 = sum;
                    }
                }
                else{
                    if(sum > sum2){
                        a = arr[i];
                        b = arr[j];
                        sum2 = sum;
                    }
                }
            }
        }
        System.out.println(a + "," + b);
    }
}