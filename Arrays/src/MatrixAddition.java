public class MatrixAddition {
    public static void main (String [] args){
        int [] [] a = {
                {2,5,5},
                {6,3,6},
                {1,5,9}
        };

        int [] [] b= {
                {1,5,5},
                {4,6,5},
                {7,2,9}
        };



        if(a.length != b.length || a[0].length != b[0].length){
            System.out.println("not applicable");
            return;
        }

        int [] [] c = new int [a.length] [a[0].length];

        for(int i =0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultant matrix of additon is : ");

        for(int i=0; i<c.length ; i++){
            for(int j =0; j<c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
