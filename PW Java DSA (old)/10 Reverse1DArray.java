import java.util.Arrays;

class Reverse1DArray {

    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        System.out.println(Arrays.toString(arr));
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void ReverseArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
                int temp = arr[i];
                arr[i]   = arr[arr.length - i -1];
                arr[arr.length - i -1] = temp;
        }

    }

}

