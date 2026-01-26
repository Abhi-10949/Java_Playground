public class J129_LinkedList_1st {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data); //step 1 to create new node
        size++;
        // if ll is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head; // step 2: this is called linking process
        head = newNode; // step 3 
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

    public void print(){ // T.C = O(n)
        Node temp = head;
        if(head == null){ // base case
            System.out.println("LL is empty!");
            return;
        }

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx ==0){ // if we are adding the value to the 0th index
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val =head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2;
        Node prev= head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){ // T.C = O(n)
        Node temp = head;
        int i = 0;

        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //if the key is not present in the LL
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null) return -1;
        if(head.data == key) return 0;

        int idx = helper(head.next, key);
        if(idx == -1) return -1;

        return idx+1; // because head.next is not the correct idx becz original head was I
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void revers(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        // to delete head
        if(n == size){
            head = head.next;
            return;
        }
        //size -n
        int i = 1;
        int iToFind = size -n;
        Node prev = head;
        while(i< iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // slow - fast approach
    private Node findMin(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    // merge 
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }


    // getMid
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next!= null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }


    // merge sort on linked List
    public Node mergeSort(Node head){
        // Base Case
        if(head == null || head.next == null){
            return head;
        }
        // find Mid for the LL
        Node mid = getMid(head);

        // call mergersort for left and right half
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head); // for left half
        Node newRight = mergeSort(rightHead); // for right half

        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        // step 1: find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // step 2: reverse 2nd half
        Node curr = mid.next; // divide in two part's
        mid.next = null; // break both the part
        Node prev = null;
        Node next;
        
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // step 3: alternate merging - zig zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // updation
            right = nextR;
            left = nextL;
        }
    }

    public static void main(String []args){
        J129_LinkedList_1st ll = new J129_LinkedList_1st();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        
        ll.zigZag();
        ll.print();


        // ll.print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.print();

        // ll.head = ll.mergeSort(head);
        // ll.print();

        // ll.revers();
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // ll.print();
    }
}