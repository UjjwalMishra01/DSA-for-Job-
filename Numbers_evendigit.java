package src;

public class Numbers_evendigit {
    public static void main(String[] args) {
   int[] nums  ={437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int digit = 0;
        for(int i =0; i<nums.length; i++){
            int count =0;
         int num = nums[i];
         for( ; num!=0;num/=10){
             count++;
            }
         if(count%2==0){
             digit++;
         }
        }
     return digit;
    }
}
