package Practice;

public class rough {
    public static void main(String[] args) {
        class Solution
        {
            public static void sort012(int a[], int n)
            {
                int low = a[0];
                int mid = a[0];
                int high = n-1;

                while(mid < high){
                    if(a[mid] == 0){
                        int temp = a[low];
                        a[low] = a[mid];
                        a[mid] = temp;
                        mid++;
                        low++;
                    }else if(a[mid] == 1){
                        mid++;
                    }else if(a[mid] == 2){
                        int temp = a[high];
                        a[high] = a[mid];
                        a[mid] = temp;
                        high--;
                    }
                }
            }
        }

    }


}

