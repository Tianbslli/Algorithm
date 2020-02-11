public class first {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = addTwoNumbers(l1,l2);

    }
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0,num2 = 0,num;
        //反转链表
        l1 = reverse(l1);
        l2 = reverse(l2);

        while(l1 != null){
            num1 = num1 * 10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            num2 = num2 * 10 + l2.val;
            l2 = l2.next;
        }
        num = num1 + num2;
        ListNode l3 = new ListNode(0),node;
        node = l3;
        while(num != 0){
            int a = num % 10;
            num = num / 10;
            ListNode node2 = new ListNode(a);
            node.next = node2;
            node = node2;
        }
        return l3.next;
    }

    private static ListNode reverse(ListNode l){
        ListNode head,node;
        head = null;
        while(l != null){
            node = l;
            l = l.next;
            node.next = head;
            head = node;
        }
        return head;
    }
}
