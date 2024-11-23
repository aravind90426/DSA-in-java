package StackANdQueue.problems.stackProblems;
import java.util.*;
public class a1LargestRectangle {
    // Write your code here
// You can set your Template at profile settings [https://maang.in/profile/template-code]
// Write your code here
// You can set your Template at profile settings [https://maang.in/profile/template-code]


        public static void main(String[] args){
            Scanner si = new Scanner(System.in);
            int T= si.nextInt();
            for(int t=0;t<T;t++)
            {
                int N = si.nextInt();
                int arr[]= new int[N];
                for(int i=0;i<N;i++)
                {
                    arr[i]= si.nextInt();
                }

                ArrayList<Integer> leftMin = new ArrayList<>();
                ArrayList<Integer> rightMin = new ArrayList<>();

                Stack<Integer> s = new Stack<>();

                int n = arr.length;
                int i;
                for(i=0;i<arr.length;i++)
                {
                    while(!s.isEmpty() &&arr[ s.peek()]>=arr[i])
                    {
                        s.pop();
                    }
                    if(s.isEmpty())
                        leftMin.add(-1);
                    else
                        leftMin.add(s.peek());
                    s.push(i);


                }
                while(!s.isEmpty())
                    s.pop();

                for(i=n-1;i>=0;i--)
                {
                    while(!s.isEmpty() &&arr[ s.peek()]>=arr[i])
                    {
                        s.pop();
                    }
                    if(s.isEmpty())
                        rightMin.add(n);
                    else
                        rightMin.add(s.peek());
                    s.push(i);

                }
                Collections.reverse(rightMin);


                long max=0;
                long height=0;
                long width=0;
                long area =0;
                for(int i1=0;i1<n;i1++){
                    width=rightMin.get(i1)-leftMin.get(i1)-1;
                    height=arr[i1];
                    area=width*height;
                    max= Math.max(max,area);


                }
                System.out.println(max);

            }}


    }

