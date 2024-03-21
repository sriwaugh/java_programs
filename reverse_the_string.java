package java_program;
public class reverse_the_string {
        public static void main(String[] args) {
            String sen="The Sky is blue";
            String[] sent=sen.split(" ");
            int n=sent.length;
            for(int i=n-1;i>=0;i--)

            {
                System.out.print(" "+sent[i]);

            }
        }
    }

