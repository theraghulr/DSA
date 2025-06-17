import java.util.Arrays;
public class RowColsearch {
    public static void main(String[] args) {
        int [] [] matrix = {
                {10,20,30,40},
                {11,25,35,39},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(serach(matrix,38)));


    }
    static int [] serach (int[] [] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
        
    }

}