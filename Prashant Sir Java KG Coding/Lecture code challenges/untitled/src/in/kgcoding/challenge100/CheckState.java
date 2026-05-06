package in.kgcoding.challenge100;

public class CheckState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();

        System.out.printf("\n Create the Thread %s ",t1.getState());

        t1.start();
        t1.join();

        System.out.printf("\n Finished Thread %s ", t1.getState());

    }
}
