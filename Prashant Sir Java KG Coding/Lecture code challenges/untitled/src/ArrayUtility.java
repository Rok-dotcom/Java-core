import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Array element = ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter your no " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
            i++;
        }return nums;

    }
        public static int[][] input2DArray(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the row  = ");
            int rows = sc.nextInt();
            System.out.print("Please enter the column = ");
            int column = sc.nextInt();
            int[][] numArray = new int[rows][column];
            int i = 0;
            while (i < rows) {
                int j = 0;
                while(j < column){
                    System.out.print("Enter " + (i + 1) + "," +(j+1)+ " element : " );
                    numArray[i][j] = sc.nextInt();
                    j++;
                }
                i++;
            }
            return numArray;
    }
    public static void displayArray(int[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}