package in.kgcoding.challenge82;

public class TestArray {
    public static void main(String[] args){
        ArrayOperations opr = new ArrayOperations(new int[] {1,2,3,4,5});
        ArrayOperations.Statistics statistics = new ArrayOperations.Statistics();
        System.out.println(statistics.mean(new int[] {1,2,3,4,5}));
    }
}
