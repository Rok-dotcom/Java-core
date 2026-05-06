class MaxMinArray {
    public static void main(String[] args){
     System.out.println("Welcome to Max and Min Array");
     int[] arr= ArrayUtility.inputArray();
     int Max = max(arr);
     int Min = min(arr);
     System.out.println("Max value of Array is " +Max);
     System.out.println("Min value of Array is " +Min);

    }
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }i++;
        }
        return min;
    }

    public static int max(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while(i < arr.length){
            if(max < arr.length){
                max = arr[i];
            }i++;
        }
        return max;
    }
}
