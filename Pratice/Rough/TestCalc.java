public class TestCalc {
    public static void main(String[] args){
        Calc c = new Calc();
        int Result = c.divide(10,5);
        if(Result == 2){
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }
    }
}
