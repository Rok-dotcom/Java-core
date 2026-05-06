import java.util.Arrays;

class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3};
        System.out.println(Arrays.toString(arr));
        int[] sumarr = SumArray(arr);
        System.out.println(Arrays.toString(sumarr));

    }
    static int[] SumArray(int[] arr){
        for (int i = arr.length -2 ; i >= 0 ; i--) {
            arr[i] += arr[i+1];
        }
        return arr;
    }
}
