package java_program;

        class BSTNode {
            int data;
            BSTNode left;
            BSTNode right;

            BSTNode(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        class BSTTree {
            BSTNode root;

            BSTTree() {
                root = null;
            }

            void inset(int data) {
                BSTNode newNode = new BSTNode(data);
                if (root == null) {
                    root = newNode;
                } else {
                    BSTNode temp = root;
                    while (true) {
                        if (temp.data > newNode.data) {
                            if (temp.left == null) {
                                temp.left = newNode;
                                break;
                            } else {
                                temp = temp.left;
                            }
                        } else {
                            if (temp.right == null) {
                                temp.right = newNode;
                                break;
                            } else {
                                temp = temp.right;
                            }
                        }
                    }
                }
            }

            void display() {
                BSTNode temp = root;
                displayRecursion(temp);
            }

            void displayRecursion(BSTNode root) {
                if (root == null)
                    return;

                // System.out.println(root.data);
                displayRecursion(root.left);
                // System.out.println(root.data);
                displayRecursion(root.right);
                System.out.println(root.data);
            }
        }

        public class Breath_first_Search {
            public static void main(String[] args) {
                BSTTree tree = new BSTTree();
                tree.inset(10);
                tree.inset(5);
                tree.inset(15);
                tree.display();
            }
        }


