package ReturnObj;

public class Human {
    // variables
    // using private refer to encapsulation
    private String name;
    private int age;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // final keyword
    private final String status="Jinda hu re";

    // constructor
    public Human(){
        System.out.println("constructor is called");
    }

    // static method execute only once while initialization of class
    static{
        System.out.println("Hey am static ");
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getStatus(){
        return status;
    }

    // methods
    public void eat(){
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleeping");
    }

    public void wakeUp(){
        System.out.println("woke up");
    }
}
