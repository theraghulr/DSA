import java.util.LinkedList;
import java.util.List;

public class LInkedListInbuilt {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(7);
        list.add(12);
        list.add(25);
        System.out.println(list);
        list.addFirst(1);
        System.out.println(list);
        list.addLast(23);
        System.out.println(list);
        System.out.println(list.contains(6));
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.getLast());
        System.out.println(list.get(0));
    }
}
