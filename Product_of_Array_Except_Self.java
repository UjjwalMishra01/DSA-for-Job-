package src;
import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] ans= new int[arr.length];
        for(int i=0; i<arr.length;i++){
           ans[i] = find_product(arr, i);
    
    }
    System.out.println((Arrays.toString(ans)));
}

    public static int find_product(int[] arr, int i){
      int product=1;
      for(int j=0; j<arr.length;j++){
        if(j!=i){
            product*=arr[j];
        }
      }
      return product;
    }
}
