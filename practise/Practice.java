package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
       // System.out.println(ss("abc"));
        int arr[]= {1,2,2,3};
        ArrayList<ArrayList<Integer>>  outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0,e=0;
        for(int j=0;j<arr.length;j++)
        { s=0;
            if(j>0 && arr[j]==arr[j-1]){
                s = e;
            }
            e = outer.size();

            for(int i=s;i<e;i++)
            {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }


        }
        System.out.println(outer);

    }


    }




