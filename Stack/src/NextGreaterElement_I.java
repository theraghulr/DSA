import java.util.*;

public class NextGreaterElement_I {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        NextGreaterElement_I obj = new NextGreaterElement_I();
        int[] result = obj.nextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 in reverse to fill map
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            nextGreaterMap.put(current, stack.isEmpty() ? -1 : stack.peek());

            stack.push(current);
        }

        // Build result for nums1 from map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}

