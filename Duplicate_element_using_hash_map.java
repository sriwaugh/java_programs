package java_program;
import java.util.HashSet;
public class Duplicate_element_using_hash_map {
        public static void main(String[] args) {
            HashSet<Integer> dup = new HashSet<>();
            int arr[] = {1, 2, 3, 6, 5, 8, 9};
            int j=0;

            for ( j = 0; j < arr.length; j++) {
                if (dup.contains(arr[j])) {
                    System.out.println(true);
                    System.exit(0);
                }
                dup.add(arr[j]);
            }

            System.out.println(false);


        }
    }

