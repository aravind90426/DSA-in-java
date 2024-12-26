package Tree.Codes.Tree_1;

import java.util.Scanner;

public class BinaryTree {
BinaryTree()
{

}
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int val)
        {
            this.value=val;
        }

    }
    private Node root;

public void populate(Scanner s)
{
    System.out.println("Enter the Root Node val");
    int val = s.nextInt();
    root = new Node(val);
    populate(s,root);

    }

    private void populate(Scanner s, Node node) {

        System.out.println("Do you want Left child of " + node.value + " ?");
        Boolean left = s.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left Child" + node.value);
            int val = s.nextInt();
            node.left = new Node(val);
            populate(s, node.left);
        }
        System.out.println("Do you want right child of " + node.value + " ?");
        Boolean right = s.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right Child " + node.value);
            int val = s.nextInt();
            node.right = new Node(val);
            populate(s, node.right);
        }
    }

        public void display() {
        disp(root,0);
        }
        public void display(Node node, String indent) {
                if(node==null) return;

            System.out.println(indent+node.value);
            display(node.left,indent+"\t");
            display(node.right,indent+"\t");
        }
        public void disp(Node node , int i)
        {
            if(node==null)
            {
                return;
            }

            if(i!=0) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print("|\t\t");
                }
                System.out.println("|------------>"+node.value);
            }
            else  {
                System.out.print(node.value);
            }

                disp(node.left,i+1);
        }

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        BinaryTree t = new BinaryTree();
        t.populate(s);
        t.display();

    }






}

