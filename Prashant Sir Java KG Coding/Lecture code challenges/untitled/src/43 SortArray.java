class SortArray {
    public static void main(String[] args){
        System.out.println("Welcome to Sorted Array Checkpoint");
        int[] arr = ArrayUtility.inputArray();
        boolean isDec = isDecreasing(arr);
        boolean isInc = isincreasing(arr);
        if(isDec || isInc ){
            System.out.println("Your Array is Sorted ");
        }else{
            System.out.println("Your Array is not Sorted ");
        }
    }
    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if (arr[i] > arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isincreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if(arr[i] < arr[i-1] ){
                return false;
            }
            i++;
        }
        return true;
    }
}
