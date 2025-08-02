import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,3,5,5,6};

        Set<Integer> unique = Checkduplicates(arr);
        System.out.println("After Removing duplicates");

        for(Integer num : unique){
            System.out.println(num + " ");
        }

    }

    static Set<Integer> Checkduplicates(int [] arr){
        Set<Integer> set = new HashSet<>();

        for(int i =0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set;

    }
}
