import java.util.ArrayList;

public class ArrayString {
    public static void main(String[] args) {
        String str = "asasasasaaaasasasaqsqqqqqsasassas";
        String strKey = "sas";
        System.out.println(searchNaive(str,strKey));
    }
    public static ArrayList<Integer> searchNaive(String str, String key) {
        ArrayList<Integer> foundPositions = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            while (j < key.length() && i + j < str.length() && key.charAt(j) == str.charAt(i + j)) {
                j++;
            }
            if (j == key.length()) {
                foundPositions.add(i);
            }
        }
        return foundPositions;
    }

}
