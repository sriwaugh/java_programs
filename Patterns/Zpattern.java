package java_program.Patterns;
import java.util.*;
public class Zpattern {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String z=s.nextLine();
            int a=0;
            for(int i=0;i<7;i++)
            {
                for(int j=0;j<7;j++)
                {
                    if(i==0)
                    {
                        System.out.print(z.charAt(a)+" ");
                        a++;
                    }
                    else if(i==6)
                    {
                        System.out.print(z.charAt(a)+" ");
                        a++;
                    }
                    else if(i+j==6)
                    {
                        System.out.print(z.charAt(a)+"  ");
                        a++;
                    }
                    else{
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }
    }

