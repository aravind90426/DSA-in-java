package Recursion.basicIntro.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int arr[] = {2,5,7,6,3,1};
        ArrayList<Integer> ans = new ArrayList<>();
        //  System.out.println(p(arr,0, arr.length-1));
        p(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void p(int[] arr,int r,int c,int max)
    {

        if(r==0)
            return;
        if(r>c)
        {
            if(arr[c]>arr[max])
            {
                max=c;
                System.out.println(max);
            }



            p(arr,r,c+1,max);

        }
        else {

            int temp = arr[r-1];
            arr[r-1]= arr[max];
            arr[max]= temp;
            p(arr,r-1,0,0);

        }





    }
}
