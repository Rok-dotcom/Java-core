import java.util.Arrays;

class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("Your merged array is :");
        ArrayUtility.displayArray(mergedArr);
        int []sort=sort(arr1);
        ArrayUtility.displayArray(sort);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int newsize = arr1.length + arr2.length;
        int[] newArr = new int[newsize];
        int i = 0, j = 0 , k = 0;
        while(i < arr1.length || j < arr2.length){
            if (j == arr2.length ||
                    (i < arr2.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[j];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}