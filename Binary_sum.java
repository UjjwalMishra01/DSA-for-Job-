package src;

public class Binary_sum {

    public static void main(String[] args){
        int[] arr = {1,0,1,0,1};
        int goal=2;
        System.out.println(binary_sum(arr,goal));
    }

public static int binary_sum(int[] arr, int goal){
    int subarray=0;
    for(int i=0; i<arr.length;i++){
      int sum=0;
    
      for(int j=i; j<arr.length;j++){
        sum+=arr[j];
        if(sum==goal){
            subarray++;
            
        }
        else if(sum>=goal){
            break ;
        }
        
      }
    }

    
return subarray;
}

}