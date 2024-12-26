package StackANdQueue.problems.stackProblems.MonoticStack;
import  java.util.*;
public class problems {


   // 1) Leetcode 496

    // Next greater ELEMENT
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] g = new int[nums2.length];
        HashMap<Integer,Integer> g = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums2[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                g.put(nums2[i],-1);

            }else{
                g.put(nums2[i],st.peek());

            }
            st.push(nums2[i]);


        }
        System.out.println(g);
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]= g.get(nums1[i]);
        }
        return ans;

    }

    // lettcode : 503  NextGreaterElement 2
      //  aim find Next greater Element in circular array

    // In the case of circular array u can use  ; double the array  which is imaginary and use modular operator to solve it.
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i=nums.length*2-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                if(i<nums.length)
                {
                    ans[i]=-1;

                }

            }
            else
            {
                if(i<nums.length)
                {
                    ans[i]=st.peek();

                }
            }
            st.add(nums[i%nums.length]);

        }
        return ans;

    }

    // next smaller element

    public int[] prevSmaller(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<A.length;i++)
        {
            while(!s.isEmpty() && s.peek()>=A[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=s.peek();
            }
            s.push(A[i]);

        }
        return ans;
    }
}
