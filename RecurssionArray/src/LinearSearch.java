public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {175,245,56,74,263,98};
        System.out.println(Search(arr,74,0));
        System.out.println(SearchIndex(arr,74,0));

    }
    static boolean Search(int[] arr, int target, int index){
        if(index == arr.length ){
            return false;
        }
        return target == arr[index] || Search(arr,target,index+1);
    }


    static  int SearchIndex(int[] arr,  int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }else{
            return SearchIndex(arr, target,index+1);
        }
    }
}

