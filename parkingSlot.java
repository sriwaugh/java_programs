package java_program;

public class parkingSlot {
        public static int maxCarsParked(int n, char[] arr) {
            int maxCars = 0;
            int currentCars = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 'S') {
                    currentCars++;
                } else {
                    maxCars = Math.max(maxCars, currentCars);
                    currentCars = 0;
                }
            }

            maxCars = Math.max(maxCars, currentCars);
            return maxCars;
        }

        public static void main(String[] args) {
            int n = 16;
            char[] arr = "XXXSXXSXXSSXXSXX".toCharArray();
            int result = maxCarsParked(n, arr);
            System.out.println(result);
        }
    }

