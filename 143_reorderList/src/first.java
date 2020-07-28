/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/7/1 10:42 下午
 */
public class first {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution {
        public void reorderList(ListNode head) {
            if(head == null){
                return;
            }

            ListNode l = head;
            int length = 0;
            while(l != null){
                l = l.next;
                length++;
            }
            int midNum = (length + 1) /2;
            ListNode mid = head;
            for(int i = 1;i < midNum ; i ++){
                mid = mid.next;
            }

            ListNode l2 = reverse(mid.next);
            mid.next = null;
            ListNode cur = head;
            while(cur != null && l2 != null){
                ListNode temp = l2.next;
                l2.next = cur.next;
                cur.next = l2;
                cur = l2.next;
                l2 = temp;
            }
        }

        public ListNode reverse(ListNode head){
            ListNode pre = null;
            ListNode cur = head;
            while(cur != null){
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            return pre;
        }
    }
}
