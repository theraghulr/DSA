import java.util.Arrays;
import java.util.List;

public class MapFilterSort {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Raghul", "Rhh", "Raghu","Ananth");

        List<Integer> nums = Arrays.asList(12,35,66,83,99,82);
//
//        names.stream()
//                .filter(n -> n.charAt(0)=='R' && n.charAt(1)=='a')
//                .sorted()
//                .map(n-> n.toUpperCase())
//                .forEach(n-> System.out.println(n));

        nums.stream()
                .map(n-> n % 2 == 0 ? "Even" : "ODD")
                .forEach(System.out::println);


    }
}
