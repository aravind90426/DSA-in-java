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


        public int maxVowels(String s, int k) {

            int max=0;
            int l=0;
            int r=0;
            int sum=0;
            for(int i=0;i<k;i++)
            {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u')
                {
                    sum++;
                    max++;
                }
            }
            if(max==k)
                return k;
            r=k;
            while(r<s.length())
            {



                if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'|| s.charAt(l)=='u')
                    sum-=1;
                l++;

                if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'|| s.charAt(r)=='u')
                    sum+=1;
                r++;
                max= Math.max(max,sum);


            }
            return max;
        }


   // LEET CODE: 3 Longest substring  not repeated charcter
        public int lengthOfLongestSubstring(String s) {

            int l=0;
            HashSet<Character> h = new HashSet<>();
            int max=0;
            int r=0;
            while(r<s.length())
            {
                char ch = s.charAt(r);
                while(h.contains(ch))
                {
                    h.remove(s.charAt(l));
                    l++;
                }
                h.add(ch);


                max = Math.max(max,r-l+1);
                r++;

            }
            return max;
        }



        // 239:
    }

