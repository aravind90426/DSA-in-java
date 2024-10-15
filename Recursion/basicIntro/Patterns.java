package Recursion.basicIntro;

import java.util.Arrays;

public class Patterns {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        BubbleSort(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }

    //1 star pattern


    public static void star(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(r>c)
        {
            System.out.print("* ");
            star(r,c+1);
        }
        else
        {
            System.out.println();
            star(r-1,0);
        }
    }

    //2 Star reverse

    public static void starRev(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(r>c)
        {
            starRev(r,c+1);
            System.out.print("* ");

        }
        else
        {
            starRev(r-1,0);
            System.out.println();

        }
    }

    // 3 Bubble Sort

    public static void BubbleSort(int[] arr,int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(r>c)
        {
            if(arr[c]>arr[c+1])
            {
                swap(arr,c,c+1);
            }


            BubbleSort(arr,r,c+1);
        }
        else
        {

            BubbleSort(arr,r-1,0);
        }
    }

    public static  void swap(int[] arr,int i , int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
