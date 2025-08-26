import java.util.*;
public class Largest_Rectangle {
    public static void main(String [] args){
        int []  height ={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(height));

    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);
            while (!st.isEmpty() && h < heights[st.peek()]) {
                int height = heights[st.pop()];
                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1; // extends between boundaries
                }
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }

        return maxArea;
    }

}
