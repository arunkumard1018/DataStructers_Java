package DataStructers;
import DataStructers.LinkedList.*;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(12);ll.push(45);ll.push(25);
        ll.append(100);
        ll.Display();
        System.out.println(ll.size());
        ll.insertAfter(3,500);
        System.out.println(ll.size());
        ll.Display();
    }
}
