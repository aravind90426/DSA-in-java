package Recursion.basicIntro.BackTracking;
import java.util.*;

import java.util.ArrayList;

public class Combinationsum3 {
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> ans =  new ArrayList<>();
            List<Integer> ds = new ArrayList<>();
            cs3(1,k,n,ds,ans);
            return ans;
        }
        public  void cs3(int i,int k,int n,List<Integer> ds,List<List<Integer>> ans )
        {
            if(k==0 &&n==0)
            {
                ans.add(new ArrayList(ds));
                return;
            }
            if(i>9)
                return;
            if(i<=n)
            {
                ds.add(i);
                cs3(i+1,k-1,n-i,ds,ans);
                ds.remove(ds.size()-1);

            }
            cs3(i+1,k,n,ds,ans);


        }
    }
}
