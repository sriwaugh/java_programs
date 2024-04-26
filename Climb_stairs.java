package java_program;
import java.util.*;
public class Climb_stairs {
        public static int climb(int n)
        {
            if(n==2||n==1)
            {
                return n;
            }
            else{
                return climb(n-1)+climb(n-2);
            }
        }
        public static void main(String[] args) {
            int n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int res=climb( n);
            System.out.println(res);
        }
    }

