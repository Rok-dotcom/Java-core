package in.kgcoding.challenge80;

public class LabraryItem {
    private String ItemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("Checking out the item");
    }

    public void returnItem(){
        System.out.println("Returned ");
    }
}