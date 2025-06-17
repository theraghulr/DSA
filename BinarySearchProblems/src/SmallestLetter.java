public class SmallestLetter {
    //744.)Find smallest letter greater than target.
    public static void main(String[] args) {
        char[] letters = {'a','b','c','e','f','j'};
        char target = 'f';
        System.out.println(NextCharacter(letters,target));


    }

    static char NextCharacter(char[] letters , char target){

        int start =0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else {
                start =mid+1;
            }
        }
        return letters[start%letters.length];

    }


}


