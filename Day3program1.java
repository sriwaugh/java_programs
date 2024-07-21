package java_program;
public class Day3program1 {

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void insertionSort(int[] arr) {
            int len = arr.length, key = 0, j = 0;
            for (int i = 1; i < len; i++) {
                key = arr[i];
                j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        public static void selectionSort(int[] arr) {
            int minIndex = 0, len = arr.length;
            for (int i = 0; i < len - 1; i++) {
                minIndex = i;
                for (int j = i + 1; j < len; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                swap(arr, minIndex, i);
            }
        }

        public static void bubbleSort(int[] arr) {
            int len = arr.length;
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = new int[] { 5, 4, 3, 2, 1 };
            bubbleSort(arr);
            selectionSort(arr);
            insertionSort(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

