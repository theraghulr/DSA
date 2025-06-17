import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        nextPermutation1(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void nextPermutation1(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no such element, reverse the whole array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the element just larger than nums[index] from the end
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Reverse the subarray to the right of index
        reverse(nums, index + 1, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
