class SumAvg2DArray {
    public static void main(String[] args){
        System.out.println("Welcome to Sum and Average of 2D Array \n");
        int[][] Array = ArrayUtility.input2DArray();
        int Sum = ArraySum(Array);
        float Avg = Average(Array);
        System.out.println("Sum of Array is = " +Sum);
        System.out.println("Average of Array is = " +Avg);
    }
    public static int ArraySum(int[][] Array){
        int i = 0;
        int sum = 0;
        while(i < Array.length){
            int j = 0;
            while(j < Array[i].length){
                sum += Array[i][j];
                j++;
            }i++;
        }return sum;
    }
    public static float Average(int[][] Array){
        if(Array.length == 0){
            return 0;
        }
        int size = 0;
        int rows = Array.length;
        int cols = Array[0].length;
        size = rows * cols;
        return ArraySum(Array) / size;
    }
}
