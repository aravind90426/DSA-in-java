package Recursion.basicIntro.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]= {5,4,3,6,3,3,2,1};
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int l , int r){
        if(l>r)
        {
            return;
        }
        int s= l; int e = r;
        int pivot = arr[s+(e-s)/2];
        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp =  arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            quickSort(arr,l,e);
            quickSort(arr,s,r);

        }

    }

}
