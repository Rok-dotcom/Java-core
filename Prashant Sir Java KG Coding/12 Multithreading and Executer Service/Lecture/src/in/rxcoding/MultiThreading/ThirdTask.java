package in.rxcoding.MultiThreading;

public class ThirdTask extends Thread{

    public void run(){
        //Third Task
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d# ",i);
        }
        System.out.printf("\n # %s task is complete : "
                ,currentThread().getClass());
    }
}
