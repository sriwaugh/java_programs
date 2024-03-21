package java_program;
public class reverse_an_array {
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};
            int n=arr.length;
            int temp=0;
            int i;
            int k=n-1;
            for(i=0;i<n;i++)
            {
                if(i<=k) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                k--;
            }
            for(i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }

