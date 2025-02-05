package src;

public class sort_colors {
    public void sortColors(int[] nums) {
        int[] count = {0, 0, 0};

        for (int i : nums) {
            if (i == 0) {
                count[0]++;
            } else if (i == 1) {
                count[1]++;
            } else {
                count[2]++;
            }
        }

        int index = 0;

        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }
}
