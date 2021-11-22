package DataStructers;

import java.nio.BufferOverflowException;

/**
 * implementing Queue Using Array
 */
public class Queue {
    int Front;
    int Rear;
    int[] Queue;
    int Size;
    Queue(int Size){
        this.Size = Size;
        this.Queue = new int[Size];
        Front = -1;
        Rear = -1;
    }

    /**
     * to insert Element in a Queue
     * @param data
     */
    public void enqueue(int data){
        /**
         * to check if the Queue is Full or not if Full it will print overFlow Message
         * and simply return
         */
        if(Front == (Rear+1)%Size){
            System.out.println("QueOverFlow");
            return;
        }
        /**
         * to check if the Stack Front and Rear Pointer are at -1
         * i.e to insert First Element
         * Else it will Simply increment the Rear pointer and insert new Data
         */
        if(Front == -1 && Rear == -1){
            Front++;
            Queue[++Rear] = data;
        }else{
            Rear = (Rear+1)%Size;
            Queue[Rear] = data;
        }
    }

    /**
     * @return data From the queue
     */
    public int dequeue(){
        /**
         * to check if the Queue is Empty if So Print QueueUnderFlow and return -1
         */
        if(Front == -1 && Rear == -1){
            System.out.println("QueueUnderFlow");
            return -1;
        }
        /**
         * to check if the Queue Front and Rear Pointing on Same index i.e it is Last element
         * So make the Front and Rear Pointer again pointing to -1
         * else it will Simply copy the data and increment Front pointer and return data
         */
        int data = Queue[Front];
        if(Front == Rear){
            data = Queue[Front];
            Front = -1;
            Rear = -1;
        }else{
            Front = (Front+1)%Size;
        }
        return data;
    }

    /**
     * @return True if the Queue is empty
     */
    public boolean isEmpty(){
        return Front == -1 && Rear == -1;
    }
}
