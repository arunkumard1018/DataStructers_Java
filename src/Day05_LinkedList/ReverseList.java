package Day05_LinkedList;

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = next;
    }
}
public class ReverseList {
    public static void append(Node head, int data) {
        if(head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }temp.next = new Node(data);
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverseListItr(Node head) {
        Node currentPtr = head;
        Node prevptr = null,nextPtr;
        while (currentPtr != null) {
            nextPtr = currentPtr.next;
            currentPtr.next = prevptr;
            prevptr = currentPtr;
            currentPtr = nextPtr;
        }
        return prevptr;
    }

    public static Node reverseListRec(Node head) {
        if(head==null || head.next == null){
            return head;
        }
        Node newhead = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }

    public static Node reverseKnode(Node head,int k) {
        Node currentPtr = head;
        Node prevPtr = null,nextPtr = null;
        int count = 0;
        while (currentPtr != null && count < k) {
            nextPtr = currentPtr.next;

            currentPtr.next = prevPtr;
            prevPtr = currentPtr;
            currentPtr = nextPtr;
            count++;
        }
        if (nextPtr != null) {
            Node newHead = reverseKnode(nextPtr,k);
            head.next = newHead;
        }
        return prevPtr;
    }

    public static void makeCycle(Node head) {
        int count = 0;
        Node ptr = head,temp = null;
        while (ptr.next != null) {
            if (count == 3) {
                temp = ptr;
            }
            ptr = ptr.next;
            count++;
        }
        ptr.next = temp;
    }

    public static boolean detectCycle(Node head) {
        Node slowPtr = head,fastPtr = head;
        while (fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) return true;
        }
        return false;
    }

    public static void removeCycle(Node head) {
        Node slowPtr = head,fastPtr = head;
        if(detectCycle(head)){
            do{
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }while(slowPtr != fastPtr);
            fastPtr = head;
            while (fastPtr.next != slowPtr.next) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            slowPtr.next = null;
        }
    }



    public static void main(String[] args) {
        int[] arr = {4,6,8,10,12,13,14};
        Node head = new Node(2);
        for (int data : arr) {
            append(head,data);
        }
        display(head);
//        head = reverseListItr(head);
//        head = reverseListRec(head);
//        head = reverseKnode(head,4);
        makeCycle(head);
//        display(head);

        System.out.println(detectCycle(head));
        removeCycle(head);

        System.out.println(detectCycle(head));
        display(head);

    }
}
