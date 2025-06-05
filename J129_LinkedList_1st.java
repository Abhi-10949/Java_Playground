
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

        public void reverse(){  // T.C: O(n)
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr != null){
                next  =  curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // To find and remove the nth node from end:
        public void deleteNthfromEnd(int n){
            // calculate size
            int size = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                size++;
            }
            // to delete head
            if(n == size){
                head = head.next;
                return;
            }

            // we have to go to (size - n)
            int i = 1;
            int iToFind = size - n;
            Node prev = head;
            while(i<iToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

        // To check wheter the LL is palidrom or not :
        // to find the midlle node:
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next; // +1
                fast = fast.next.next; // +2
            }
            return slow;
        }

        public boolean  chackPalindrom(){
            // base case
            if(head == null || head.next == null){
                return  true;
            }

            // step 1: To find the Middle Node
            Node midNode = findMid(head);

            // step 2: reverse the 2nd half
            Node prev = null;
            Node curre = midNode;
            Node next;

            while(curre != null){
                next = curre.next;
                curre.next= prev;
                prev = curre;
                curre = next;
            }

            Node right = prev; //rihgt half Head
            Node left = head;  //ledt half Head

            // step 3: Check if 1st half(laft) == 2nd half(right)

            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        public static boolean findCycle(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next; // incremet by +1
                fast = fast.next.next; // increment by +2

                if(slow == fast){
                    return  true; // the cycle is found
                }
            }
            return false; // the cycle is not found
        }

        // removing the cycle form the ll
        public static void removeCyle(){
            // detect cylce 
            Node slow = head;
            Node fast = head;
            boolean cycle = false;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }
            // find meeting point
            slow = head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            // remove cycle -> last.next = null
            prev.next = null;
        }

    public static void main(String[] args) {
        J129_LinkedList_1st ll = new J129_LinkedList_1st();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.add(4, 5);
        // ll.print();

        // System.out.println("size of the LL : "+ll.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrsearch(3));
        // System.out.println(ll.itrsearch(2));
        // System.out.println(ll.itrsearch(38));

        // System.out.println(ll.recSearch(2));

        // ll.reverse();
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // ll.print();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);

        // System.out.println(ll.chackPalindrom());

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        System.out.println(ll.findCycle());
        removeCyle();
        System.out.println(ll.findCycle());

        ll.print();
    }
}
