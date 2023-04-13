import java.util.Arrays;

public class JustNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomNum(2,100,8)));


    }
    public static int[] randomNum(int from, int to, int sizeArr) {
        int[] numbers = new int[sizeArr];
        int count = 0;
        while (count < sizeArr) {
            for (int i = from; i <= to; i++) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    numbers[count] = i;

                }

            }
            count++;
        }


        return numbers;
    }
}
