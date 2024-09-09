package java_program;

public class bubbleSort {
        public static void  bubblesort(int arr[], int n)
        {
            for (int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
        public static void main(String[] args) {
            int arr[]={10,5,3,2,1,0};
            int n=arr.length;
            bubblesort(arr,n);
        }
    }

