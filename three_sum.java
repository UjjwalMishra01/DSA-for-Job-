package src;

import java.util.ArrayList;
import java.util.List;

public class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
        int sum=0;
        for(int i=0, j=i+1,k=i+2; i< nums.length-2;){
            sum =nums[i]+nums[j]+nums[k];
         if(sum==0){
             temp.add(nums[i]);
             temp.add(nums[j]);
             temp.add(nums[k]);
       list.add(temp);
         }
         if(k< nums.length){
             k++;
         }
         else if(j< nums.length-1){
             j++;
             k=j+1;
         }
         else if(i<nums.length){
             i++;
             j=i+1;
             k=j+1;
         }
         else{
             break;
         }
      }


      return list;
    }

}
