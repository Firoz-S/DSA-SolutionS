
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0)
               return head;
            ListNode temp=head;
            int len=1;
            while(temp.next!=null){
                len++;
                temp=temp.next;
            }
            temp.next=head;
            int taillen=len-(k%len);
            ListNode tail=head;
            int i=1;
            while(i<taillen){
                tail=tail.next;
                i++;
            }
            ListNode cur=tail.next;
            tail.next=null;
            return cur;
    }
}
