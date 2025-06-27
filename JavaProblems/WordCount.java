public class WordCount{
    public static void main(String[] args) {
        String sentence ="there are manymany in the manyofmany";
        String target = "many";
        System.out.println(countword(sentence,target));
    }
    public static int countword(String s ,String target){
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(target, index)) != -1){
            count++;
            index++;
        }
        return count;
    }

}