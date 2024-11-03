package Tree.Codes;

public class SegnmentTree {
    public static void main(String[] args) {
        int arr[]={3,8,7,6,-2,-8,4,9};
        SegnmentTree tree = new SegnmentTree(arr);

        System.out.println(tree.query(2,6));
        //tree.display();
       // System.out.println(tree.query(2,6));
    }
    private static class Node{
         int value;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval,int endInterval)
        {
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }

    }
    Node root;
    SegnmentTree(int[] arr)
    {
        root=construct(arr,0,arr.length-1);
    }

    private Node construct(int[] arr, int s, int e) {
        if(s==e)
        {
            Node node = new Node(s,e);
            node.value=arr[s];
            return node;
        }
        Node node = new Node(s,e);
        int mid= s+(e-s)/2;
        node.left=construct(arr,s,mid);
        node.right= construct(arr,mid+1,e);

        node.value= node.left.value+node.right.value;
        return node;
    }

    public void display()
    {
       display(root);
    }
    public void display(Node node)
    {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.value + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.value + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.value;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }
    public int query(int s, int e)
    {
        return query(root,s,e);
    }
    public int query(Node node,int s,int e)
    {
        if(node.startInterval>=s && e>= node.endInterval)
        {
            return node.value;
        } else if (node.startInterval>e || node.endInterval<s) {
            return  0;

        }
        else
        return query(node.left,s,e)+query(node.right,s,e);
    }

    public void update(int index,int value)
    {
    root.value=update(root,index,value);
    }
    public int update(Node node,int index, int value)
    {
        if(index>=node.startInterval && index<=node.endInterval)
        {
            if(node.startInterval==node.endInterval)
            {
                node.value=value;
                return  node.value;
            }
           int left= update(node.left,index,value);
            int right=update(node.right,index,value);
            node.value= left+right;
            return  node.value;
        }
        else
            return node.value;
    }




}
