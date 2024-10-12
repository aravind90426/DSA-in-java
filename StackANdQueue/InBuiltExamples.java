package StackANdQueue;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {

        Stack<Integer> s= new Stack<>();
        s.add(10);
        s.add(11);
        s.add(20);
        s.add(12);
        s.add(188);
        s.add(1080);
        s.pop();
        System.out.println( s.toString());
        System.out.println(s.peek());
System.out.println(s.search(188));


//   Stack is an Class

// Queue is an interFace that can extends LinkedList , deque .. etc

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.toString());
        }



    /*

     Deque
     -----

        -> you can insert front or back
        -> you can remove also front or back

     */

    Deque<Integer> d = new ArrayDeque<>();
   // d.add(10);


}
