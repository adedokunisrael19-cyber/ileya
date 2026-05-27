
import java.util.Arrays;

public class PerfectSquare {


    public static boolean isPerfectSquare(int num) {
        int root = (int) Math.sqrt(num);
        return root * root == num;
    }


    public static int[] getPerfectSquares(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])) {
                count++;
            }
        }

        int[] result = new int[count];
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])) {
                result[position] = arr[i];
                position++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 7, 9, 10, 16, 18};

        System.out.println(Arrays.toString(getPerfectSquares(numbers)));
    }
}


