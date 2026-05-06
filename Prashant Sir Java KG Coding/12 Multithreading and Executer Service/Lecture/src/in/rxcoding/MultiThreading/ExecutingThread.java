package in.rxcoding.MultiThreading;

import static java.lang.System.currentTimeMillis;

public class ExecutingThread {
    public static void main(String[] args) {
        long starttime = currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        t1.start();
        System.out.println("\n First Threading started ");
        t2.start();
        System.out.println("\n Second Threading started ");
        t3.start();
        System.out.println("\n Third Threading started ");

        long endtime = currentTimeMillis();
        System.out.printf("Total time is taken : %d ",(endtime - starttime));
    }
}