package in.kgcoding.Collection.Varargs;

public class VarArgs {
    public static void main(String... args){
        System.out.println(Sum(2,3,5));
        System.out.println(Sum(1,2,3,5));

    }
    public static int Sum(int a, int b, int... c){
        int sum = a+b;
        for(int i : c) {
            sum += i;
        }
        return sum;
        }
    }

