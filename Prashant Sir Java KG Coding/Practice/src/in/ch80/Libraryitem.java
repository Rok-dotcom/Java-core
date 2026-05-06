package in.ch80;

public class Libraryitem {
    private int itemId;
    private String title;
    private String author;

    public Libraryitem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void checkout(int itemId){
        if (this.itemId != itemId){
            System.out.println("Book is not available");
        }else{
            System.out.println("Book is available , enjoy it ");
            this.itemId = 0;
        }
    }

    public void returnitem(int itemId){
        if(this.itemId == itemId){
            System.out.println("This item is already available");
        }else{
            System.out.println("Thank you for returning , hope you enjoyed it ");
            this.itemId = itemId;
        }
    }


//    public static void main(String[] args){
//        Libraryitem cd = new Libraryitem(001, "Meditation", "Osho");
//        cd.returnitem(002);
//        cd.checkout(002);
//        cd.returnitem(002);
//        cd.returnitem(001);
//    }
}
