package Recursion.basicIntro.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

        public static void main(String[] args) {
            int arr[] = {2,5,7,6,3,1};
            ArrayList<Integer> ans = new ArrayList<>();
            //  System.out.println(p(arr,0, arr.length-1));
            p(arr,arr.length-1,0);
            System.out.println(Arrays.toString(arr));

        }
        public static void p(int[] arr,int r,int c)
        {

            if(r==0)
                return;
            if(r>c)
            {
                if(arr[c]>arr[c+1])
                {
                    int temp = arr[c];
                    arr[c]= arr[c+1];
                    arr[c+1]= temp;
                }

                p(arr,r,c+1);

            }
            else {

                p(arr,r-1,0);

            }

        }


}
