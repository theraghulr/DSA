public class FirstndLastPosition {

    // Find the first and last position of the element in a sorted array
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = SearchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    static int[] SearchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int Search(int[] nums, int target, boolean Firstindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (Firstindex) {
                    end = mid - 1; // look on left side
                } else {
                    start = mid + 1; // look on right side
                }
            }
        }
        return ans;
    }
}

