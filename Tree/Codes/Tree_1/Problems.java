/*package Tree.Codes.Tree_1;
import javax.swing.tree.TreeNode;
import java.util.*;
public class Problems {
    public static class Node{
        int value;
        Node left;
        Node right;
        Node next;
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




// problem
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







    // level order scuccessor
    // Nextr element of successor

    public Node Successor(Node root,int target) {



        if(root==null)
            return null;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {

            Node temp =q.poll();

            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            if(temp.right !=null)
            {
                q.offer(temp.right);
            }
            if(temp.value==target)
                break;

        }






        return q.peek();
    }

// leetcode 103 zigzag printing
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>>  outer = new ArrayList<>();
        if(root == null) return outer;

        Deque<Node> q = new ArrayDeque<Node>();
        q.add(root);
        boolean rev = false;

        while(!q.isEmpty())
        { List<Integer> inner = new ArrayList<>();
            int n = q.size();
            if(!rev)
            {
                rev= true;
                for(int i=0;i<n;i++)
                {
                   Node node = q.pollFirst();
                    inner.add(node.value);
                    if(node.left!=null)
                        q.addLast(node.left);
                    if(node.right!=null)
                        q.addLast(node.right);
                }


            }
            else
            {
                rev= false;
                for(int i=0;i<n;i++)
                {
                    Node node = q.pollLast();
                    inner.add(node.value);
                    if(node.right!=null)
                        q.addFirst(node.right);
                    if(node.left!=null)
                        q.addFirst(node.left);

                }


            }
            outer.add(inner);
        }

        return outer;
    }


    // level order traversal 2;
    public List<List<Integer>> levelOrderBottom(Node root) {
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
            outer.add(0,inner);

        }


        return outer;


    }



// Leetcode 116   connect  like linked list in level order
    public Node connect(Node root) {
        if(root ==null) return null;

        Node leftMost = root;
        while(leftMost.left!=null)
        {
            Node current = leftMost;
            while(current !=null)
            {
                current.left.next= current.right;
                if(current.next!=null)
                {
                    current.right.next=current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;

        }

        return root;
    }

    // Leetcode : 199. Binary Tree Right Side View
    public List<Integer> rightSideView(Node root) {
        List<Integer> a = new ArrayList<>();
        if(root==null)
            return a;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty())
        {
            int l = q.size();
            for(int i=0;i<l;i++)
            {
                Node temp = q.poll();
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                if(i==l-1)
                    a.add(temp.value);
            }
        }
        return a;



    }
        // leetcode :993 cousins in BinaryTree

      public boolean isCousins(Node root, int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();

            ArrayList<Integer> arr = new ArrayList<>();
            int c=0;
            for(int i=0;i<n;i++)
            {
               Node temp = q.poll();

                   // check their current childs are not siblings
                if(temp.left!=null && temp.right!=null){
                    if((temp.left.value==x && temp.right.value==y  ) ||(temp.left.value==y && temp.right.value==x  ) ){
                        return false;
                    }

                }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                    if(temp.left.value==x || temp.left.value == y)
                        c++;
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                    if(temp.right.value==x || temp.right.value == y)
                        c++;
                }

            }
         //   if current level  both the x and y are present return true
            if(c==2)
                return true;
        }
        return false;


    }
// Leetcode: 101 Symmetric tree
    public boolean isSymmetric(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root==null) return true;

        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty())
        {

           Node n1=q.poll();
            Node n2 =q.poll();
            if(n1==null && n2==null)
            { continue;
            }
            if(n1==null || n2==null)
            {  return false;
            }
            if(n1.value!= n2.value)
            {  return false;
            }
             q.add(n1.left);
            q.add(n2.right);
            q.add(n1.right);
            q.add(n2.left);

        }
        return true;

    }


    // diameter of binary tree
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = height(root);

        return diameter-1;
    }
    public  int height(Node root)
    {
        if(root==null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);
        int dia = left + right + 1;
        diameter = Math.max(dia,diameter);
        return Math.max(left,right) + 1;
    }


//226. Invert Binary Tree
    public Node invertTree(Node root) {

        if(root==null) return null;
       Node temp = root.left;
        root.left=root.right;
        root.right = temp;
       root.left=  invertTree(root.left);
        root.right=  invertTree(root.right);
       return  root;


    }

    //104 maximum depth of the tree
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int left= maxDepth(root.left);
        int right= maxDepth(root.right);
        return Math.max(left,right)+1;

    }


    //114 flatten binary tree to linked list
    public void flatten(Node root) {
        Node current = root;
        while(current!=null)
        {   Node l1=current;
           Node temp = current.left;
            while(temp!=null)
            {
                if(temp!=null)
                {   l1=temp;
                    temp=temp.right;
                }

            }
            l1.right=current.right;
            if(current.left!=null)
                current.right=current.left;
            current.left=null;
            current = current.right;


        }
    }
//   LEET CODE : same tree
    public boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p!=null && q==null || p==null && q!=null) return false;

        if(p.value!=q.value) return false;

        return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
    }


//236. Lowest Common Ancestor of a Binary Tree

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)
            return root;
        return (left==null)?right:left;
    }

    //230. Kth Smallest Element in a BST
    int count=0;
    public int kthSmallest(Node root, int k) {
        return helper(root,k).val;
    }

    Node helper(Node node , int k){

        if(node==null)
            return null;
       Node left = helper(node.left,k);
        if (left != null) {
            return left;
        }
        count++;
        if(count==k)
            return node;
        return helper(node.right,k);

    }
// important important important important important important important important important important

   //105. Construct Binary Tree from Preorder and Inorder Traversal
   public Node buildTree(int[] preorder, int[] inorder) {
       if(preorder.length==0) return null;
       int index =0;
       int r = preorder[0];
       for(int i=0;i<inorder.length;i++)
       {
           if(inorder[i]==r)
           {
               index=i;
               break;
           }
       }
       Node node = new Node(r);
       node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
       node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
       return node;
   }

    public Node buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0)
            return null;
        int root = postorder[postorder.length-1];
        int index =0;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==root){
                index=i;break;}

        }
      Node node = new Node(root);
        node.left =buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
        node.right =buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));
        return node;


    }

   // 112. Path Sum
   public boolean hasPathSum(Node root, int targetSum) {

       if(root==null) return false;
       if(root.value==targetSum && root.left==null && root.right==null) return true;
       return hasPathSum(root.left,targetSum-root.value)||hasPathSum(root.right,targetSum-root.value);

   }
    // https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ hard
    public List<String> serialize(Node node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return list;
    }
    void helper(Node node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.value));

        helper(node.left, list);
        helper(node.right, list);
    }

    Node deserialize(List<String> list) {
        Collections.reverse(list);
        Node node = helper(list);
        return node;
    }
    Node helper(List<String> list) {
        String val = list.remove(list.size() - 1);

        if (val.charAt(0) == 'n') {
            return null;
        }

        Node node = new Node(Integer.parseInt(val));

        node.left = helper(list);
        node.right = helper(list);

        return node;
    }

    
    public int sumNumbers(Node root) {
        return sum(root,0);
    }
    int sum(Node root , int s){
        if(root==null ) return 0;
        s=s*10+root.value;
        if(root.left==null && root.right==null )
        {
            return s;
        }
        int u=0;
        u+=sum(root.left,s);
        u+=sum(root.right,s);
        return  u;
    }



//129. Sum Root to Leaf Numbers

public int sumNumbers(TreeNode root) {
    return helper(root,0);
}
int helper(Node root,int s){
    if(root==null)
    {
        return 0;
    }
    s=s*10+root.value;
    if(root.left==null && root.right==null) return s;

    int l = helper(root.left,s);
    int r = helper(root.right,s);
    return l+r;




}

//124. Binary Tree Maximum Path Sum
public int maxPathSum(Node root) {

    helper(root);
    return max;
}
int max=Integer.MIN_VALUE;
int helper(Node root)
{
    if(root==null)
        return 0;

    int left = helper(root.left);
    int right= helper(root.right);
    left= Math.max(0,left);
    right= Math.max(0,right);
    max=Math.max(left+right+root.value,max);
    return Math.max(left,right)+root.value;

}


}

*/