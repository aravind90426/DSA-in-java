package Tree.Codes.Tree_1;
import java.util.*;
public class Problems {
    public static class Node{
        int value;
        Node left;
        Node right;
        Node(int val)
        {
            this.value=val;
        }

    }


    //1)
    //Given an integer i. Print the maximum number of nodes on level i of a binary tree.
    //
    //Example 1:
    //
    //Input: 5
    //Output: 16

    static int countNodes(int i) {
        // code here
        return (int)Math.pow(2,i-1);
    }






 //   2)


//You are given an array nodes. It contains 7 integers, which represents the value of nodes of the binary tree in level order traversal.
// You are also given a root of the tree which has a value equal to nodes[0].
//
//Your task to construct a binary tree by creating nodes for the remaining 6 nodes.

    public static void createTree(Node node, ArrayList<Integer> v ){
        // Code here
        Queue<Node> q = new LinkedList<Node>();

        q.offer(node);
        for(int i=1;i<v.size();i++)
        {
            Node temp = q.poll();
            temp.left = new Node(v.get(i));
            q.offer(temp.left);
            i=i+1;
            temp.right = new Node(v.get(i));
            q.offer(temp.right);
        }
    }

    // preOrder
    public List<Integer> preorderTraversal(Node root) {

        List<Integer> ans = new ArrayList<Integer>();

        if(root==null)
        {
            return ans;
        }

        ans.add(root.value);
        ans.addAll(preorderTraversal(root.left));
        ans.addAll(preorderTraversal(root.right));
        return ans;
    }


    //inorder
    public List<Integer> inorderTraversal(Node root) {

        List<Integer> ans = new ArrayList<Integer>();

        if(root==null)
        {
            return ans;
        }


        ans.addAll(inorderTraversal(root.left));
        ans.add(root.value);
        ans.addAll(inorderTraversal(root.right));
        return ans;
    }

    //post order

    public List<Integer> postorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<Integer>();

        if(root==null)
        {
            return ans;
        }


        ans.addAll(postorderTraversal(root.left));

        ans.addAll(postorderTraversal(root.right));
        ans.add(root.value);
        return ans;
    }

//Level order|| BFS
    public List<List<Integer>> levelOrder(Node root) {


        List<List<Integer>> outer = new ArrayList<>();
        if(root==null)
            return outer;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        { int si = q.size();
            List<Integer> inner = new ArrayList<>(si);
            for(int i=0;i<si;i++)
            {
                Node temp =q.poll();
                inner.add(temp.value);
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right !=null)
                {
                    q.offer(temp.right);
                }

            }
            outer.add(inner);

        }



        return outer;
    }





    public List<Double> averageOfLevels(Node root) {

        List<Double> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            double sum =0;
            for(int i=0;i<n;i++)
            {Node node = q.poll();
                sum=sum+node.value ;
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);

            }

            sum/=n;
            ans.add(sum);
        }
        return ans;
    }
}
