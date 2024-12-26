package Tree.Codes;

import Tree.Codes.Tree_1.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    public static class Node{
        int value;
        BinaryTree.Node left;
        BinaryTree.Node right;
        Node(int val)
        {
            this.value=val;
        }

    }
    private  Node  root;
    public Node insert(Node node, ArrayList<Integer> arr) {
        Queue<Node> q = new LinkedList<>();

        q.add(node);
        for(int i=1;i<arr.size();i++){
           Node t= q.poll();
           t.left= new BinaryTree.Node(arr.get(i));
           q.offer(t.left);
           i+=1;
           if(i!= arr.size())
           {
               node.right= new BinaryTree.Node(arr.get(i));
               q.offer(node.right);
           }

        }

    }

}
