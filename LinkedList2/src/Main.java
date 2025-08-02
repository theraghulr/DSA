//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.Insert(1);
        list.Insert(4);
        list.Insert(6);
        list.Insert(10);
        list.Printlist();
        list.Remove(6);
        list.Printlist();
        list.AddtoHead(8);
        list.Printlist();
        list.RemoveHead();
        list.Printlist();

    }
}