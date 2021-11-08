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
     * To Display the all Elements of LinkedList
     */
    public void Display() {
        Node start = head;
        while (start != null) {
            System.out.print(start.data+" ");
            start = start.next;
        }
    }
}


