class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
         
         while(cur != null) {
        	 if (cur.next == null) {
        		 break;
        	 }
        	 if (cur.val == cur.next.val) {
        		 cur.next = cur.next.next;
        	 } else {
        		 cur = cur.next;
        	 }
         }
         
         return head;
    }
}
