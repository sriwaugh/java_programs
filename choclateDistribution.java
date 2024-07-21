package java_program;
import java.util.Arrays;
public class choclateDistribution {
    public static int minChocolates(int[] arr) {
            Arrays.sort(arr);

            int minDiff = arr[arr.length - 1] - arr[0];
            for (int i = 0; i <= arr.length - 5; i++) {
                minDiff = Math.min(minDiff, arr[i + 4] - arr[i]);
            }

            return minDiff;
        }

        public static void main(String[] args) {
            int[] arr = {10, 4, 12, 3, 1};
            int result = minChocolates(arr);
            System.out.println(result);
        }
    }

