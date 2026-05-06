package in.rxcoding.MultiThreading;

public class FirstTask extends Thread {

    public void run() {
        //First Task
        for(int i = 1; i <=1000;i++){
            System.out.printf("%d* ", i);
    }
        System.out.printf("\n * %s task is complete : "
                ,currentThread().getClass());
   }

}
