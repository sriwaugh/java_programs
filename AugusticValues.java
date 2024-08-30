package java_program;
import java.util.Scanner;


public class AugusticValues {
    public static void augusticvalue(String st)
    {
        int no=Integer.valueOf(st);
        int temp=no;
        int no3=no;
        for (int i = 1; i < st.length(); i++) {
            int no1 =Integer.valueOf(st.substring(0,i));
            int no2=Integer.valueOf(st.substring(i,st.length()));
             no3+=no1+no2;
        }
        while (temp>0)
        {
            no3+=temp%10;
            temp=temp/10;
        }
        System.out.println(no3);
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String st=s.nextLine();
        augusticvalue(st);
    }
}
