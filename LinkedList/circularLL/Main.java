package LinkedList.circularLL;

public class Main {
    public static void main(String[] args) {
        CL l= new CL();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);

        l.display();
        l.delete(30);
        l.display();
        l.delete(20);
        l.display();



    }
}
