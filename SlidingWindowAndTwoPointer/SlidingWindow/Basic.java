package SlidingWindowAndTwoPointer.SlidingWindow;
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

    //
}
