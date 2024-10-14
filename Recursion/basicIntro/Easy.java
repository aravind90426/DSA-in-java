package Recursion.basicIntro;

public class Easy {
    public static void main(String[] args) {
            System.out.println(steps(41));
    }

    //1  print 0-N;
    public static  void prin(int n) {
        if (n == 0)
        {
            System.out.println(n);
            return;
        }
        prin(n-1);
        System.out.println(n);
    }

    //2 print 5-0

    public static  void prinr(int n) {
        if (n == 0)
        {
            System.out.println(n);
            return;
        }
        prinr(n-1);
        System.out.println(n);
    }

    //3  factorial

    public static int fact(int n)
    {
        if(n==1)
            return 1;
        return n* fact(n-1);
    }

    // 4 Sum of digits

    public static int sum(int n)
    {
        if(n<10)
            return n;
        return  n%10+sum(n/10);
    }


    // 4 reverse a number
    public static int reverse(int n)
    {
        if(n<10)
            return n;
        return  (n%10)*(int)Math.pow(10,(int)Math.log10(n)) + reverse(n/10);

    }


    //5 count no of zeores in the number

    public static int countZero(int n, int count)
    {
        if(n==0)
            return count;

        if(n%10==0)
            return  countZero(n/10,count+1);
        else
            return  countZero(n/10,count);
    }


    // 6
    public  static  int steps(int n)
    {
        if(n==0)
            return  0;
        if((n&1)==1)
        {
            return steps(n-1)+1;
        }
        return steps(n/2)+1;
    }

}
