package SlidingWindowAndTwoPointer.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Sliding window

        -> it is a techinque in o(n) time complexity to find the subarray max or something


        [1,2,3,4,5]

        1St ->   [1,2,3]
        2nd ->   [2,3,4]
        3rd ->   [3,4,5]

          this way is known as sliding window

 */
public class Basic {

    public static void main(String[] args) {

    }


    //1   maximum sum
    //https://leetcode.com/problems/maximum-average-subarray-i/submissions/

    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=0;
        double avg;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i];
            sum-=nums[i-k];

            max=Math.max(max,sum);

        }

        return max;
    }

    //https://leetcode.com/problems/find-all-anagrams-in-a-string/submissions/

    public List<Integer> findAnagrams(String s, String p) {



        List<Integer> ans = new ArrayList<>();

        if(p.length()>s.length())
            return ans;

        int[] ss= new int[26];
        int[] pp = new int[26];
        for (char i : p.toCharArray()) {
            pp[i - 'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
            ss[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(ss,pp))
        {
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
            ss[s.charAt(i)-'a']++;
            ss[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(ss,pp))
                ans.add(i-p.length()+1);

        }


        return ans;


    }
}
