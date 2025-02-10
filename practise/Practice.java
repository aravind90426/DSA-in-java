package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Practice {


    public static void main(String[] args)
    {

        A a = new B();
        B b = (B)a;
        System.out.println(b.c);
       // System.out.println(  st(new int[]{1,2,3}));
    }
   public static ArrayList<ArrayList<Integer>> st(int[] arr)
   {
       ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
       outer.add(new ArrayList<>());
       for(int i:arr)
       {
           int n = outer.size();
           for(int j=0;j<n;j++)
           {
               ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
               inner.add(i);
               outer.add(inner);



           }
       }


return outer;



   }


}


class A{
    int a,b;

}

class B extends A{
    int c=10,d;
}



