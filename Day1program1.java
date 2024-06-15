package java_program;


    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedListClass {
        ListNode head, tail;

        LinkedListClass() {
            head = tail = null;
        }

        void insertAtBeggining(int data) {
            ListNode newNode = new ListNode(data);
            if (head == null) {
                tail = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        void insertAtEnd(int data) {
            if (tail == null) {
                insertAtBeggining(data);
            } else {
                ListNode newNode = new ListNode(data);
                tail.next = newNode;
                tail = newNode;
            }
        }

        void deleteAtBeggining() {
            if (head == null) {
                System.out.println("List is Empty");
            } else {
                head = head.next;
                System.out.println("Head Removed");
            }
        }

        void deleteAtEnd() {
            if (head == null) {
                System.out.println("List is Empty");
            } else {
                ListNode temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                System.out.println(temp.data);
            }
        }

        void traverse() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }
        public class Day1program1 {

        public static void main(String[] args) {
            LinkedListClass l = new LinkedListClass();
            l.insertAtEnd(10);
            l.insertAtEnd(20);
            l.insertAtEnd(30);
            l.insertAtEnd(40);
            l.deleteAtBeggining();
             l.deleteAtBeggining();
             l.deleteAtBeggining();
            l.deleteAtEnd();
            l.insertAtEnd(40);
            l.traverse();
        }
    }

