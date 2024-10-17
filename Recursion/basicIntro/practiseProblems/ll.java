package Recursion.basicIntro.practiseProblems;

public class ll {

    //  1   https://leetcode.com/submissions/detail/1424860881/  power of n
        public double myPow(double x, int n) {
            double ans=0;

            long   nn =(n<0)?(long)-1*n:(long)n;
            //  System.out.println(nn);
            ans= my(x,nn);
            if(n<0)
            {
                ans=(double)1.0/(double)ans;


            }
            return ans;
        }


        public double my(double x, long n) {
            if(n<=0)
            {

                return 1;
            }
            if(n%2==0)
            {double half = my(x, n / 2);
                return half*half;
            }

            return x * my(x,n-1);
        }




        //2



    }

