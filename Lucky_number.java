package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lucky_number {
    public static void main(String[] args) {
        int[][] num = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumber(num));
    }
   public static List<Integer> luckyNumber(int[][] num) {
       boolean min, max;
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i=0; i<num.length; i++){
           for(int j=0; j<num.length; j++)
           {
             min = minRow(num, i, num[i][j] );
             max = maxColumn(num, j , num[i][j]);
             if(max== true && min== true){
                 list.add(num[i][j]);
             }
           }
       }
       return list;
   }

    private static boolean maxColumn(int[][] arr, int column, int num) {
        boolean ans = true;
        for (int k = 0; k < arr.length; k++) {
            if (k != column) {
                if (arr[k][column] > num) {
                    ans = false;
                    break;  // No need to continue checking once the condition is false
                }
            }
        }
        return ans;
    }

    public static boolean minRow(int[][] arr, int row, int num) {
        boolean ans = true;
        for (int k = 0; k < arr[row].length; k++) {
            if (k != row) {
                if (arr[row][k] < num) {
                    ans = false;
                    break;  // No need to continue checking once the condition is false
                }
            }
        }
        return ans;
    }


}
