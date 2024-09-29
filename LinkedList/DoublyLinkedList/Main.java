package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DL l = new DL();
        l.insertFront(29);
        l.insertFront(129);
        l.insertFront(27);
        l.insertFront(229);
        l.insertFront(2009);
        l.display();
        l.deleteFront();
        l.insertEnd(22);
        l.display();
        l.deleteRear();
        l.display();
        l.delete(1);
        l.display();

        System.out.println(l.getSize());
    }
}
