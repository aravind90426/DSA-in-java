package LinkedList.DoublyLinkedList;

public class DL {

    private Node head;
    private Node tail;
    private int size;
    public DL()
    {
        size=0;
    }
    public int deleteFront(){
        if(size<1) {
            System.out.println("Umderflow");
            return -1;
        }
        int value= head.data;
        head=head.next;
        if(head!=null)
            head.prev=null;
        size-=1;
        return value;

    }
    public  int deleteRear()
    {
        if (size < 1) {
            System.out.println("Umderflow");
            return -1;
    }
        int val = tail.data;

        tail=tail.prev;
        tail.next=null;
        size-=1;
        return val;

    }

public   int delete(int index)
{
    if(size<1)
    {
        System.out.println("Empty");
        return -1;
    }
    if(index==0)
    {
        return  deleteFront();
    }
    if(index==size-1)
        return deleteRear();
    Node temp = get(index-1);
    int val = temp.next.data;
    temp.next=temp.next.next;
    temp.next.prev=temp;
    return  val;

}
    public void insertFront(int data)
    {
        Node node = new Node(data);
        node.next=head;

        if(head!=null)
            head.prev=node;
        head=node;
        if(tail==null)
            tail=head;
        size+=1;
    }
    public void insertEnd(int data)
    {
        if(tail==null) {
            insertFront(data);
            return;
        }

        Node node = new Node(data);
        node.prev=tail;
        tail.next=node;
        tail=node;
        size+=1;

    }
    public void insert(int data,int index)
    {
        if(index==0)
        {
            insertFront(data);
            return;
        }
        if(index==size-1) {
            insertEnd(data);
            return;
        }

        Node temp = get(index-1);
        Node node= new Node(data,temp,temp.next);
        temp.next.prev=node;
        temp.next=node;
        size+=1;
    }
    public int getSize()
    {
        return size;
    }
    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node= node.next;
        }

        return  node;
    }
    public void display()
    {
        Node node = head;
        while(node!=null)
        {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("End ");
    }
    public void displayReverse( ) {
        Node node = tail;
        while(node!=null)
        {
            System.out.print(node.data+" -> ");
            node=node.prev;
        }
        System.out.println("End");

    }




    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data=data;

        }
        public Node(int data, Node prev,Node next)
        {
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }

}
