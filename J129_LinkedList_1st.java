package Java_Playground;

public class J129_LinkedList_1st {
    public static class Node{
        int data;
        Node next;
        // consturctor
        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        public void addFirst(int data){
            // step 1: create new node
            Node newNode = new Node(data);
            
            if(head == null){
                head = tail = newNode;
                return;
            }

            // step 2: newNode next = head;
            newNode.next = head; //linking step

            // step 3: head = newNode;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        J129_LinkedList_1st ll = new J129_LinkedList_1st();
    }
}
