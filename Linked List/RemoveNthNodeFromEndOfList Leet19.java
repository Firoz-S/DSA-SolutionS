class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
          if (n == size) {
            return head.next;
        }
        ListNode pass=head;
        ListNode cur=head.next;
        while(cur!=null&&count!=size-n-1){
            count++;
            pass=pass.next;
            cur=cur.next;
        }
        pass.next=cur.next;
        return head;
    }
}
