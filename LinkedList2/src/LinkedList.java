public class LinkedList {
    ListNode head;

    //Insert at End

    public void Insert(int value){
        ListNode newnode = new ListNode(value);
        if(head == null){
            head = newnode;
            return;
        }

        ListNode temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newnode;

    }

    //print statement;

    public void Printlist(){
        ListNode temp = head;

        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove element

    public void Remove(int target){

        if(head == null || head.data == target ){
            head = head.next;
            return;
        }
        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.next.data == target){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

    }

    public void AddtoHead (int value){
        ListNode newNode = new ListNode(value);

         newNode.next = head;
        head = newNode;
    }

    public void RemoveHead (){
        if (head == null){
            System.out.println("list empty");

        }
        head = head.next;


    }
}
