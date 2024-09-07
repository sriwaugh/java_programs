package java_program;
public class sample2 {

        public static int searchInsert(int[] nums, int target) {
            int x=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==target)
                {
                    return i;
                }
            }
            int j=0;
            for(int i=0;i<nums.length;i++)
            {
                if(i<nums.length-1)
                    j=i+1;
                if(nums[i]>target)
                {
                    return 0;
                }
                if(nums[i]<target&&nums[j]>target)
                {
                    x=i+1;
                    return x;
                }
            }

            x=nums.length;
            return x;
        }

        public static void main(String[] args) {
            int[] a=new int[]{1,2,3,5,6,7};
            int b=4;
            System.out.println(searchInsert(a,b));
    }
}
