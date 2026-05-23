public class TestingSleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("sleeping thread");
        Thread.sleep(5000);
        System.out.println("woke up and done");
    }
}
