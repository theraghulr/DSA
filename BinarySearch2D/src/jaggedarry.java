public class jaggedarry {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3},
                {2,5},
                {6,7,9,3}
        };
        for (int row = 0; row <arr.length; row++){
            for(int col =0; col<arr[row].length; col++ ){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();
        }
    }
}
