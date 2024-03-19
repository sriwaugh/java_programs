package java_program;

public class majority_element {
    public static  int majority(int[] arr){
        int n=arr.length;


        int count;
        for(int i=0;i<n;i++)
        {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }


            if (count > (n / 2)) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,1};
        int res=majority( arr);
        System.out.println(res);


    }
}
