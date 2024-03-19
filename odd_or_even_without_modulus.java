package java_program;

public class odd_or_even_without_modulus {
        public static boolean isodd(int n)
        {
            if((n &1)==1)
            {
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String[] args) {
            int n=19;

            System.out.println(isodd(n));
        }
    }

