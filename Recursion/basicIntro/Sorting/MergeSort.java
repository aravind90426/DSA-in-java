package Recursion.basicIntro.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] arr = {1,4,3,2,1,5,2535,644,545,4,31,4,33,45,66,3,3,3,3,5,6,67,6,5,45,64,65,6,4,6,7,464,6,4556,3,4};
    int[] brr ={4,5,6};
  // arr= merge(arr);
        mergeInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge(int[] arr)
    {
        if(arr.length==1)
            return  arr;
int mid = arr.length/2;

        int left[] = merge(Arrays.copyOfRange(arr,0,mid));
        int right[] = merge(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeInterval(left,right);



    }
    public static int[] mergeInterval(int[] left,int [] right)
    {
        int[] krr = new int[left.length+right.length];
        int i=0, j=0,k=0;
        while(i<left.length&& j<right.length)
        {
            if(left[i]<right[j])
            {
                krr[k++]=left[i++];
            }
            else {
                krr[k++]=right[j++];
            }
        }
        while(i<left.length)
        {
            krr[k++]=left[i++];
        }
        while(j<right.length)
        {
            krr[k++]=right[j++];

        }
        return krr;


    }
    public static  void mergeInplace(int[] arr, int s, int e){
        if(e-s==1)
            return;
          int mid = s+(e-s)/2;
          mergeInplace(arr,s,mid);
          mergeInplace(arr,mid,e);
          mergeIntervall(arr,s,mid,e);

    }
   public static void mergeIntervall(int[] arr , int s , int mid, int e )
   {
       int[] brr = new int[e-s];
       int i=s;
       int j=mid;
       int k=0;

       while(i<mid && j<e)
       {

           if(arr[i]<arr[j])
           {

               brr[k++]= arr[i++];

           }
           else {
               brr[k++]= arr[j++];
           }
       }
       while(i<mid)
       {
           brr[k++]= arr[i++];
       }

       while(j<e)
       {
           brr[k++]= arr[j++];
       }

       for(int z=0;z<brr.length;z++)
       {
           arr[z+s]=brr[z];
       }


   }
}
