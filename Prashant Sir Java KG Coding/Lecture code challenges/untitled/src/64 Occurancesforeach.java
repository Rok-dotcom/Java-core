import java.util.Scanner;

class Occurancesforeach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the element to check occ ");
        int numcheck = sc.nextInt();


        int occ = 0;
        for(int num: arr){
            if(num == numcheck){
                occ += 1;
            }
        }
        System.out.println("Your entered number is repeated for " +occ+ "times ");
    }
}
