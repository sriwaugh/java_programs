package java_program;

public class InsertionSort {
    public static void Insertionsort(int arr[],int n)
    {
        int key=0;
        for(int i=1;i<n;i++)
        {
            key=arr[i];
            int j=i-1;
            while(j>= 0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5};
        int n=arr.length;
        int a=0;
        Insertionsort(arr,n);
    }
}

