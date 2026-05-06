package in.kgcoding.challenge80;

public class DVD extends LabraryItem{
    private int durationinsec;

    public DVD(int durationinsec){
        this.durationinsec = durationinsec;
    }
    public void duration(){
        System.out.println("Duration is "+ durationinsec);
    }
}
