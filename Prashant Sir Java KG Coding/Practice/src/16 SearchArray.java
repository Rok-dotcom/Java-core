import java.util.Scanner;

class SearchArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {33, 32, 28, 29, 48};
        System.out.println("Welcome to searching Array \n");
        System.out.print("Enter your number = ");
        int num = sc.nextInt();
        boolean isFound = isfound(arr, num);
        if(isFound){
            System.out.println("Your number is found in Array ");
        }else{
            System.out.println("Your number is not found in Array ");
        }

    }
    public static boolean isfound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }return false;
    }
}