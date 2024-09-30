package PrefixAndSuffix;

import java.util.Arrays;

public class Problems {


    //

    // https://leetcode.com/problems/product-of-array-except-self/submissions/

    public static  int[] productExceptSelf(int[] nums) {
        int[] prefix= new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];
            suffix[nums.length-i-1]=suffix[nums.length-i]*nums[nums.length-i-1];

        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 && i+1<nums.length)
            {
                ans[i]=suffix[i+1];
            }
            else if(i==nums.length-1)
                ans[i]=prefix[i-1];
            else
            {
                ans[i]=prefix[i-1]*suffix[i+1];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int rel[]=new int[arr.length];
      rel = productExceptSelf(arr);
      System.out.println(Arrays.toString(rel));

    }
}
