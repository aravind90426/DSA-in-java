package StackANdQueue;

public class Main {
    public static void main(String[] args) throws Exception {
       CircularQueue a = new CircularQueue(5);
        a.push(10);
        a.push(40);
        a.push(55);
      a.push(22);
      a.push(11);
     // a.push(222);
        a.display();
        a.pop();
      a.display();
      a.push(10);
      a.display();


     //   System.out.println(a.pop());
    }
}
