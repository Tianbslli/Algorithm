import java.util.List;

/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/6/30 11:12 下午
 */
public class first {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if(head == null) {
                return null;
            }
            if(m == n){
                return head;
            }
            ListNode assumeHead = new ListNode(0);
            assumeHead.next = head;
            ListNode preStart = assumeHead;

            int step = 1;
            while(step < m){
                preStart = preStart.next;
                step ++;
            }
            ListNode start = preStart.next;
            ListNode end = preStart.next;
            while(step < n){
                end = end.next;
                step++;
            }
            //start.next = end.next;
            preStart.next=end;
            ListNode pre = start;
            ListNode cur = pre.next;
            while(cur != end.next){
                //ListNode temp = cur.next;
                //temp.next = temp2.next;
                //temp2.next = temp;
                //temp = temp2;
            }


        return null;
    }
}
}
