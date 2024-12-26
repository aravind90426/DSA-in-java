package Bitwise;

public class BitwiseQues {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,5,5,6,6,3};
        int n=15;
    //    resetithBit(n,4);
       // System.out.println(n);
       //System.out.println(+;
    }


    //1) odd or even using bitwise:

    public static boolean isOdd(int n)
    {
        return  (n&1)==1;
    }

    // 2) find the number with out twice there is only one number exist
    public static int withOutRepeat(int[] arr)
    {   int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp^=arr[i];
        }
        return temp;
    }
    //  find the ith bit
    public static int  ithbit(int n,int i)
    {
          return (n&(1<<i-1))!=0? 1:0;
    }

    // 4) set ith bit into 1
    public static void setithBit(int n,int i)
    {
        n= n|(1<<i-1);
        System.out.println(n);
    }
    // 5) Reset ith bit

    public static void resetithBit(int n,int i)
    {
        n = n & ~(1 << (i - 1));
        System.out.println(n);
    }

    // 6) find the first  setbit from the left
    public static  int nthSetBit(int n)
    {
        int t = (n&-n);
        System.out.println(Integer.toBinaryString(t));
        return t;
    }
    // 7)
}
