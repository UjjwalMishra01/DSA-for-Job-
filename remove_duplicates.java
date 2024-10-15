package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class remove_duplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;
        List<Integer> list = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                list.add(nums[i]);
            }
        }

        int j = 0;
        for (int i : list) {
            nums[j] = i;
            j++;
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(removeDuplicates(arr));
    }
}
