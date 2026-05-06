package in.kgcoding.challenge99;

public class HelloThread extends Thread {

    private final int ThreadNum;

    public HelloThread(int threadNum){
        this.ThreadNum = threadNum ;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) Hello from Thread %d \n ",
                    i,ThreadNum);
        }
    }
}
