package src;

class N_Unique_Integers_Sum2Zero {
    public static void main(String[] args) {
        int n =0;
        System.out.println((sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int m = -(n / 2);
        int arr[] = new int[n];
        if(n % 2 != 0) {
            for(int i = 0; i < n; i++) {
                arr[i] = m++;
            }
        } else {
            for(int i = 0; i < n; i++) {
                if(m == 0) {
                    m++;
                }
                arr[i] = m++;
            }
        }
        return arr;
    }
}