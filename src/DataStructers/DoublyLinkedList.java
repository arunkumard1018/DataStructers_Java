package DataStructers;

/**
 * Structr of the Node for Doubly LinkedList /prev/data/next/
 */
class DuoNode{
    int data;
    DuoNode prev,next;
    DuoNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    DuoNode First=null,Last=null;

    /**
     * @param data to add the new node at the First Node
     */
    public void push(int data) {
        if (isEmpty()) {
            First = new DuoNode(data);
            Last = First;
            return;
        }
        First.prev = new DuoNode(data);
        First.prev.next = First;
        First = First.prev;
    }

    /**
     * @param data to add the new Node at the end of the LinkedList
     */
    public void append(int data) {
        if (isEmpty()) {
            First = new DuoNode(data);
            Last = First;
            return;
        }
        Last.next = new DuoNode(data);
        Last.next.prev = Last;
        Last = Last.next;
    }

    /**
     * @param index,data index and data to be inserted in existing linked list
     */
    public void insert(int index, int data) {
        if(index > sizeOf() || isEmpty()) return; //to check the given index is valid
        if (index == 0) {
            push(data);
            return;
        }
        if (index == sizeOf()) {
            append(data);
            return;
        }
        DuoNode start = First,newNode = new DuoNode(data);
        for (int i = 1; i <= index; i++) {
            start = start.next;
        }
        newNode.next = start;
        newNode.prev = start.prev;
        start.prev = newNode;
        newNode.prev.next = newNode;
    }

    /**
     *
     * @param arr Take Integer array as parameter and create Doubly LinkedList
     */
    public void create(int arr[]) {
        int arrayPointer = 0;
        DuoNode start = First,newNode;
        /**
         * if the LinkedList is empty if block will execute
         * else the array elements will append to the LinkedList
         */
       if(start == null){
            First = new DuoNode(arr[arrayPointer++]);
            Last = First;
        }
       for (int i = arrayPointer; i < arr.length; i++) {
               Last.next = new DuoNode(arr[i]);
               Last.next.prev = Last;
               Last = Last.next;
           }
    }

    /**
     * @return true if the LinkedList is Empty
     */
    public boolean isEmpty() {
        return First==null;
    }

    /**
     * @return size the of the linked list
     */
    public int sizeOf() {
        int count = 0;
        DuoNode start = First;
        while (start != null) {
            count++;
            start = start.next;
        }
        return count;
    }

    /**
     * To display all the Elements of LinkedList
     */
    public void display() {
        if (!isEmpty()) {
            DuoNode start = First;
            while (start != null) {
                System.out.print(start.data+" ");
                start = start.next;
            }System.out.println();
        }
    }
}
