class ArrayDiaSum {

    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        long sum = checkEvenOdd(arr);
        System.out.println("Sum of Array's Diagonal is = " + sum);
    }
    public static long checkEvenOdd(int[][] arr){
        long sum = leftdiagonal(arr)+ rightdiagonal(arr);
        if(arr.length %2 != 0){
            int ind = arr.length/2;
            sum -= arr[ind][ind];
        }return sum;
    }
    public static long leftdiagonal(int[][] arr){
        int i = 0;
        long sum1 = 0;
        while(i < arr.length){
            sum1 += arr[i][i];
            i++;
        }return sum1;
    }
    public static long rightdiagonal(int[][] arr) {
        int i = 0, sum2 = 0;
        while (i < arr.length) {
            sum2 += arr[i][arr[i].length - 1 - i];
            i++;
        }return sum2;
    }
}