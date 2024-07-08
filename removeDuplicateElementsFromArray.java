package java_program;

public class removeDuplicateElementsFromArray {
    public static int removeDuplicates(int[] nums) {

        int k=1;
        for(int i=1;i<nums.length;i++)
        {

            if(nums[i]!=nums[i-1])
            {
                nums[k]=nums[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,5,6,7,7};
        System.out.println(removeDuplicates(a));

    }
}
