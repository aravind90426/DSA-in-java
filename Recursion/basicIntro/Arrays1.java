package Recursion.basicIntro;

import java.util.ArrayList;

public class Arrays1 {

    public static void main(String[] args) {
        int[] arr ={11,2,3,5};

        System.out.println(rbs(arr,2,0, arr.length-1));
    }

    // Array is sorted or Not

    //problem -1


    public static boolean isSorted(int [] arr,int index)
    {
            if(index+1== arr.length)
            {
                return  true;
            }
            return  arr[index]<arr[index+1] && isSorted(arr,index+1);
    }

    // problem -2
     //  if the target element is present in  or not

    public static  boolean searchh(int[] arr, int index,int target)
    {
        if(index== arr.length)
            return false;
        return  arr[index]==target || searchh(arr,index+1,target);

    }

    // add target element in arrayList

    // problem -3



    public  static  void  searchIndex(int[] arr, int index,int target, ArrayList<Integer> list)
    {
        if(index== arr.length)
        {
            return;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        searchIndex(arr,index+1,target,list);
    }


    // returning an array List in recursioin
    // problem -4

    public  static  ArrayList<Integer> sear(int[] arr,int target, int index)
    {
        ArrayList<Integer> a = new ArrayList<>();
        if(index==arr.length)
        {

            return a;
        }

        if(arr[index]==target)
        {
            a.add(index);
        }
        a.addAll(sear(arr,target,index+1));
        return a;
    }


    // Roated Binary Search


    public static  int rbs(int[] arr,int target, int s, int e)
    {
        if(s>e)
            return -1;
        int mid= s+(e-s)/2;
        if(arr[mid]==target)
            return  mid;

        if(arr[s]<=arr[mid])
        {
            if(target>=arr[s] && target <=  arr[mid])
                return rbs(arr,target,s,mid-1);
            else
                return rbs(arr,target,mid+1,e);
        }
        else if (target>=arr[mid] && target<=arr[e]) {
            return rbs(arr,target,mid+1,e);
        }
        return rbs(arr,target,s,mid-1);

    }


}
