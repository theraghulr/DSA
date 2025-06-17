import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {  // ✅ Removed space between []
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18} // ✅ Removed trailing comma — trailing comma in last array element can cause syntax errors
        };

        int[][] result = merge(intervals);

        // ✅ Correct way to print 2D array contents
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) return new int[0][];

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] ans = new int[n][2];
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (index == -1 || intervals[i][0] > ans[index][1]) {
                index++;
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
            } else {
                ans[index][1] = Math.max(ans[index][1], intervals[i][1]);
            }
        }

        return Arrays.copyOf(ans, index + 1);
    }
}



