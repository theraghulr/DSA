public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        insertionSort(arr);

        System.out.println("Sorted Array using Insertion Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j;

            // Shift elements using for loop
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }
    }
}
