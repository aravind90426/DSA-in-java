package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertFront(4);
        l.insertFront(2);
        l.insertFront(1);
        LL l2 = new LL();
        l2.insertFront(5);
        l2.insertFront(4);
        l2.insertFront(3);
        l2.insertFront(1);
        l.display();
        l2.display();
        LL.merge(l,l2).display();



        System.out.println(l.size());

    }
}
