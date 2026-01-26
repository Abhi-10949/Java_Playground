public class J129_DoublLL {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // remove- removeFirst
    public int removeFirst(){
        if( head == null){
            System.out.println("List is empty!");
            return  Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val= head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // reverse the doubly LL
    public void reverseDll(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        J129_DoublLL dll = new J129_DoublLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println();
        // System.out.println("\nSize of the dll: "+dll.size);


        // dll.removeFirst();
        // dll.print();
        // System.out.println("\nSize after removing first: "+dll.size);

        dll.reverseDll();
        dll.print();
    }
}
