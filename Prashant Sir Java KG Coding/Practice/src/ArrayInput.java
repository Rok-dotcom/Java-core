import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array elements are ...");
        for(int j=0; j<size; j++){
            System.out.println("Your element "+(j+1)+" is : "+arr[j]);
        }

    }
}
