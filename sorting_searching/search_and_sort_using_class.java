import java.util.Scanner;

public class search_and_sort_using_class {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        searchandsort ss=new searchandsort();
        ss.sort( a);
        System.out.println("Enter the search element");
        int x=s.nextInt();
        ss.search(a,x);


    }
}
