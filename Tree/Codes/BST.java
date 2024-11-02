package Tree.Codes;

import java.util.Scanner;

public class BST {
    public static class  Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
        public  Node(int value)
        {
            this.value=value;
        }
        public int getValue()
        {
            return  value;
        }

    }
    private Node root;

    public int height(Node node)
    {
        if(node == null) return -1;
        return node.height;

    }
    public boolean isEmpty() {
        return root == null;
    }



//insert section ---------------------------------------------------------------------------------

    public void insert(int value)
    {

            root = insert(value,root);
            return;

    }
    public Node insert(int value,Node node)
    {
        if(node == null)
        {
            Node nodee = new Node(value);
            return nodee;
        }
        if(node.value>value)
        {
            node.left=insert(value,node.left);
        }
        else {
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return  node;
    }
    public void insert(int[] arr)
    {
        for(int i:arr)
        {
            insert(i);
        }

    }


    //if sorted array can given as input it will insert linearly so use this technique

    public void insertSorted(int[] arr)
    {
        insertSorted(arr,0,arr.length);
    }
    public void insertSorted(int[] arr, int s, int e)
    {
        int mid = s+(e-s)/2;
        insert(mid);
        insertSorted(arr,s,mid);
        insertSorted(arr,mid,e);
    }
//------------------------------------------------------------------------------------------------------------


//check balnaced or not------------------------------------------------------------
    public boolean isBalanced(){
        return isBalanced(root);
        
    }
    public boolean isBalanced(Node node)
    {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

//-----------------------------------------------------------------------------------------------------------




    public void display(){
        display(root,"");
    }
    public void display(Node node,String s)
    {
        if(node == null)
        {
            return;


        }

        System.out.println(s+node.value);
        display(node.left,"left Node of "+node.value+" is : ");
        display(node.right,"Right node of "+node.value+" is : ");
    }

    public static void main(String[] args) {
        BST b = new BST();
        int[] arr = {15,11,12,10,18,17,16};
        b.insert(arr);
        b.display();
        System.out.println(b.isBalanced());

    }





}
