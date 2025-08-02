import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 0, 0, 0};
        int[] nums2 = {6, 7, 8};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // Last index of nums1's actual elements
        int j = n - 1;         // Last index of nums2
        int k = m + n - 1;     // Last index of nums1 (combined length)

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // If nums2 is left
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}