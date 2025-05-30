
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
        public static int size;

        public void addFirst(int data){
            // step 1: create new node
            Node newNode = new Node(data);
            size++;
            
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
            size++;
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
            size++;
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

        // removing the first node:
        public int removeFirst(){
            if(size == 0){
                System.out.println("LL is empty.");
                return Integer.MAX_VALUE;
            } else if (size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        // remove last
        public int removeLast(){
            // if my LL is empty
            if(size == 0){
                System.out.println("LL is empty.");
                return Integer.MIN_VALUE;
            } else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return  val;
            }
            // previous : i = size -2;
            Node prev= head;
            for(int i = 0;i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.data; // tail.data
            prev.next = null;
            tail= prev;
            size--;
            return val;
        }

        //searching the key in the linkedList while performing Linear Search
        public int itrsearch (int key){
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == key){  //key found
                    return i;
                } 
                temp = temp.next;
                i++;
            }
            // key not found case
            return  -1;
        }

        // using recursion search the key in the linkedList
        public int healper(Node head, int key){
            //base case 
            if(head == null){
                return -1;
            }

            if(head.data == key){
                return 0;
            }
            int idx = healper(head.next, key);
            if(idx == -1){
                return  -1;
            }
            return idx + 1;
        }
        public int recSearch(int key){
            return  healper(head, key);
        }

    public static void main(String[] args) {
        J129_LinkedList_1st ll = new J129_LinkedList_1st();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.add(0, 9);
        ll.print();

        System.out.println("size of the LL : "+ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        // System.out.println(ll.itrsearch(3));
        // System.out.println(ll.itrsearch(2));
        // System.out.println(ll.itrsearch(38));

        System.out.println(ll.recSearch(2));
    }
}
