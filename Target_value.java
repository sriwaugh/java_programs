package java_program;

public class Target_value {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 90, 6};
        int n = arr.length;
        int j = 0;
        int t = 99;
        for (int i = 0; i < n; i++)
        {
            loop:
            if (j == n - 1)
            {
                j = 0;
                continue;
            }
            else
            {
                j++;
                if (arr[i] + arr[j]==t)
                {
                    System.out.println(i + " " + j);
                }
                break loop;
            }
        }
    }
}


