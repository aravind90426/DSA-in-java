package BinarySerach.Questions;

public class Main {

    //https://leetcode.com/problems/first-bad-version/

    public int firstBadVersion(int n) {
        // return helper(0,n);

        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public int helper(int s, int e)
    {
        if(s>=e)
            return s;
        int mid =s+(e-s)/2;
        if(isBadVersion(mid))
        {
            return helper(s,mid);
        }
        return helper(s,mid+1);

    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
