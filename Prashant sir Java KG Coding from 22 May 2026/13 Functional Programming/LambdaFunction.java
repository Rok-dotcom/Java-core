// 25 may 2026

public class LambdaFunction {
    public static void main(String[] args){
        LambdaFunction test = new LambdaFunction();
        int sum = test.sum(1,3);
        System.out.println(sum);
    }

//    (a,b) -> a+b; lambda function

    public static int sum(int a,int b){
        return a+b;
    }
}
