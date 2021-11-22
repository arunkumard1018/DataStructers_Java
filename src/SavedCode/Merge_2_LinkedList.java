package SavedCode;

// * Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Merge_2_LinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        head.next = null;

        mergeRecur(head, l1, l2);
        return head;
    }

    private void mergeRecur(ListNode tail, ListNode l1, ListNode l2) {
        if (l1 == null) {
            if (l2 == null) return;
            tail.next = l2;
            return;
        } else if (l2 == null) {
            tail.next = l1;
            return;
        }

        if (l1.val < l2.val) {
            tail.next = l1;
            l1 = l1.next;
        } else {
            tail.next = l2;
            l2 = l2.next;
        }
        tail = tail.next;
        tail.next = null;
        mergeRecur(tail, l1, l2);
    }
}