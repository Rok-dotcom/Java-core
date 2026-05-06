import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,5,7,5,4,4,3,6,1);

        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,7));

    }
}
