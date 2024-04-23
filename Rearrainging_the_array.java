package java_program;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Rearrainging_the_array {
        public static void main(String[] args) {
            int n,k=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int count=0;
            int a[]=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=s.nextInt();
            }
            Stack<Integer> pos=new Stack<>();
            Stack<Integer> neg=new Stack<>();
            Stack<Integer> zero=new Stack<>();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>0)
                {
                    pos.push(a[i]);
                }
                if (a[i]<0) {
                    neg.push(a[i]);
                }
                else{
                    zero.push(a[i]);
                }
            }
            int i=0;
            while(!neg.isEmpty()||!pos.isEmpty())
            {
                if(!neg.isEmpty()&&i%2==0)
                {
                    arr.add(neg.pop());
                    i++;
                }
                else{
                    arr.add(pos.pop());
                    i++;
                }}
            while(!zero.isEmpty())
            {
                arr.add(zero.pop());
                i++;
            }
            System.out.println(arr);
        }

    }



