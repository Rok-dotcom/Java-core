import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the 2D search array ");
        int[][] array = ArrayUtility.input2DArray();
        System.out.print("Enter number you want to check in 2D Array = ");
        int num = sc.nextInt();
        boolean found = SearchArr(array,num);
        if(found){
            System.out.println("Your number is found in 2D Array ");
        }else{
            System.out.println("Your number is not found in 2D Array ");
        }

    }
    public static boolean SearchArr(int[][] array, int num){
        int i = 0;
        while(i < array.length){
            int j = 0;
            while(j < array.length){
                if(num == array[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }return false;
    }
}
