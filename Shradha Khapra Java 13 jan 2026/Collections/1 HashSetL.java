///  13 jan 2026
package Collections;

import java.util.HashSet;
import java.util.Iterator;

class HashSetL {

    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        // insert the element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // removes element
        set.remove(3);

        // size of the set
        System.out.println(set.size());

        // check if contains
        if(set.contains(4)){
            System.out.println("set contains ");
        }

        // Traversing the set
        // first import the Iterator
        // second create obj

        Iterator it = set.iterator();

        System.out.println(it.next());

        // traverse
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
