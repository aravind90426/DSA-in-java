package Recursion.basicIntro.BackTracking;

import java.util.ArrayList;

public class MazeProblems {

    public static void main(String[] args) {
        boolean[][] arr = new boolean[3][3];

        //AllPathmazeObstacle(arr,"",0,0);
        //System.out.println();
    }

    //In 3*3 matrix how many ways the man reaches at end in only down and right

    public static int maze(int r, int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int count =0;

        count+= maze(r-1,c);

        count+=maze(r,c-1);
        return count;
    }

    //print the direction
    public static  int  maze2(String p ,int r, int c)
    {
        if(r==1 && c==1) {
            System.out.println(p);
            return 1;
        }
        int count =0;
        if(r>1)
        count+=maze2(p+"D",r-1,c);
        if(c>1)
        count+=maze2(p+"R",r,c-1);
        return count;
    }
    public static  ArrayList<String>  mazeList(String p ,int r, int c)
    { ArrayList<String> ans = new ArrayList<>();
        if(r==1 && c==1) {
            ans.add(p);
            return ans;
        }

        if(r>1)
            ans.addAll(mazeList(p+"D",r-1,c));
        if(c>1)
            ans.addAll(mazeList(p+"R",r,c-1));
        return ans;
    }

    public static  ArrayList<String>  mazeAllPath(String p ,int r, int c)
    { ArrayList<String> ans = new ArrayList<>();
        if(r==1 && c==1) {
            ans.add(p);
            return ans;
        }


        if(r>1)
            ans.addAll(mazeAllPath(p+"D",r-1,c));
        if(c>1)
            ans.addAll(mazeAllPath(p+"R",r,c-1));
        if(r>1&&c>1)
            ans.addAll(mazeAllPath(p+"C",r-1,c-1));
        return ans;
    }
    public static void mazeObstacle(boolean[][] arr,String p,int r, int c)
    {

        if(r== arr.length-1&&c==arr.length-1)
        {
            System.out.println(p);
            return;
        }
        if(arr[r][c]==true)
            return;
        if(r< arr.length-1)
        {
            mazeObstacle(arr,p+"D",r+1,c);

        }
        if(c< arr.length-1)
            mazeObstacle(arr,p+"R",r,c+1);
        if(r< arr.length-1 && c< arr.length-1)
            mazeObstacle(arr,p+"C",r+1,c+1);


    }


}
