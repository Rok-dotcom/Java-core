
package Collections;
import java.util.*;

class HashMapL {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();

        // insertion
        // country population
        map.put("India", 130);
        map.put("China", 150);
        map.put("US", 30);

        // to remove give key as input
        map.remove("US");

        System.out.println(map);

        // get value. You should enter the key
        System.out.println(map.get("India"));

        // tells is contain
        if(map.containsKey("China")){
            System.out.println("is contains");
        }

        // prashant sir
        Integer count = map.get("India");
        System.out.println(count);

        // traverse by using for each loop
/*
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // 2nd traverse method

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
        */
    }
}
