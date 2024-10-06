package LinkedList.SinglyLinkedList;

public class LL {


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
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    public Node insertRec(int val,int index,Node node)
    {

        if(index==0)
        {
            Node newNode = new Node(val,node);
            size+=1;
            return newNode;
        }
        node.next=insertRec(val,index-1,node.next);
        return  node;
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
    //problems

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public void duplicates()
    {
        Node node = head;
        while(node.next!= null)
        {
            if(node.data==node.next.data)
            {
                node.next=node.next.next;
                size-=1;
            }
            else
            node=node.next;
        }
    }

    // problem -2
    //
    //merge two list

    public static  LL merge(LL first,LL second)
    {
        Node f= first.head;
        Node s=second.head;
        LL ans = new LL();
        while(f!=null && s!=null)
        {
            if(f.data<s.data) {
                ans.insertFront(f.data);
                f=f.next;
            }
            else{
                ans.insertFront(s.data);
                s=s.next;
            }

        }
        while(f!=null)
        {
            ans.insertFront(f.data);
            f=f.next;
        }
        while(s!=null)
        {
         ans.insertFront(s.data);
         s=s.next;
        }
        return  ans;
    }


    // problem -3

    //has cycle

    //https://leetcode.com/problems/linked-list-cycle/submissions/




    /*
      it uses tow pointer
        -> slow pointer       -    run once step
        -> Fast pointer       -     Run two Steps

        at it has a cycle defenetly slow and fast pointer meet at one or two cycles
        if meet
            return true;


     */

    public static boolean hasCycle(Node head) {
        Node fast= head;
    Node slow =head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast==slow)
                return true;
        }


        return false;
    }


    /*
    Problem -4    Cycle Length

     same approach
     if we identified it has cycle when s==f
        pause the fast point
        move the slow poinert to the fast pointer and calculate the length;

     */

    public static int cycleLength(Node head) {
        Node fast= head;
        Node slow =head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast==slow) {

                int length=0;
                Node temp = slow;
                do{
                    temp=temp.next;
                    length+=1;
                }
                while(temp!=fast);
                return length;
            }
        }


        return 0;
    }

/*
      // problem -5

      //https://leetcode.com/problems/linked-list-cycle-ii/

      linked list cycle -II  aim ; to find the start index of the cycle

      1) find the length iof the cycle

      2) move th slow pointer to the length of cycle from the begining

      3) move slow pointer and fast pointer one by one they met at one point that is start of the cycle

 */

    public Node detectCycle(Node head) {
            int length= cycleLength(head);
            Node s =head;
            Node f=head;
            if(length==0)return null;
            while(length>0)
            {
                s=s.next;
                length--;
            }
            while(s!=f)
            {
                f=f.next;
                s=s.next;
            }
            return f;
    }
// problem no 6

    //https://leetcode.com/problems/happy-number/submissions/
    // we can use two pointer aproach whithout using linked list

    public boolean isHappy(int n) {
        int slow=n;
        int fast =n;
        do{
            slow= sqsum(slow);
            fast=sqsum(sqsum(fast));

        }while(slow!=fast);
            if(slow==1)
                return true;
            else
                return false;
    }
    public static int sqsum(int n){
        int temp=n;
        int ans=0;
        while(n>0)
        {
            int rem = n%10;
            ans+=rem*rem;
            n=n/10;

        }

        return ans;
    }


    //problem no 7
    //  finding middle of linked list
    //https://leetcode.com/problems/middle-of-the-linked-list/submissions/

    public Node middleNode(Node head) {
        Node slow =head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return fast;
    }

//problem no 8
    // mergesort

    //bubble sort;
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int r,int c){
        if(r==0)
            return;
        if(r>c) {
            Node f = get(c);
            Node s = get(c + 1);
            if (f.data > s.data) {
                if (f == head) {
                    head = s;
                    f.next = s.next;
                    head.next = f;
                }

             else if (s == tail) {
                Node prev = get(c - 1);
                prev.next = s;

                tail = s;
                f.next = null;
                s.next = tail;


            } else {
                Node prev = get(c - 1);
                prev.next = s;
                f.next = s.next;
                s.next = f;


            }}

            bubbleSort(r, c + 1);
        }
        else
            bubbleSort(r-1,0);

    }


    /*
    problem no 10;

    reverse using recursion


     */
    public void reverse(Node node)
    {
        if(node==tail)
        {
            head= tail;
            return;

        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }


    /*
    problem -11
    https://leetcode.com/problems/reverse-linked-list/submissions/
       with out recursion only have head

       using 3 pointers
       pres prev and next
     */

    public Node reverseList(Node head) {
        if(size<=1)
            return null;
       Node prev=null;
       Node pres=head;
       Node nextt=head.next;
        while(pres!=null)
        {

            pres.next = prev;
            prev = pres;
            pres=nextt;
            if(nextt!=null)
                nextt=nextt.next;



        }
        return prev;

    }
    //

// probvlem 12
    //https://leetcode.com/problems/reverse-linked-list-ii/
public Node reverseBetween(Node head, int l, int r) {
    if(l==r)return head;
    Node current=head;
    Node prev=null;
    // moving n-1 node
    for(int i=0;current.next!=null &&i<l-1;i++)
    {
        prev=current;
        current=current.next;
    }

    Node last=prev;
  Node lend=current;

    //reverse
    Node n=current.next;
    for(int i=0;i<r-l+1;i++)
    {
        current.next=prev;
        prev=current;
        current=n;
        if(n!=null)
            n=n.next;


    }
    if(last!=null)
        last.next=prev;
    else
        head=prev;


    lend.next=current;
    return head;
}
//problem 13
    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
    public Node deleteMiddle(Node head) {
        if(head.next==null)
            return null;
    Node slow = head;
       Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        prev.next=slow.next;
        return head;
    }
// problem no -14
    // is palindrome
    // reverse second half then check firat and second until null

    public boolean isPalindrome(Node head) {
        Node mi = middleNode(head);

        Node shead=reverseList(mi);
        Node s2head =shead;
        while(head!=null && shead!=null)
        {
            if(head.data!=shead.data)
            {
                break;
            }
            head=head.next;
            shead=shead.next;
        }

        return head==null || shead==null;




    }



//problem no - 15
public void reorderList(Node head) {
    if(head==null || head.next==null)
        return;

    Node mid = middleNode(head);


   Node hs= reverseList(mid);
  Node hf= head;
    // rearrange
    while(hf!=null && hs!=null)
    {
        Node temp = hf.next;
        hf.next = hs;
        hf=temp;

        temp=hs.next;
        hs.next=hf;
        hs=temp;
    }
    if(hf!=null)
        hf.next=null;


}
//https://leetcode.com/problems/reverse-nodes-in-k-group/
//problem no - 16
    public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }

    public int getLength(Node head) {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }




// https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
// problem no - 17
    public Node removeNthFromEnd(Node head, int n) {
        reverse(head);
        if(n==1)
        {
            head=head.next;
            if(head==null)
                return null;

        }
        else{


            Node prev= null;
            Node curr= head;


            for(int i=1;i<n;i++)
            { prev=curr;
                curr=curr.next;

            }
            if(curr!=null)
                prev.next=curr.next;

            else
            {
                prev.next=null;
            }

        }
         reverse(head);
        return head;
    }
//https://leetcode.com/problems/rotate-list/
    public Node rotateRight(Node head, int k) {
        if(head==null||head.next==null|| k<=0) return head;
       Node last = head;
        int length =1;

        while(last.next!=null)
        {
            last=last.next;
            length++;

        }

        int rotation = k%length;

        last.next=head;
        int skip = length-rotation;
        Node temp = head;
        for(int i=0;i<skip-1;i++)
        {
            temp=temp.next;


        }System.out.println(last.data);
        System.out.println(temp.data);

        head=temp.next;
        temp.next=null;





        return head;



    }
//https://leetcode.com/problems/delete-node-in-a-linked-list/
    public void deleteNodeNotGivenHead(Node node) {
        node.data = node.next.data;
        node.next=node.next.next;
    }
}
