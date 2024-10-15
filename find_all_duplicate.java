package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class find_all_duplicate {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++) {
            if (nums[i] == nums[i + 1]) {
                list.add(nums[i]);
                i++;
            }
        }
        return list;
    }
}
