import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] arr = {23,343,1,56,77,69,967,2,5};

        System.out.println(Arrays.toString(arr));
        bubbleSortArray(arr);

        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));

    }
    /*
    complexity O(n^2)
     */
    public static void bubbleSort(int[] arr) {
        boolean isSort = false;

        while (!isSort) {
            isSort = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i -1] = tmp;
                    isSort = false;
                }
            }

        }
    }
    public static int[] bubbleSortArray(int[] arr) {

        boolean isSort = false;

        while (!isSort) {
            isSort = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    isSort = false;
                }
            }

        }
        return arr;
    }

}
