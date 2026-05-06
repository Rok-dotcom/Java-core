package in.kgcoding.challenge80;

public class Book extends LabraryItem{
    private String ISBN;

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    public void id(){
        System.out.println("ISBN id is "+ ISBN);
    }
}
