package SlidingWindowAndTwoPointer.SlidingWindow;

public class Problems {

    // leetcode  1423. Maximum Points You Can Obtain from Cards

    public int maxScore(int[] c, int k) {
        int max=0;
        for(int i=0;i<k;i++) max+=c[i];
        int sum=max;

        int i=k-1;
        int j=c.length-1;
        while(i>=0)
        {

            sum-=c[i];
            sum+=c[j];
            i--;
            j--;


            max=Math.max(max,sum);
        }
        return max;
    }
}
