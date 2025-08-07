import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";
        Character result = firstNonRepeatingChar(input);
        if (result != null)
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }

        public static Character firstNonRepeatingChar(String s) {
            Map<Character, Integer> map = new LinkedHashMap<>();

            // Count frequency of each character
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Find first character with frequency 1
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return null; // or return '_' or some other placeholder
        }


    }


