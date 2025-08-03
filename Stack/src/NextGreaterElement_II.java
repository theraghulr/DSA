import java.util.*;

public class NextGreaterElement_II {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int[] result = nextGreaterElements(nums);

        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();  // stores indices
        Arrays.fill(result, -1);

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int index = stack.pop();
                result[index] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return result;
    }
}

