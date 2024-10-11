package Recursion.basicIntro;

// Recursion : function calling it self

public class Basic {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};

        System.out.println(binarysearch(arr,9,0,arr.length-1));
    }





    //printing 1- 5 in recursion
    //problem 1;
    public static void prin(int n)
    {
        if(n==5)   // base condition
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        prin(n+1);

    }


    // when a function is not finishing executing . it will remain in the stack
    // it will finish executing then it will be removed from the stack;

    // BASE CONDITION

    /*
          -> condition for where function call stop executing


          No Base Condition;

             -> function call will keep happening;

             ->stack will be filled again and again

             -> memory of the computer will be filled

             -> it gives stack over flow error
     */


    // WHY RECURSION;

    /*
      -> it helps us to solve bigger/complex problem into simpler way;

      -> you can convert recursion solution into itertion and vice versa

      -> Space complexity not is constant because of recursion call

      ->It helps down into breaking the bigger problem to smaller problem


     */


//2) fibonacci series in recursion
 public static  int fibo(int n)
 {
     if(n==1|| n==0)
     {
         return n;
     }
     return fibo(n-1)+fibo(n-2);
 }

 //3) Recursive binary Search

    public static  int binarysearch(int[] arr, int target, int s , int e)
    {
            int mid = s+(e-s)/2;
            if(s>e)
            {
                return -1;
            }
            if(target==arr[mid])
            {
                return mid;
            }
            if(target>arr[mid])
                return binarysearch(arr,target,mid+1,e);
            else
                return binarysearch(arr,target,s,mid);



    }


}

