public class CheckarraySortedandRotated {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        boolean Sorted = check(nums);
        System.out.println(Sorted);

    }
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1)%n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
