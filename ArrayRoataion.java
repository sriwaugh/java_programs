package java_program;

public class ArrayRoataion {
        public static void rotateArray(int[] arr, int n, int d) {
            int[] temp = new int[d];
            for (int i = 0; i < d; i++) {
                temp[i] = arr[n - d + i];
            }
            for (int i = n - 1; i >= d; i--) {
                arr[i] = arr[i - d];
            }
            for (int i = 0; i < d; i++) {
                arr[i] = temp[i];
            }
        }

        public static void main(String[] args) {
            int n = 5;
            int[] arr = {1, 2, 3, 4, 5};
            int d = 3;

            rotateArray(arr, n, d);

            System.out.print("Output: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

