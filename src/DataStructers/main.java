package DataStructers;
import DataStructers.DoublyLinkedList.*;
import DataStructers.Queue.*;

import static DataStructers.BST.*;

public class main {
    public static void main(String[] args) {
////        LinkedList ll = new LinkedList();
//////        ll.push(22);//ll.push(200);
////        ll.create(new int[]{2,4,6,8,10,12});
////        ll.display();
////        System.out.println();
////        ll.remove(5);
//////        System.out.println(ll.remove());
////        ll.display();
//
//        DoublyLinkedList lst = new DoublyLinkedList();
//        lst.create(new int[]{2,4,6,8,10,12});
////        lst.push(100);
////        lst.append(500);
////        lst.display();
//        lst.insert(6,500);
//        lst.display();
//        System.out.println("Size = "+ lst.sizeOf());
//        Queue q = new Queue(4);
//        q.enqueue(45);q.enqueue(23);q.enqueue(34);q.enqueue(38);
//        System.out.println(q.Front + " " + q.Rear);
//        System.out.println("IS Queue Empty :"+q.isEmpty());
//        for (int i=0;i<4;i++){
//            System.out.println(q.dequeue());
//        }
//        QueueLinkedList ql = new QueueLinkedList();
//        ql.enqueue(45);ql.enqueue(85);ql.enqueue(94);
//        ql.display();
//        System.out.println("Size :"+ql.Size);
//        ql.deqeue();
//        ql.deqeue();
//        ql.deqeue();
//        ql.deqeue();
//        ql.display();
//        System.out.println("Size :"+ql.Size);

        BTNode root = null;
        root = insertBST(root,4);
        root = insertBST(root,2);
        root = insertBST(root,1);
        root = insertBST(root,3);
        root = insertBST(root,6);
        root = insertBST(root,5);
        root = insertBST(root,7);
        BST.inorderTraverse(root);
        int key = 20;
        System.out.println();
//        System.out.println("is "+key+" present in BST : "+search(root,key));
        System.out.println("is "+key+" present in BST : "+SearchBST_Itr(root,key));
    }
}
