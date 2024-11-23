package StackANdQueue.problems.stackProblems;
import java.util.*;
public class a0NearestNeighBour {

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

                ArrayList<Integer> ans = new ArrayList<>();
                Stack<Integer> s = new Stack<>();

                int i;
                for(i=0;i<arr.length;i++)
                {
                    while(!s.isEmpty() &&arr[ s.peek()]>=arr[i])
                    {
                        s.pop();
                    }
                    if(s.isEmpty())
                        ans.add(0);
                    else
                        ans.add(s.peek()+1);
                    s.push(i);
                }
                for(int k:ans)
                {
                    System.out.print(k+" ");
                }
                System.out.println("");
            }}


}
