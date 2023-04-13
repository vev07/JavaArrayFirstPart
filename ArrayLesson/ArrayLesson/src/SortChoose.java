import java.util.Arrays;

public class SortChoose {
    public static void main(String[] args) {
        int[] arr = {23,343,1,56,77,69,967,2,5};


        System.out.println(minNumber(arr) + " - minNumber");
        System.out.println(minItemFromIndex(arr,3) + " - minItemFromIndex");
        System.out.println(Arrays.toString(sortStep(arr))+ " - sortStep");
    }
    public static int minNumber(int[] arr) {
        int minIndex = 0;
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int minItemFromIndex(int[] arr, int start) {
        int minIndex = start;
        int minValue = arr[start];
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int[] sortStep(int[] arr) {
        for (int step = 0; step < arr.length; step++) {
            int index = minItemFromIndex(arr, step);
            int tmp = arr[step];
            arr[step] = arr[index];
            arr[index] = tmp;
        }
        return arr;
    }

}
