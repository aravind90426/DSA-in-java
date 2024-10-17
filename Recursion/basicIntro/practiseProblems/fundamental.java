package Recursion.basicIntro.practiseProblems;

public class fundamental {




    //1 https://leetcode.com/problems/valid-palindrome/submissions/
    public boolean isPalindrome(String s) {
        s= s.replaceAll("\\s","");


        s= s.toLowerCase();

        s=s.replaceAll("[^a-zA-Z0-9]","");

        return isIt(s,0,s.length()-1);
    }
    public boolean isIt(String s, int i,int j){
        if(i>j)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j))
        {System.out.println(i+" "+j);
            return false;
        }
        return isIt(s,i+1,j-1);
    }

}
