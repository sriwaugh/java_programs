package java_program;
public class Mirror_of_binary_tree {
        static class Node{
            int  data;
            Node left;
            Node right;
            public Node(int data)
            {
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static void mirror(Node root)
        {
            if(root==null)
            {
                return;
            }
            mirror(root.left);
            mirror(root.right);
            swap(root);
        }
        public static Node swap(Node root)
        {
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
            return root;
        }
        public static void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void main(String[] args) {
            Node root=new Node(1);
            root.left=new Node(2);
            root.left.left=new Node(3);
            root.left.right=new Node(4);
            root.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);
            System.out.println("Normal Binary tree");
            preorder(root);
            System.out.println();
            mirror(root);
            System.out.println("Mirror Binary tree");
            preorder(root);
        }
    }

