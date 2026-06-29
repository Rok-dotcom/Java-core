import java.util.*;

public class SortColor_75 {

    ///  Dutch flag algorithm  29 June 2026
    public static void sort(int[] arr){
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){ // swap with low and low++ mid ++
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }


    }

    /// it only contains 2 digits '0' and '1'
    /// 28 June 2026
    public static void sortColors(int[] arr){
        int st = 0;
        int end = arr.length-1;

        while(st<=end){
            while(arr[st] == 0){
                st++;
            }while(arr[end] == 1){
                end--;
            }
            // swap
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {0,1,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
