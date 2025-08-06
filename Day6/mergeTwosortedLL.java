class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode node=new ListNode(-1);
       ListNode dummy=node;
       while(list1!=null  && list2!=null){
        if(list1.val<list2.val){
            dummy.next=list1;
            list1=list1.next;

        }
        else{
            dummy.next=list2;
            list2=list2.next;
        }
        dummy=dummy.next;
       }
       if(list1!=null){
        dummy.next=list1;

       }
       else{
        dummy.next=list2;
       }
       return node.next;
    }
}