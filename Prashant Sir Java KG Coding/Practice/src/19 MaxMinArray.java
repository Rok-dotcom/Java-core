class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 5};
        int max = MaxValue(arr);
        System.out.println("max value is " + max);
    }

    public static int MaxValue(int[] arr) {
        int i = 0;
        while (i <= arr.length) {
            int j = 1;
            int maxvalue = 0;
            while (j < arr.length) {
                if (arr[i] > arr[j]) {
                    maxvalue = arr[i];
                }
                j++;
            }i++;
            return maxvalue;
        }return 0;
    }
}

