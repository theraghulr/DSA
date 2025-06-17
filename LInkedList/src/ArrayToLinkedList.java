public class ArrayToLinkedList {
    public static void main(String[] args) {
        int [] arr = { 12,4,5,8};

        Node head = ConvertArr2LL(arr);// Convert Array To linked list
        // Traverse in LinkedList
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();


        System.out.println(CheckIfPresent(head, 4)); // Search in Linked List
        System.out.println(lenghtofLL(head));// Traverse In LinkedList;
        head = RemoveHead(head);
        System.out.println(head); // Remove head of the linked list;
        head = RemoveTail(head);
        System.out.println(head); // Remove Tail of the linked list;
        System.out.println(RemoveK(head,3));
        System.out.println(RemoveElement(head, 8));
        System.out.println(InsertElement(head,56));
        System.out.println(insertTail(head,13));
   }
    // Converting Array into LinkedList

    private static Node ConvertArr2LL(int [] arr ){
        Node head =  new Node (arr[0]);
        Node mover = head;
        for(int i= 1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    //Length  of LinkedList
    private static int lenghtofLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count=count+1;
        }
        return count;

    }

    //Search In Linked List
    private static int CheckIfPresent(Node head, int val){
        Node temp = head;

        while(temp != null){
            if(temp.data == val) {

                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    private static  Node RemoveHead (Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    private static Node RemoveTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node RemoveK (Node head, int k){
        if(head == null) return null;

        if(k == 1){
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;

        Node temp =  head;
        Node prev = null;

        while(temp != null){
            count++;
            if(count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    private static Node RemoveElement (Node head, int Element){
        if(head == null) return null;

        if(head.data == Element){
            Node temp = head;
            head = head.next;
            return head;
        }

        Node temp =  head;
        Node prev = null;
        while(temp != null){

            if(temp.data == Element) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;

    }
    private static Node InsertElement(Node head, int val1){
        Node temp = new Node(val1, head);
        return temp;
    }
    private static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }

        Node temp = head;
         while(temp.next != null){
             temp = temp.next;
         }
         temp.next = new Node(val,head);
         return head;
    }

}

