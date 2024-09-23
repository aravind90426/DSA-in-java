package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertFront(20);
        l.insertFront(30);
        l.insertEnd(10);
        l.insert(33,1);
        l.display();
        l.deleteFront();
        l.display();
        l.insert(55,1);
        l.insertFront(22);
        l.display();
        l.deleteEnd();
        l.display();
        l.delete(2);
        l.display();
        System.out.println(l.size());
        System.out.println(l.find(33));
    }
}
