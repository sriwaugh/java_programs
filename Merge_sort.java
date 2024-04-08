package java_program;
import java.util.Scanner;
public class Merge_sort {
        public static  int[] merge(int l,int h,int arr[]){

            if(l==h){
                int[] br=new int[1];
                br[0]=arr[l];
                return br;
            }
            int mid=(l+h)/2;
            int fh[]=merge(l,mid,arr);
            int sh[]=merge(mid+1,h,arr);
            return mergeshort(fh,sh);
        }
        public static  int[] mergeshort(int fh[],int sh[]) {
            int z=fh.length+sh.length;
            int arr1[]=new int[z];
            int i=0,j=0,k=0;
            while(i<fh.length&&j<sh.length){
                if(fh[i]<=sh[i])
                {
                    arr1[k]=fh[i];
                    k++;
                    i++;
                }
                else{
                    arr1[k]=sh[j];
                    k++;
                    j++;
                }

            }
            while (i<fh.length)
            {
                arr1[k]=fh[i];
                k++;
                i++;
            }
            while(j<sh.length)
            {
                arr1[k]=sh[j];
                k++;
                j++;
            }
            return arr1;
        }

        public static void main(String[] args) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the array size");
            n=s.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the array elements");
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            int h=arr.length-1;
            int l=0;
            int res[]=merge(l,h,arr);
            System.out.println("The sorted arrray are");
            for(int i=0;i<res.length;i++)
            {
                System.out.println(res[i]);
            }
        }
    }

