import java.util.ArrayList;
import java.util.Collections;


class reverseList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //1
        list.add(2); //1 2
        list.add(3); //1 2 3
        list.add(4); //1 2 3 4
        list.add(5); //1 2 3 4 5

        ArrayList<String> l = new ArrayList<>();
        l.add("Welcome");
        l.add("To");
        l.add("Physics");
        l.add("Wallah");
        System.out.println("Original List is: "+l);
        Collections.sort(l);
        System.out.println("sorted list is :"+ l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Descending order is: "+l);

//        list.remove(1);
//        list.remove(Integer.valueOf(2));
//        list.set(1,6);


        System.out.println("Original list is: "+list);
//        reverse(list);
        Collections.reverse(list);    //collection class
        Collections.sort(list);       //sort in Ascending order
        System.out.println("Ascending order : "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order: "+ list);
        System.out.println("Reversed list is: "+list);
    }
    static void reverse(ArrayList<Integer> list){
        int i = 0, j = list.size() -1 ;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

}
