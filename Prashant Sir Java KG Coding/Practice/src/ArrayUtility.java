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
        }
        return nums;
    }
}