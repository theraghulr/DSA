import java.util.Stack;

public class Remove_K_Digits {
    public static void main(String[] args) {
        String num = "1432219";
        int k =3;

        System.out.println(removeKdigits(num,k));

    }
    public static String removeKdigits(String num, int k) {

        int n = num.length();

        if(n == k) return "0";

        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // if still k > 0, remove from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : st) sb.append(ch);

        // remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();

    }
}
