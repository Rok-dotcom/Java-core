package in.rxcoding.MultiThreading;

import static java.lang.System.currentTimeMillis;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long starttime = currentTimeMillis();
          //First Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task is complete ");
        //Second Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task is complete ");
        //Third Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task is complete ");
        long endtime = currentTimeMillis();
        System.out.printf("Total time is taken : %d ",(endtime - starttime));
    }
}