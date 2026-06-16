import java.util.*;

public class list1 {
    public static void main(String[] args){
    /*
        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

//        list1.add(list2);
        System.out.println(list1);
        list2.clear();
        System.out.println(list1);
*/
        // by using loops
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=i+1; j<=5; j++){
                l.add(j);
            }
            list1.add(l);
        }
        System.out.println(list1);

    }
}
