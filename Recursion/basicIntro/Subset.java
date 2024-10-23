package Recursion.basicIntro;

import java.util.ArrayList;
import java.util.*;

public class Subset {

    public static void main(String[] args) {

    }

//1  https://leetcode.com/problems/subsets/submissions/


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int n:nums)
        {
            int s= outer.size();
            for(int i=0;i<s;i++ )
            {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(n);
                outer.add(inner);

            }
        }

        return outer;

    }

//2  https://leetcode.com/problems/subsets-ii/
public List<List<Integer>> subsets2(int[] nums) {

    List<List<Integer>> outer = new ArrayList<>();
      Arrays.sort(nums);
        outer.add(new ArrayList<>());
    int s=0;
    int e=0;
        for(int i=0;i<nums.length;i++)
    {


        if(i>=1&& nums[i]==nums[i-1])
        {
            s=e;
            e=outer.size();
        }
        else
        {
            s=0;
            e=outer.size();
        }
        for(int j=s;j<e;j++ )
        {
            List<Integer> inner = new ArrayList<>(outer.get(j));
            inner.add(nums[i]);
            outer.add(inner);

        }
    }

        return outer;
}

}
