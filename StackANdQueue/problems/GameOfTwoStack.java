package StackANdQueue.problems;

import java.util.Arrays;
//



//  https://www.hackerrank.com/challenges/game-of-two-stacks/problem




public class GameOfTwoStack {
//
    public int twoStack(int x,int[] a,int[] b)
    {
        return twoStack(x,a,b,0,0)-1;
    }

    private int twoStack(int x, int[] a, int[] b, int sum, int count) {
        if(sum>x)
        {
            return  count;
        }
        if(a.length==0||b.length==0)
        {
            return count;
        }
        int l = twoStack(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int r = twoStack(x,a, Arrays.copyOfRange(b,1,b.length),sum+a[0],count+1);
        return (l>r)?l:r;
    }
}
