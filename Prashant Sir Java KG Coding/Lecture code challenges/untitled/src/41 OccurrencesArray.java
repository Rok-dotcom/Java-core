import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find no of Occurrences ");
        int[] arr= ArrayUtility.inputArray();
        System.out.print("Enter your number to check No. of Occurrences = ");
        int num = input.nextInt();
        int occurrences = NoOfOccurrences(arr,num);
        System.out.println("Number of occurrences of "+ num + " is = " +occurrences);
    }
    public static int NoOfOccurrences(int[] arr,int num ){
        int occ = 0 ;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                occ ++;
            }i++;
        }return occ;
    }
}