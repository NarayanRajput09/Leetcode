// package LinkList;

// public class LinkListCycleList141 {
    
// }

public class Solution {
    public boolean hasCycle(ListNode head) {
         if (head == null || head.next == null) { 
         return false;
       }
       ListNode first =head;
       ListNode second = head;
    while (first != null && first.next != null) { 
       second = second.next;
       first = first.next.next;
       if(second == first){
        return true;
       }
    }
       return false;
    }
}