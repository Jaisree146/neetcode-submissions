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
    public ListNode modifiedList(int[] nums, ListNode head) {
        for(int i=0;i<nums.length;i++){
            int del=nums[i];
            ListNode temp=head;
            if(head.val==del){
            while(temp.val==del){
                temp=temp.next;
            }
            head=temp;
            }
            ListNode prev=temp;

            while(temp!=null){
                if(temp.val==del){
                    prev.next=temp.next;
                }
                else{
                    prev=temp;
                }
                temp=temp.next;
            }
           }
           return head;
    }
}
