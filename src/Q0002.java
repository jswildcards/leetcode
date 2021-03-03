public class Q0002 {
    public ListNode addTwoNumbers(ListNode p, ListNode q) {
        ListNode r = new ListNode(0), h = r;
        int c = 0;

        while (p != null || q != null) {
            int m = p != null ? p.val : 0;
            int n = q != null ? q.val : 0;
            int s = m + n + c;
            c = s / 10;
            r.next = new ListNode(s % 10);
            r = r.next;
            p = p != null ? p.next : null;
            q = q != null ? q.next : null;
        }

        if (c > 0)
            r.next = new ListNode(c);

        return h.next;
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
