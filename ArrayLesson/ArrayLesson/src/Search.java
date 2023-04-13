public class Search extends Bubble{
    public static void main(String[] args) {
        int[] arr = {23,343,1,56,77,69,967,2,5};
        System.out.println(search(arr,2));

        int[] arr2 = {12,13,15,48,59,60};
        System.out.println(searchBinaryRecursive(arr2,0, arr2.length, 13 ));

    }

     /*
    complexity O(n)
     */

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    /*
complexity O log(n)
*/
    public static int searchBinaryRecursive(int[] arr, int startIndex, int endIndex, int key) {
        if(endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (arr[middleIndex] == key) {
                return middleIndex;
            }
            if (arr[middleIndex] > key) {
                return searchBinaryRecursive(arr,startIndex,middleIndex - 1, key);
            } else {
                return searchBinaryRecursive(arr, middleIndex + 1, endIndex, key);
            }
        }
        return - 1;
    }
}
