class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode prev = null;
        ListNode temp = null;
        
        int carry = 0;
        int sum;
        // traverse the both linked list,until both ends
        while(l1!=null || l2!=null)
        {
                // if any of the list end and other list not then take 0 to add with other list element
                sum = carry + ( l1!=null ? l1.val:0) + ( l2!=null ? l2.val:0);
            
                // updating the carry
                carry = (sum>=10) ? 1:0;
            
                // now updating the sum if it is greater than 9
                sum = sum%10; // always it will give the ones place value
            
                // now lets create a new node for holding sum
            
                temp = new ListNode(sum);
            
                // if temp is the first node  then make it as head of the result list
                if(result==null)
                {
                        result = temp; // making result as head
                }
            
                //if it is not the first node then connect with prev node
                else
                {
                        prev.next = temp;
                }
            
                // set the prev for the next insertion
                prev = temp;
            
                // now move the both pointer to next node
                if(l1!=null)
                        l1 = l1.next;
                if(l2!=null)
                        l2 = l2.next;
            
        }
        
        // for the last sum if the sum > 9 so there would be a carry so to hold that we need to create a new node
        if(carry>0)
        {
                ListNode newNode = new ListNode(carry);
                temp.next = newNode;
        }
        return result;
    }
}
