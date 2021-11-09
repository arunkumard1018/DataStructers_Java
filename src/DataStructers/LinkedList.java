package DataStructers;
/**
 * @ Structr of Node
 */
class Node{
    public int data;
    public Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    /**
     * to store the Address of the First Node
     */
   Node head = null;

    /**
     * @param data
     *  To insert Node At the Beginning of the LinkedList
     */
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * to insert node After the given index
     * @param data
     */
    public void insertAfter(int index,int data) {
        int size = size();
        Node start =head,NewNode = new Node(data);
        if(index > size && head==null) return;
        for(int i=0;i<=index-1;i++) start=start.next;
        NewNode.next = start.next;
        start.next = NewNode;
    }

    /**
     * To insert Node at the End of the LinkedList
     */
    public void append(int data) {
        Node start = head;
        if (head == null) {
            head = new Node(data);
            return;
        }
        while (start.next != null) {
            start = start.next;
        }
        start.next = new Node(data);
    }

    /**
     * to insert the node before the given index
     * @param index
     * @param data
     */
    public void insertBefore(int index, int data) {
        int size = size();
        Node newNode = new Node(data),start = head;
        if(index > size || head==null) return;
        for (int i = 0; i <=index - 2; i++) {
            start = start.next;
        }
        newNode.next = start.next;
        start.next = newNode;
    }

    /**
     * if LinkedList is Empty to create a LinkedList of given array
     * or to add an array elements at the end of the LinkedList if LinkedList not Empty
     * @param arr
     */
    public void create(int[] arr) {
        Node start = head,newNode;
        int loopstart = 0;
        if (start != null) {
            while(start.next != null) start=start.next;
        }else{
            head = new Node(arr[loopstart++]);
            start = head;
        }
        for (int i = loopstart; i < arr.length;i++) {
            newNode = new Node(arr[i]);
            start.next = newNode;
            start = newNode;
        }
    }

    /**
     * @return -1 if the list is empty
     * else return data of first node and delete first node
     */
    public int pop() {
        if(isEmpty()) return -1;
        int data = head.data;
        head = head.next;
        return data;
    }

    /**
     * @return Element of last node and delete the last node
     */
    public int remove() {
        Node start = head;
        if(head == null) return -1;
        //if The LinkedList contains only one node
        if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }
        /**
         * if the LinkedList contains more than one node
         * to travers up to before the last node
         */
        while (start.next.next != null) {
            start = start.next;
        }
        int data = start.next.data;
        start.next = null;
        return data;
    }

    /**
     * @param index to be removed
     */
    public void remove(int index) {
        if(isEmpty() || index >= size()) return;
        Node start = head;
        if (index == 0) {
            head = head.next;
            return;
        }
        for(int i=0;i<index-1;i++) start = start.next;
        start.next = start.next.next;
    }

    /**
     * @return Size of the LinkedList
     */
    public int size() {
        int size=0;
        Node start = head;
        while (start != null) {
            size++;
            start = start.next;
        }
        return size;
    }

    /**
     * @return True if the LinkedList is Empty
     */
    public boolean isEmpty() {
        return head==null;
    }

    /**
     * To Display the all Elements of LinkedList
     */
    public void display() {
        Node start = head;
        while (start != null) {
            System.out.print(start.data+" ");
            start = start.next;
        }
    }
}


