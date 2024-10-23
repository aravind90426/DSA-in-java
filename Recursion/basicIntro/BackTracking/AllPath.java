package Recursion.basicIntro.BackTracking;
import java.util.*;
public class AllPath {
    public static void main(String[] args) {

    }

    //backtracking

    //  naama oru valila porom antha vali thappunu therunchuchuna pona kalthadaia aluchutu vera valila porathu tha backtracking

    public static void AllPathmazeObstacle(boolean[][] arr,String p,int r, int c)
        {

            if(r== arr.length-1&&c==arr.length-1)
            {
                System.out.println(p);
                return;
            }
            if(arr[r][c]==true)
                return;
            arr[r][c]=true;
            if(r< arr.length-1)
            {
                AllPathmazeObstacle(arr,p+"D",r+1,c);

            }
            if(c< arr.length-1)
                AllPathmazeObstacle(arr,p+"R",r,c+1);
            if(r>0)
                AllPathmazeObstacle(arr,p+"U",r-1,c);
            if(c>0)
                AllPathmazeObstacle(arr,p+"L",r,c-1);

            arr[r][c]= false;
        }



        //print all path with numbers

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = true;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
    }

