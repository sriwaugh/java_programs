package java_program;

import java.util.Scanner;
public class subarrayWithSum {
        static void find_position(int[] a,int n,int t)
        {
            int sum=0;int first;
            for(int i=0;i<n;i++)
            {
                sum=a[i];
                first=i;
                for(int j=i+1;j<n;j++)
                {
                    sum+=a[j];
                    if(sum<=t) {
                        if (sum == t) {
                            int last=j+1;
                            System.out.println(first+1 + " " + last);
                            System.exit(0);
                        }
                    }
                    else {
                        break;
                    }
                }
            }
            System.out.println(-1);
        }
        public static void main(String[] args) {
            int a[]= {1, 4};
            int targetvalue=0;
            find_position(a,a.length,targetvalue);
        }
    }