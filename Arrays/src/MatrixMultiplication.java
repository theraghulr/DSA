public class MatrixMultiplication {
    public static void main(String[] args) {
        int [] [] a = {
                {2,5,5},
                {6,3,6},
                {1,5,9}
        };
        int [] [] b= {
                {1,5},
                {4,6},
                {7,2}
        };

        int [] [] c = new int [a.length] [b[0].length];
        for(int i =0; i<a.length; i++){
            for(int j =0; j<b[0].length; j++){
                for(int k= 0;k<a[0].length; k++){
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Resultant matrix is : ");

        for(int i=0; i<c.length ; i++){
            for(int j =0; j<c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
