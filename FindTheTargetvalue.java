package java_program;

public class FindTheTargetvalue {
    public static int[] twoSum(int[] nums, int target) {

        int a[]=new int[2];
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,8,7};
        int b=5;
        int[] c=twoSum(a,b);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
