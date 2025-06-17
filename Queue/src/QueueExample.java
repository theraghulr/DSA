import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> sample = new LinkedList<Integer>();

        //Adding items to sample

        sample.add(50);
        sample.add(60);
        sample.add(70);
        sample.add(80);
        sample.add(90);

        System.out.println(sample);
        System.out.println(sample.peek()); // prints first element
        System.out.println(sample.poll()); // removes the first element
        System.out.println(sample);
    }
}
