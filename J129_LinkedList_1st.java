
public class J129_LinkedList_1st {
    public static class Node{
        int data;
        Node next;
        // consturctor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
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

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode; 
        }

        // printing the complete node
        public void print(){   //T.C : O(n)
            Node temp = head;
            if(head == null){
                System.out.println("LL is empty");
                return;
            }
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void add (int idx, int data){
            if(idx == 0){  // this is used to add the element to the starting of the ll.
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }

            // i = idx-1; temp->prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

    public static void main(String[] args) {
        J129_LinkedList_1st ll = new J129_LinkedList_1st();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(0, 9);
        ll.print();

    }
}
