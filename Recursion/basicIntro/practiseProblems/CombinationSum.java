package Recursion.basicIntro.practiseProblems;
import java.util.*;

public class CombinationSum {
   //1)https://leetcode.com/problems/combination-sum/


    public static void main(String[] args) {
        int[] arr ={2,5,2,1,2};
        List<Integer> ans = new ArrayList<>();
        c2(arr,0,5,ans);
    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates,0,target,ds,ans);
        System.out.println(ans.toString());
        return ans;
    }

    public static void combination(int[] arr,int i, int target, List<Integer> a, List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(a));
            // System.out.println(ans.toString());
           //  System.out.println(a.toString());
            return;
        }
        if(i==arr.length)
            return;

        if(arr[i]<=target)
        {
            a.add(arr[i]);
            combination(arr,i+1,target-arr[i],a,ans);
            a.remove(a.size()-1);

        }
        combination(arr,i+1,target,a,ans);
    }






    //2 return list



        public List<List<Integer>> combinationSumArr(int[] candidates, int target) {
            List<Integer> ds = new ArrayList<Integer>();
            List<List<Integer>> ans = new ArrayList<>();

            // System.out.println(ans.toString());
            return combination(candidates,0,target,ds);
        }

        public List<List<Integer>>    combination(int[] arr,int i, int target, List<Integer> a)
        {     List<List<Integer>> ans = new ArrayList<>();

            if(target==0)
            {
                ans.add(new ArrayList<>(a));
                // System.out.println(ans.toString());
                // System.out.println(a.toString());
                return ans;
            }
            if(i==arr.length)
                return ans;

            if(arr[i]<=target)
            {
                a.add(arr[i]);
                ans.addAll( combination(arr,i,target-arr[i],a));
                a.remove(a.size()-1);

            }
            ans.addAll( combination(arr,i+1,target,a));
            return ans;
        }







        public static void c2(int[] arr, int i, int target,List<Integer> ds)
        {
            if(target==0)
            {
                System.out.println(ds.toString());
                return;
            }
            if(i==arr.length)
                return;
            if(arr[i]<=target)
            {
              ds.add(arr[i]);
            c2(arr,i+1,target-arr[i],ds);
            ds.remove(arr[i]);
            }
            c2(arr,i+1,target,ds);

        }
}
