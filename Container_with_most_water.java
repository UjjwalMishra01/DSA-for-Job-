package src;

class Container_with_most_water {
    public static int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int temp_area = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(area, temp_area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr)); // Expected output: 49
    }
}
