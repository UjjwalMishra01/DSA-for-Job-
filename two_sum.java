package src;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(twoSum(num,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i =0; i <nums.length-1; i++)
        {
            for(int j=0; j<nums.length;j++)
            if((nums[i]+nums[j] == target) && j!=i){
                indices[0] = i;
                indices[1] = j;
                return indices;
            }
        }
        return indices;
    }
}
