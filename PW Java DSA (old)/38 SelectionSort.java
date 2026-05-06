import java.util.Arrays;


class SelectionSort {

    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min_index] > arr[j] ){
                    min_index = j;
                }
                if(min_index!=i){
                    int temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
