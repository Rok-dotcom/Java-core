import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LeetCode_15_3sumProblem_hashmap {
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,-1,-4};
        // By using HashMap
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        // use 2 for loops
        for(int i=0; i<arr.length-1; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=i+1; j<arr.length; j++){
                int comp = arr[i] + arr[j];
                comp *= -1;
                if(map.containsKey(comp)){  // adds 3 elements
                    l.add(comp);
                    l.add(arr[i]);
                    l.add(arr[j]);
                    break;
                }
                map.put(comp,0);
            }
            if(!(list.contains(l) && l.size() == 3)){    // adds into list checks if duplicate is present or not
                list.add(l);
            }
        }


        System.out.println(list);
    }
}
