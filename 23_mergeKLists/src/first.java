import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/7/8 11:09 下午
 */
public class first {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode ans = new ListNode(0);
            PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });
            //for(int i = 0;i < lists.length ; i++){
            //    ListNode temp = lists[i];
            //    pq.add(temp);
            //}
            for (ListNode node : lists) {
                if (node != null) pq.add(node);
            }
            ListNode dummy = new ListNode(0);
            ListNode p = dummy;
            while(!pq.isEmpty()){
                p.next = pq.poll();
                p = p.next;
                if(p.next != null){
                    pq.add(p.next);
                }
            }
            return dummy.next;
        }
    }
}
