package java_program;

public class FindPair {
        static void findPair(int arr[], int sum) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == sum) {
                        System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                        return;
                    }
                }
            }
            System.out.println("Pair not found");
        }

        public static void main(String[] args) {
            int arr[] = {1, 4, 7, 8, 3, 9};
            int sum = 10;
            findPair(arr, sum);
        }
    }

