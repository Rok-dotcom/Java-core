import java.util.*;

public class firstAndLastIdx {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] arr = findFirstAndLast(nums,target);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] findFirstAndLast(int[] nums, int target){
        int[] arr = new int[2];
        int st = 0;
        int end = nums.length;
        int i=0;

        while(i< arr.length && st<= end){
            int mid = st+end/2;
            if(nums[mid] == target){
                arr[i++] = mid;
            }else if(nums[mid]<target){
                st = mid;
            }else if(nums[mid]>target){
                end = mid+1;
            }
        }
        return arr;
    }
}
