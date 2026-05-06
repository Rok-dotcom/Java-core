package in.kgcoding.challenge102;

public class Signals extends Thread{

    private final TrafficColor color;

    public Signals(TrafficColor color) {
        this.color = color;
    }

    public void run(){
        System.out.printf("%s signal started \n",color);
        try {
            Thread.sleep(color.getOnmillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s signal ended \n",color);
    }
}
