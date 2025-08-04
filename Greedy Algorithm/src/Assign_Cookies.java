import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
        int [] s = {1,1};
        int [] g ={1,2,3};
        int result = findContentChildren(g,s);
        System.out.println(result);
    }
    public static  int findContentChildren(int[] g, int[] s) {

        int left = 0;
        int right = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (left < g.length && right < s.length) {
            if (s[right] >= g[left]) {
                left++;  // assign cookie to child
            }
            right++;     // move to next cookie either way
        }
        return left;
    }
}
