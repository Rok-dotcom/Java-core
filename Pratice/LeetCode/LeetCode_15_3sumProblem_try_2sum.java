import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_15_3sumProblem_try_2sum {
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,-1,-4};
        // By using HashMap
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        // use 2 for loops
        for(int i=0; i<arr.length; i++){
            int comp = 0-arr[i];
            List<Integer> l = new ArrayList<>();
            if(map.containsKey(comp)){
                l.add(comp);
                l.add(arr[i]);
            }

            if(l.size()!=0){
                list.add(l);
            }
        }


        System.out.println(list);
    }
}
