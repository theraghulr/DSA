import java.util.Arrays;

public class Asterioddestroyer {
    public static void main(String[] args) {
//        int [] nums = {9,4,23,4};
//        int mass = 5;
        int [] nums = {21,9,5,3};
        int mass = 10;
        System.out.println(asteroidsDestroyed(mass,nums));

    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids); // use long for mass incase larger dataset or many test cases;
        int i= 0;
        while(i<asteroids.length){
            if(mass>=asteroids[i]){
                mass += asteroids[i];
                i++;
            }else return false;
        }
        return true;
    }
}
