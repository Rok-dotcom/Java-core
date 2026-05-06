package in.kgcoding.challenge82;

public class ArrayOperations {
    private int[] array;

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public static class Statistics{
        double mean(int[] array){
            int sum = 0;
            for(int num: array){
                sum += num;
            }return sum;
        }


        double median(){
            return 0;
        }
    }
}
