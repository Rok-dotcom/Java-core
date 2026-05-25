public class ExtendingThreadClass {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("First Task started ");
        t1.start();
        System.out.println("First Task completed");
        System.out.println("Second Task started");
        t2.start();
        System.out.println("Second Task completed");
        System.out.println("Third Task started");
        t3.start();
        System.out.println("Third Task completed");

        long endTime = System.currentTimeMillis();

        System.out.printf("Time Taken to print : %d %s",(endTime-startTime),
                            Thread.currentThread().getName());
    }
}
