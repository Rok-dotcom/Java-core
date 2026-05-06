import java.util.Scanner;
// 9 dec 2025
// This code is for finding the max number from the given array
// I tried with for loop and not used MIN_VALUE library from java
// I should use the for each loop and MIN_VALUE library from java
// It was completed in code number 63 MaxNumberforeach;

public class MaxFromArray {
    public static void main(String[] args){
        System.out.println("Welcome to check max no. from the given array");
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        int FoundNum = maxNum(arr);
        System.out.print("Max no. from the array is: "+FoundNum);


    }
    public static int maxNum(int[] arr){
        int maxN = 0;
        for(int i=0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    maxN = arr[j];
                }
            }

        }return maxN;
    }
}
