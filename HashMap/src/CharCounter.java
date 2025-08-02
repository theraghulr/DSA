import java.util.*;
public class CharCounter {

        public static void main(String[] args) {

            String S = "Hello World!";

            Map<Character, Integer> FreqMap = CountingLetters(S);
            List<Character> Keys = new ArrayList<>(FreqMap.keySet());

            for(int i = 0; i<Keys.size(); i++){
                char key = Keys.get(i);
                int values = FreqMap.get(key);
                System.out.println("Key "+ key +" Values "+ values);
            }

            }

            static Map<Character, Integer> CountingLetters(String S){

            Map<Character, Integer>FreqMap = new HashMap<>();

            for(int i =0; i<S.length(); i++){
                char ch = S.charAt(i);
                if(ch != ' '){
                  FreqMap.put(ch,FreqMap.getOrDefault(ch,0)+1);
                }
            }

            return FreqMap;

        }
    }


