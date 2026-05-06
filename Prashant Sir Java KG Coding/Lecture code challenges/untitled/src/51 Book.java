class Book {
    // Object-oriented programming started

    static int totalnoOfBooks;

    //instance variable
    String title;
    String author;
    String isbn;

    // static variable
    static boolean isborrowed;

    static{
        totalnoOfBooks = 0;
    }
    { // instance block . It calls before the constructor .
        totalnoOfBooks++;
    }
       // constructor
    Book(String isbn, String author, String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
    // constructor chaining
    Book(String isbn){
        this(isbn , "Unknown", "Unknown");
    }

    static int gettotalnoOfBooks(){
        return totalnoOfBooks++;
    }

    void borrowedBook(){
        if(isborrowed){
            System.out.println("This book is already borrowed");
        }else{
            this.isborrowed = true;
            System.out.println("Enjoy your book "+this.title);
        }
    }
    void returnbook(){
        if(isborrowed){
            this.isborrowed = false;
            System.out.println("Hope you enjoyed the book , please leave the review");
        }else {
            System.out.println("This book is already in library ");
        }
    }
    public static void main(String[] args){
        Book designOfThings = new Book("1", "author", "Design");
        Book mybook = new Book("2", "Captain", "mybook");
        System.out.println(Book.gettotalnoOfBooks());
        mybook.borrowedBook();
        designOfThings.borrowedBook();
        designOfThings.borrowedBook();
        designOfThings.returnbook();
        designOfThings.returnbook();
    }
}









