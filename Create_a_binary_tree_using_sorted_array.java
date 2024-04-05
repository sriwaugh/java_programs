package java_program;

public class Create_a_binary_tree_using_sorted_array {
        static int i=0;
        static class Node{
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;
                this.left= null;
                this.right=null;
            }
        }
        static class tree
        {
            public static void binarysearch(int[] arr,int l,int h,int[] res)
            {
                if(l<h)
                {
                    int mid=(l+h)/2;
                    res[i++]=arr[mid];
                    binarysearch(arr,l,mid-1,res);
                    binarysearch(arr,mid+1,h,res);
                }
                if(l==h)
                {
                    res[i++]=arr[l];
                }
            }
            public static Node buildtree(Node root,int res)
            {
                if(root==null)
                {
                    root=new Node(res);
                    return root;
                }
                if(root.data>res)
                {
                    root.left=buildtree(root.left,res);
                }
                else{
                    root.right=buildtree(root.right,res);
                }
                return root;
            }
            public static void preorder(Node root)
            {
                if(root==null)
                {
                    return;
                }
                System.out.println(root.data);
                preorder(root.left);
                preorder(root.right );
            }
        }
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6,7};
            Node root=null;
            int h= arr.length-1;
            int l=0;

            int[] res=new int[arr.length];
            tree t=new tree();
            t.binarysearch(arr,l,h,res);
            for (int j = 0; j <arr.length ; j++) {
                root=t.buildtree(root,res[j]);
            }
            t.preorder(root);
        }
    }
