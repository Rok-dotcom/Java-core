package in.kgcoding.challenge80;

public class Magazine extends LabraryItem{
    private int issuenumber;

    public Magazine(int issuenumber) {
        this.issuenumber = issuenumber;
    }

    public void issuenumber(){
        System.out.println("issue number is ");
    }
}