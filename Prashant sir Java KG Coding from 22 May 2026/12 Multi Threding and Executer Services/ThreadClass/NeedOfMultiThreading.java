public class NeedOfMultiThreading {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        // first task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task completed");

        // Second task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task completed");

        // Third task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task completed");
        long endTime = System.currentTimeMillis();

        System.out.printf("Time Taken to print : %d ",(endTime-startTime));
    }
}
