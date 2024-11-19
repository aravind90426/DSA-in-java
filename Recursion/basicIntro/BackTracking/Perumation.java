package Recursion.basicIntro.BackTracking;



import java.util.ArrayList;
import java.util.List;

public class Perumation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  a = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        p(nums,a,inner);
        return a;
    }
    public void p(int[] nums,List<List<Integer>> a,List<Integer> inner)
    {
        if(inner.size()==nums.length)
        {
            a.add(new ArrayList<>(inner));
            return;
        }
        for(int i:nums)
        {
            if(inner.contains(i))
                continue;
            inner.add(i);
            p(nums,a,inner);
            inner.remove(inner.size()-1);

        }
    }

}
