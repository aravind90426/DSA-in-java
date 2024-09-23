package LinkedList.SinglyLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int  size;

    public int deleteFront()
    {
        int value = head.data;

        head= head.next;
        if(head==null)
        {
            tail=null;
        }
        size-=1;
        return value;
    }
    public  int  deleteEnd()
    {
        int value = tail.data;
        if(size<=1)
            return  deleteFront();
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=null;
        return value;
    }
public int delete(int index){
        if(index==0)
        {
            return  deleteFront();
        }
        if(index==size-1)
        {
            return deleteEnd();
        }
    Node prev = get(index-1);
        int value = prev.next.data;
        prev.next=prev.next.next;
        return value;
}
    public Node get(int index)
    {
        Node temp = head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public  Node find(int value)
    {
        Node temp = head;
        while(temp!= null)
        {
            if(temp.data==value)
                return temp;
            temp=temp.next;
        }
        return  null;
    }
    public void insert(int data, int index)
    {
        if(index==0)
        {
            insertFront(data);
            return;
        }
        if(index==size)
        {
            insertEnd(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;

        }
        Node newNode = new Node(data,temp.next);
        temp.next=newNode;
        size+=1;
    }


    public void insertEnd(int data)       //o(1) time complexity use of tail
    {
        if(tail==null)
        {
            insertFront(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next=newNode;
        tail=newNode;
        size+=1;
    }
    public void insertFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
        if(head.next==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void display()
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

  public int size()
  {
      return size;
  }

    public LL()
    {
        size=0;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;

        }
        public Node(int data, Node next)
        {
            this.data= data;

            this.next=next;


        }
    }
}
