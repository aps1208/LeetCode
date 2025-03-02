/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode ptr1=head,ptr2=head;
        while(ptr2!=null && ptr2.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        ListNode curr=ptr1.next;
        ptr1.next=null;
        Stack<ListNode> stk=new Stack<>();
        while(curr!=null)
        {
            stk.push(curr);
            curr=curr.next;
        }
        ptr1=head;
        while(!stk.isEmpty())
        {
            ListNode temp1=ptr1.next;
            ListNode temp2=stk.pop();
            ptr1.next=temp2;
            ptr1=temp1;
            temp2.next=ptr1;
        }
    }
}