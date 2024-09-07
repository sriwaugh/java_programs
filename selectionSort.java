package java_program;

public class selectionSort {
    public static void selectionsort(int arr[],int n)
    {
        int small=0;
        for (int i=0;i<n;i++)
        {
            small=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        for (int i=0;i<n;i++ )
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={10,4,5,3,2,1};
        int n=arr.length;
        selectionsort(arr,n);
    }
}
