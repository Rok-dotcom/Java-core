public class Details {
/*
Thread Priority : When an important task need to execute first when multiple
                threads are there.
                It has Priority like MIN , NORM , MAX
                methods:
                        MAX_PRIORITY = 10;
                        NORM_PRIORITY =  5;
                        MIN_PRIORITY =  1;
                                              or (1)or(5)or(10)
                        t1.Thread.setPriority(Thread.MIN_PRIORITY);
                        t2.Thread.setPriority(Thread.NORM_PRIORITY);
                        t3.Thread.setPriority(Thread.MAX_PRIORITY);

Thread Join method: when you want to start a thread only if one specific thread is
            need to complete.
            If your 1st thread is completed then only start next thread.
            You have to add throw exception into main like throws InterruptedException

            method:

            throws InterruptedException
            1) t1.join();
            until thread t1 is not completed, no next line of main thread will
            execute.
            2) t1.join(long millis)
            waits for specific time limit then it start execute next.

 */
}
