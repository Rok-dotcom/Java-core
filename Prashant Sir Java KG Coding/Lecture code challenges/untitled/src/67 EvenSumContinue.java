import java.util.Scanner;

class EvenSumContinue {
    public static void main(String[] args){
        System.out.println("Welcome to the sum of Even num only ");
        int[] arr = inputArray();
        even(arr);
    }

    public static void even(int[] arr){
        int sum = 0;
        for(int even : arr){
            if(even %2 == 1){
                continue;
            }
            System.out.println(even);
        }
    }

    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int size = sc.nextInt();

        int i;
        int[] arr = new int[size];
        for(i=0; i<size; i++){
            System.out.print("Enter the "+(i+1)+ " value : ");
            int num = sc.nextInt();
            arr[i] = num;
        }
        return arr;
    }
}
