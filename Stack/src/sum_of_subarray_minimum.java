import java.util.*;
public class sum_of_subarray_minimum {
    public static void main(String[] args) {
        int [] arr = {3,2,4,2};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;
        long sum = 0;

        Stack<Integer> stack = new Stack<>();
        // Append a 0 at the end to flush all remaining elements
        for (int i = 0; i <= n; i++) {
            int curr = (i < n) ? arr[i] : 0;

            while (!stack.isEmpty() && arr[stack.peek()] > curr) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long count = (mid - left) * (right - mid);
                sum = (sum + (arr[mid] * count) % MOD) % MOD;
            }

            stack.push(i);
        }

        return (int) sum;
    }
}
