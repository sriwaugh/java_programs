package java_program;
import java.util.HashMap;
import java.util.Scanner;
public class Hashmap_String_and_Integer {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            HashMap<Integer,String> roll=new HashMap<>();
            roll.put(101,"sri");
            roll.put(102,"sas");
            roll.put(103,"shek");
            roll.put(104,"mari");
            roll.put(105,"babu");
            System.out.println("Enter your roll no");
            int z=s.nextInt();
            System.out.print("Your name :");
            System.out.println(roll.get(z));
        }
    }

