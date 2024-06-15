package java_program;


    class DNode {
        int data;
        DNode prev, next;

        DNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class DLinkedList {
        DNode head, tail;

        DLinkedList() {
            head = tail = null;
        }

        void insertAtBeggining(int data) {
            DNode newNode = new DNode(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        void insertAtEnd(int data) {
            if (tail == null) {
                insertAtBeggining(data);
            } else {
                DNode newNode = new DNode(data);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        void deleteAtBeggining() {
            if (head == null) {
                System.out.println("List is Empty");
            } else {
                head = head.next;
                head.prev = null;
            }
        }

        void deleteAtEnd() {
            if (head == null) {
                System.out.println("List is Empty");
            } else {
                DNode temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next.prev = null;
                temp.next = null;
                tail = temp;
                System.out.println(temp.data);
            }
        }

        void traverse() {
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }

        void reverseTraverse() {
            DNode temp = tail;
            System.out.print("null");
            while (temp != null) {
                System.out.print(" <- " + temp.data);
                temp = temp.prev;
            }
            System.out.println();
        }
    }

public class Day1program2 {
        public static void main(String[] args) {
            DLinkedList dl = new DLinkedList();
            dl.insertAtBeggining(20);
            dl.insertAtBeggining(10);
            dl.insertAtBeggining(0);
            dl.insertAtEnd(30);
            dl.insertAtEnd(40);
            dl.insertAtEnd(50);
            dl.deleteAtEnd();
            dl.traverse();
            dl.reverseTraverse();
        }
    }

