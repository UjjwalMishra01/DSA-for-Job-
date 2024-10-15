package src;

import java.util.Scanner;
public class createTargetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrray");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        int[] target = new int[size];
        input(nums, index, size);
        create_array(nums, index, target, size);
    }

    public static void input(int[] nums, int[] index, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the index of array");
        for (int i = 0; i < size; i++) {
            index[i] = sc.nextInt();
        }
    }

    public static void create_array(int[] nums, int[] index, int[] target, int size) {
        for (int i = 0; i < size; i++)  // for changing index of target elements
        {
            int ind = index[i];
            if(ind>=nums.length)
            {
                System.out.println("Invalid Index Entered");
                return;
            }
            if(ind>=i)
            {
                target[i] = nums[ind];
            }
            else
            {
                for(int j =target.length-1; j>=ind;j--)
                {
                    if(j!=ind)
                    {
                        target[j]=target[j-1];
                    }
                    else
                    {
                        target[ind]=nums[i];
                    }
                }
            }
        }
        System.out.println("Target Array:");
        for(int i =0; i<target.length; i++)
        {
            System.out.println(target[i]);
        }
    }
}