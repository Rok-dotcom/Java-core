public class SecondTask extends Thread{
    public void run(){
        // Second task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n %s $ task completed",
                            Thread.currentThread().getName());

    }
}
