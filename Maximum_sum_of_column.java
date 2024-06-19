package java_program;
import java.util.*;
public class Maximum_sum_of_column {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE, sum = 0, maxCol = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[j][i];
            }
            if (maxSum < sum) {
                maxSum = sum;
                maxCol = i;
            }
        }

        System.out.println("max sum is: " + maxSum);
        System.out.println("max sum column is: " + (maxCol + 1));
    }
}
