package java_program;
import java.util.Arrays;
public class Merge_two_tree {
        static int i=0;
        static class Node{
            int data;
            Node left;
            Node right;
            public Node(int data)
            {
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static int count(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }

        public static void converarr(Node root,int arr[])
        {
            if(root==null)
            {
                return ;
            }
            converarr(root.left,arr);
            arr[i++]= root.data;
            converarr(root.right,arr);

        }
        public static Node binarysearch(int[] arr,int l,int h,Node res)
        {
            if(l<h)
            {
                int mid=(l+h)/2;
                res=buildtree(res,arr[mid]);
                binarysearch(arr,l,mid-1,res);
                binarysearch(arr,mid+1,h,res);
            }
            if(l==h)
            {
                res=buildtree(res,arr[l]);
            }
            return res;
        }
        public static Node buildtree(Node root,int val)
        {
            if(root==null)
            {
                root=new Node(val);
                return root;
            }
            if(root.data>val)
            {
                root.left=buildtree(root.left,val);
            }
            else{
                root.right=buildtree(root.right,val);
            }
            return root;
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void main(String[] args){
            Node roat=null;
            Node root=new Node(5);
            root.left=new Node(3);
            root.right=new Node(6);
            Node root2=new Node(11);
            root2.left=new Node(10);
            root2.right=new Node(12);
            int count=count(root);
            int count1=count(root2);
            int[] arr=new int[count+count1];
            converarr(root,arr);
            converarr(root2,arr);
            roat= binarysearch(arr,0, arr.length-1,roat);
            inorder(roat);
        }
    }
