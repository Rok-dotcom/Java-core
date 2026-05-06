import java.util.Arrays;

//After long gap of 15/07/2025 - 15/08/2025
//1st Revision on 16/08/2025

class Swap2Pointer {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        int last = arr.length -1;
        swap(arr, 0, last);
        System.out.println(Arrays.toString(arr));
    }
    static int[] swap(int[] arr, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[start] > arr[end]){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}
