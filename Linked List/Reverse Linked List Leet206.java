class Solution {
    public ListNode reverseList(ListNode head) {
       if(head==null||head.next==null) return head;
       ListNode a =head.next;
       ListNode Newhead=reverseList(a);
       a.next=head;
       head.next=null;
       return Newhead;
    }

}
