package ReturnObj;

public class person {
    public static void main(String[] args){

        /// object of alien class
        System.out.println("This is Alien Obj");
        Alien a1 = new Alien();
        a1.setName("alien1");
        a1.setPoints(75);
        System.out.println(a1.getName());
        System.out.println(a1.getPoints());

        ///  object of human class
        System.out.println("This is human obj1");
        Human h1 = new Human();
        h1.setName("Rohit");
        h1.setAge(23);
        System.out.println(h1.getName());
        System.out.println(h1.getAge());

        ///  object of human class
        System.out.println("This is human obj2");
        Human h2 = new Human();
        h2.setName("Sham");
        h2.setAge(25);
        System.out.println(h2.getName());
        System.out.println(h2.getAge());
    }
}
