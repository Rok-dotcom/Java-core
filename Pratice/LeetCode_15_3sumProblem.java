import java.util.ArrayList;
import java.util.List;

public class LeetCode_15_3sumProblem {
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,-1,-4};

//        bruteforce
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                List<Integer> l = new ArrayList<>();
                for(int k=j+1; k<arr.length; k++){
                    if( arr[i]+arr[j]+arr[k] == 0){
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[k]);
                    }
                }
                if(l.size() !=0){
                    list.add(l);
                }
            }
        }
        System.out.println(list);
    }
}
