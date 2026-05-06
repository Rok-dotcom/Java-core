package in.kgcoding.challenge81;

public class comparisonArea {
    public static void main(String[] args){
        Person p1 = new Person("Rajesh", 21);
        Person p2 = new Person("Rajesh", 21);
//        Person p2 = new Person("Rahul", 22);

        if(p1.equals(p2)){
            System.out.println("equals");
        }else{
            System.out.println("not equal");
        }
    }
}