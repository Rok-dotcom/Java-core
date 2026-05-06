package in.kgcoding.challenge102;

public class TestSignal {
    public static void main(String[] args) throws InterruptedException {

        Signals t1 = new Signals(TrafficColor.RED);
        Signals t2 = new Signals(TrafficColor.YELLOW);
        Signals t3 = new Signals(TrafficColor.GREEN);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
