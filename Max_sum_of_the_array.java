package java_program;
import java.util.*;
public class Max_sum_of_the_array {
    public static int maxSum(int[] arr, int k) {
//         Queue<Integer> maxQueue = new PriorityQueue<>((a, b) -> b - a);
//         for (int i : arr) {
//         maxQueue.add(i);
//         }
//         int sum = 0;
//         for (int i = 0; i < k; i++) {
//         sum += maxQueue.poll();
//         }
//         return sum;

        int sum = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return sum;
    }
}
