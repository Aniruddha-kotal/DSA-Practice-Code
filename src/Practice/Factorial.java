package Practice;

public class Factorial {
    public static void main(String[] args) {
        int num = 16;

//        for(int i = num -1;i > 0;i--)
//        {
//            num = num * i;
//        }
//
//        System.out.println(num);
        System.out.println(fact(num));
    }
    static int fact(int n)
    {
        if(n == 0)
            return 1;
        else
            return(n*fact(n-1));
    }
}
