public class InsertTail {
    public static void main(String[] args) {
        int [] arr = { 12,4,5,8};

        Node head = ConvertArr2LL(arr);// Convert Array To linked list
//        printList(head);
        printList(insertTail(head,56));
        printList(InsertElement(head,12,3));
        printList(InsertBeforevalue(head,69,8));
    }
// Traverse the linked list
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

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
    private static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    private static Node InsertElement(Node head, int el, int k){
        if(head == null){
            if(k==1){
                return new Node(el);
            }
            else{
                return head;
            }
        }
        if(k==1){
            return new Node(el, head);
        }
        int count = 0;
        Node temp = head;

        while(temp!=null){
            count++;
            if(count==(k-1)){
                Node x = new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    private static Node InsertBeforevalue(Node head, int el, int val){
        if(head == null){
          return null;
            }

        if(head.data ==  val){
            return new Node(el, head);
        }
        
        Node temp = head;

        while(temp.next!=null){

            if(temp.next.data==val){
                Node x = new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

}
