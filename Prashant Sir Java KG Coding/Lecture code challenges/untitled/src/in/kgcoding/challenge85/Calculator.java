package in.kgcoding.challenge85;

public class Calculator {

    public int add(int a, int b){
        System.out.println("Sum of the two integer is = "+(a+b));
        return a + b;
    }

    public int add(int a, int b,int c){
        System.out.println("Sum of the three integer is = "+(a+b+c));
        return a + b + c;
    }
    public String add(String a, String b){
        System.out.println("String addition is = "+(a+b));
        return a + b;
    }
}
