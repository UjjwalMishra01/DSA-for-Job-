package src;

public class sample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int i = 0, j = i + 1, k = i + 2; i < nums.length - 2; ) {

            if(k< nums.length){
                System.out.println("Value of k incremented ="+k+"j="+j+"i="+i);
                k++;
            }
            else if(j< nums.length-1){
                System.out.println("Value of j and k incremented ="+k+"j="+j+"i="+i);
                j++;
                k=j+1;
            }
            else if(i<nums.length){
                System.out.println("Value of i incremented ="+i+"j="+j+"k="+k);
                i++;
                j=i+1;
                k=j+1;
            }
            else{
                break;
            }
        }
    }
}
