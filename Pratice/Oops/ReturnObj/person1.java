package ReturnObj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class person1 {
    public static void main(String[] args){
        // in other language
//      datatype variable operator allocate memory  constructor initializer
        Human      h        =       new                   Human();

//        List<Human> list = printObj();
//        System.out.println(list.get(0).getName());
//        System.out.println(list.get(0).getAge());
//        System.out.println(list.get(1).getName());
//        System.out.println(list.get(1).getAge());
    }

    public static List<Human> printObj(){

        ///  object of human class
        Human h1 = new Human();
        h1.setName("Rohit");
        h1.setAge(23);

        ///  object of human class
        Human h2 = new Human();
        h2.setName("Sham");
        h2.setAge(25);
        List<Human> list = Arrays.asList(h1,h2);
        return list;
    }
}
