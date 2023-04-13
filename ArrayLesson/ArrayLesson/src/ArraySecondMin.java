public class ArraySecondMin {
    public static void main(String[] args) {
        int[] arr = {23,343,1,56,77,69,967,2,5};

        System.out.println(minItem(arr));
    }
    /*
    O(n)
     */
    public static int minItem(int[] arr) {
        int min = arr[0];
        int min2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
            }
        }
       return min2;
    }
}
