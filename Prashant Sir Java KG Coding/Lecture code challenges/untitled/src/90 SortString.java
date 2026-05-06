import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Ramesh", "Mechanical", "Student", "B Div");
        System.out.println(list);
        sortInDecending(list);
        System.out.println(list);
    }
    public static void sortInDecending(List<String> StringList){
        Collections.sort(StringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(1)) {
                    return -1;
                }else{
                    return 1;
                }
            }
        });
    }
}
