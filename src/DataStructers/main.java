package DataStructers;
import DataStructers.LinkedList.*;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.push(22);//ll.push(200);
        ll.create(new int[]{2,4,6,8,10,12});
        ll.display();
        System.out.println();
        ll.remove(5);
//        System.out.println(ll.remove());
        ll.display();
    }
}
