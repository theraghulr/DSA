import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBuiltin {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"Raghul");
        map.put(2,"Hello");
        map.put(3,"sanjay");
        map.put(4,"Raghul");
//        System.out.println(map.containsKey(1)); //check key 1 is there or not
//        System.out.println(map.containsValue("Raghul"));
//        System.out.println(map.get(3));
//        System.out.println(map.remove(4));
////        System.out.println(map);

        System.out.println(map.getOrDefault(5,"Hello"));

//        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//
//        while (it.hasNext()) {
//            Map.Entry<Integer, String> entry = it.next();
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//
//        Iterator<Integer> keyIt = map.keySet().iterator();
//
//        while (keyIt.hasNext()) {
//            Integer key = keyIt.next();
//            System.out.println("Key: " + key);
//        }
//
//        Iterator<String> valueIt = map.values().iterator();
//
//        while (valueIt.hasNext()) {
//            String value = valueIt.next();
//            System.out.println("Value: " + value);
//        }




    }
}
