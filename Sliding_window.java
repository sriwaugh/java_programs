package java_program;

public class Sliding_window {
    public static int window(int[] arr,int k)
    {
        int sum=0,MaxSum=Integer.MIN_VALUE;
        int l=0,r= k-1,n= arr.length-1;
        for (int i = 0; i <= r ; i++) {
               sum+=arr[i];
        }
        MaxSum=Math.max(MaxSum,sum);
        while (r<n)
        {
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            MaxSum=Math.max(MaxSum,sum);
        }
        return MaxSum;
    }
    public static void main(String[] args) {
         int arr[] =new int []{0,1,2,3,4,-1,9,8};
        System.out.println(window(arr,4));
    }
}
