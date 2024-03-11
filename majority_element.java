package src;

public class majority_element {

    public static void main(String[] args) {
        int[] arr= {1,2,2};
        insertion(arr);
        System.out.println(majorityElement(arr));
    }
    
    static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int majorityElement(int[] arr) {
        int count = 1;
        int maj = arr[0];
        int majorityCount = arr.length / 2;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == maj)
                count++;
            else {
                count--;
                if (count == 0) {
                    maj = arr[i];
                    count = 1;
                }
            }
        }

        count = 0;
        for (int value : arr) {
            if (value == maj)
                count++;
        }

        if (count > majorityCount)
            return maj;
        else
            return -1; // No majority element
    }
}
