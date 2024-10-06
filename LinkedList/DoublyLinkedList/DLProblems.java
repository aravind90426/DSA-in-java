package LinkedList.DoublyLinkedList;

public class DLProblems {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }}
    Node constructDLL(int arr[]) {

        if(arr.length==0)
            return null;
        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i=1;i<arr.length;i++)
        {
            curr.next=new Node(arr[i]);
            curr.next.prev=curr;
            curr=curr.next;
        }
        return head;

    }
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node curr = head;

        for(int i=0;i<p;i++)
        {
            curr = curr.next;
        }
        if(curr.next==null)
        {
            curr.next= new Node(x);
            curr.next.prev=curr;
            return head;
        }
        if(curr == head)
        {
            head.prev= new Node(x);
            head.prev.next=head;
            head=head.prev;
            return head;
        }

        Node n = curr.next;
        curr.next = new Node(x);
        curr.next.prev=curr;
        curr.next.next=n;
        n.prev=curr.next;


        //  System.out.println(curr.data);
        return head;
    }

    // q4)
    public Node deleteNode(Node head, int x) {
        // code here
        Node curr = head;
        for(int i=1;i<x;i++)
        {
            curr=curr.next;
        }
        if(curr==head)
        {
            if(curr.next!=null)
            {
                head=head.next;
                head.prev=null;
                curr.next=null;
                return head;
            }
            else
            {
                return null;
            }

        }
        if(curr.next==null)
        {
            curr=curr.prev;
            curr.next=null;
            return head;
        }

        Node temp =curr.prev;
        temp.next=curr.next;
        temp.next.prev=temp;

        return head;
    }

}
