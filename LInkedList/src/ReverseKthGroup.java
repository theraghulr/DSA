public class ReverseKthGroup {
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node groupPrev = dummy;

        while (true) {
            Node kth = getKNode(groupPrev, k);
            if (kth == null) break;

            Node groupNext = kth.next;

            // Reverse group
            Node prev = groupNext;
            Node curr = groupPrev.next;

            while (curr != groupNext) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Rearrange pointers
            Node temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }

        return dummy.next;
    }


    private Node getKNode(Node curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
