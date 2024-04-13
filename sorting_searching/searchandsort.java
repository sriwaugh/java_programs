public class searchandsort implements searchingandsorting{
    public void sort(int a[])

    {
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


    }
    public void search(int a[],int x)
    {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            if(a[i]==x)
            {
                System.out.println("The search element index is "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
}
