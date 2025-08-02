import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "best";
        String t = "tesb";
        System.out.println(isAnagram(s,t));
    }

    static Boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS,arrT);
    }
}
