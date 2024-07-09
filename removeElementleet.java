package java_program;

public class removeElementleet {
    public static int removeElement(int[] nums, int val) {
        int h=nums.length;
        int count=0;
        for(int i=0;i<h;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,5,6,7};
        int b=5;
        System.out.println(removeElement(a,b));
    }
}
