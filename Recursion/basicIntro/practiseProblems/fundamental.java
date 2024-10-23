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


  //2  https://leetcode.com/problems/fibonacci-number/submissions/
    // fibonacci

  public int fib(int n) {
      if(n==0||n==1)
          return n;
      return fib(n-1)+fib(n-2);

  }

  //3  https://leetcode.com/problems/reverse-integer/
  public int reverse(int n) {
      if(n<10)
          return n;
      return  (n%10)*(int)Math.pow(10,(int)Math.log10(n)) + reverse(n/10);
  }
}



