import java.util.ArrayList;
import java.util.List;

public class Lc_228 {

/*
Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
 */

    public static void main(String[] args){
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }

        public static List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();

            int st = nums[0];
            int end = nums[0];
            int next = 0;
            for(int i=0; i<nums.length-1; i++){
                next = nums[i+1];
                if(nums[i] == next-1){
                    end = nums[i+1];
                }else{
                    if(st != end){
                        list.add(st+"->"+end);
                    }else{
                        list.add(st+"");
                    }
                    st = nums[i+1];
                }
                System.out.println("i"+i);
            }

            return list;
        }

}
