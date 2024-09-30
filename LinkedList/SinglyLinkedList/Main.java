package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertFront(14);
        l.insertFront(2);
        l.insertFront(1);
        LL l2 = l;
        l2.insertFront(5);
        l2.insertFront(9);
        l2.insertFront(3);
        l2.insertFront(1);

        l.display();
        l.bubbleSort();

      l.display();





        System.out.println(l.size());

    }
}
