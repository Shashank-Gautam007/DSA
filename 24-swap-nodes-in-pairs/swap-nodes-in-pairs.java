class Solution {
    public void swapPairsHelper(ListNode prev, ListNode curr){
        if(curr == null || curr.next == null){
            return;
        }

         ListNode f = curr,
            s = curr.next;

            f.next = s.next;
            s.next = f;
            prev.next = s;

        swapPairsHelper(f, f.next);

    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode prev = dummy;

        swapPairsHelper(prev, head);


        // while(head != null && head.next != null){
        //     ListNode f = head,
        //     s = head.next;

        //     f.next = s.next;
        //     s.next = f;
        //     p.next = s;

        //     p = f;

        //     head = f.next;
        // }
        return dummy.next;
    }
}