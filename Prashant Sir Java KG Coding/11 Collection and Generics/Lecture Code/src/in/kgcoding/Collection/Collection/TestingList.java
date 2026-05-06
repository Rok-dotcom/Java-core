package in.kgcoding.Collection.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args){
        List<String> strList = new ArrayList<>();

        strList.add("Ramesh");
        strList.add(1,"Shivaji");
        strList.add("Koli");

        strList.remove(1);


        if(strList.contains("Koli")){
            System.out.println(strList.indexOf("Koli"));
        }

        for(int i=0; i<strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }
}
