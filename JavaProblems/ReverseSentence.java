public class ReverseSentence {
    public static void main(String[] args) {
      String s = "sky is the best";
        System.out.println(reverseWords(s));


    }
    static String reverseWords(String s) {
        String [] sentence = s.split(" ");
        int i =0;
        int j = sentence.length-1;

        while(i<j){
            String temp = sentence[i];
            sentence[i]=sentence[j];
            sentence[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", sentence);
    }
}

