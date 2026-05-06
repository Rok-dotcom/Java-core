import java.util.Scanner;

class Arrays {
    public static void main(String[] args){
        int[] array = InputArray();
        DisplayArray(array);
    }
    static int[] InputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the integers : ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        return array;
    }
    static void DisplayArray(int[] array){
        System.out.println("Array is : ");
        for(int num : array){
            System.out.print(num+" ");
        }
    }

}
