public class Q1290 {
    public int getDecimalValue(ListNode n) {
        int r = 0;

        for (; n != null; n = n.next)
            r = r * 2 + n.val;

        return r;
    }
}

/*

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

 */
