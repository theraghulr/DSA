 public class reverse_number {
     public static void main(String[] args) {
         char[] letters = {'h', 'e', 'l', 'l', 'o'};
         char[] letters_demo = new char[letters.length];
         int j=0;
         for(int i=letters.length-1;i>=0;i--){
             letters_demo[i]=letters[j];
             j++;
         }
         for(int k=0;k<letters.length;k++){
             System.out.print(letters_demo[k]);
         }
     }
 }
