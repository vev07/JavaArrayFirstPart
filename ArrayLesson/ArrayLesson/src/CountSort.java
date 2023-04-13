import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,1,2,3};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] arr) {
        final  int MAX_VALUE = 100;
        int[] count = new int[MAX_VALUE];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;
        }
        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }
}
