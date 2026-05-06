package in.kgcoding.Collection.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Ramesh"));
        System.out.println(names.add("Koli"));
        System.out.println(names.add("Mechanical Student"));

        Utility.print(names);

        System.out.println(names.add("Ramesh"));
        System.out.println(names.contains("Ramesh"));
        System.out.println(names.size());


    }
}