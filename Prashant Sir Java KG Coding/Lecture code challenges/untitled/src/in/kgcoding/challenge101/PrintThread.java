package in.kgcoding.challenge101;

public class PrintThread extends Thread {
    private final int ThreadNum;

    public PrintThread(int threadNum) {
        ThreadNum = threadNum;
    }

    public void run() {
        System.out.printf("%s Thread started - %d \n", Thread.currentThread().getName()
                , ThreadNum);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        System.out.printf("%s Thread ended - %d \n", Thread.currentThread().getName()
                , ThreadNum);

    }
}
