package Hashing;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        // frequency of a number

        int arr[] = {1,8,5,9,6,6,6,6,11,6,2,6};
        int frq[] = new int[100];
        for(int i=0;i<arr.length;i++)
        {
            frq[arr[i]]++;
        }
       // System.out.println(frq[6]);



        //freq for characyers

        String a ="abababacf";
         int freq[]= new int[26];
         for(char i:a.toCharArray())
         {
             freq[i-'a']++;

         }
         for(int i=0;i<26;i++)
         {
             System.out.println(freq[i]);
         }
         System.out.println(freq['b'-'a']);
    }

}
