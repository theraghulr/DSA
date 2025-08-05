public class SeggregateOddandEvenNode {
    class Solution {
        public Node oddEvenList(Node head) {
            if(head ==null || head.next==null) return head;

           Node odd =head;
           Node even = head.next;
           Node evenNode = even;

            while(even!=null && even.next!=null){
                odd.next = odd.next.next;
                even.next = even.next.next;

                odd = odd.next;
                even = even.next;
            }
            odd.next=evenNode;

            return head;

        }
    }
}
