public class Task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
/**
 * 1. IndexOutOfBoundsException;
 * 2. ClassCastException:
 * 3. NullPointerException;
 * 4. Переполнение int;
 * 5. NullPointerException;
 */