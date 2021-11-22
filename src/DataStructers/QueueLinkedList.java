package DataStructers;

public class QueueLinkedList {
    Node Front;
    Node Rear;
    int Size;
    QueueLinkedList(){
        this.Front = null;
        this.Rear = null;
        this.Size = 0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data){
        if(Front == null && Rear == null){
            Front = new Node(data);
            Rear = Front;
            this.Size++;
            return;
        }
        Rear.next = new Node(data);
        Rear = Rear.next;
        this.Size++;
    }

    public int deqeue(){
        if (Front == null && Rear == null) {
            System.out.println("QueueUnderFlow");
            return -1;
        }
        int data = Front.data;
        if(Front == Rear){
            Front = null;
            Rear = null;
            this.Size--;
            return data;
        }
        Front = Front.next;
        this.Size--;
        return data;
    }
    public boolean isEmpty(){
        return Front == null && Rear == null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
            return;
        }
        Node Temp = Front;
        while(Temp != null){
            System.out.print(Temp.data+" ");
            Temp = Temp.next;
        }
        System.out.println();
    }
}
