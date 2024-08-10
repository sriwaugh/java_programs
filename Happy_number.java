package java_program;
import java.util.HashSet;
public class Happy_number {
        public static void main(String[] args) {
            int a=25,sum=0;
            HashSet<Integer> n=new HashSet<>();
            while(true){
                sum=0;
                while (a>0)
                {
                    int rem=a%10;
                    sum+=rem*rem;
                    a=a/10;
                }
                System.out.println(sum);
                if(sum==1)
                {
                    System.out.println("Its ahappy number");
                    System.exit(0);
                }
                a=sum;
                if(n.contains(a))
                {
                    System.out.println("Not happy number");
                    System.exit(0);
                }
                n.add(a);
            }
        }
    }


