package LinkedList.circularLL;

public class CL {
    private  Node head;
    private Node tail;
    private int size;
    public CL()
    {
        size=0;

    }
    public void  insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size += 1;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        size += 1;

    }
    public void delete(int val)
    {
        if(size<1)
            return;
        Node temp = head;

        if (head.data==val)
        {
            head=null;
            tail=null;
        }
         Node last ;

            while(temp.next.data!=val)
            {

                temp=temp.next;
            }
            temp.next=temp.next.next;

    }

    public void display() {
        Node temp = head;

        if (head != null) {
            do {


                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("End");

        }}
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }

            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
    }

