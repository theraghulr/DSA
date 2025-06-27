import java.util.HashMap;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(arr,k));
    }
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Handle case when prefix sum equals k

        int preSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int remove = preSum - k;
            count += map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}
