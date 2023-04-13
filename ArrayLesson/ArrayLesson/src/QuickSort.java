import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23,343,1,56,77,69,967,2,5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    /*
complexity O(log n)
 */
    private static void quickSort(int[] arr,int from, int to) {
        if (from < to) {
            int divideIndex = partiton(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr,divideIndex, to);
        }
    }

    private static int partiton(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from ) / 2];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int tmp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
