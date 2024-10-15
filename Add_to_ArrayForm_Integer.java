package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_ArrayForm_Integer {
    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = k;

        for (int i = num.length - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
