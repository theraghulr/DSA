public class Searchin2DArrays {
    public static void main(String[] args) {
        int [] [] matrix ={
            {1,2,3,4},
            {6,44,65,34},
            {43,98,72,64}
        };

        int target = 72;

        System.out.println(Search(matrix,target));
    }

    static boolean Search(int[] [] matrix, int target){
        for(int i =0 ; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
