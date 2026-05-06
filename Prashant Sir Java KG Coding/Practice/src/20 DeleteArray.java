import java.util.Scanner;

class DeleteArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Delete and check new Array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter your element from Array for Changing = ");
        int num = sc.nextInt();
        NewArray(arr,num);
    }
    public static void NewArray(int[] arr,int num){
        int i = 0;
        int nulls = 0;
        while(i < arr.length){
            if (arr[i] == num){
                System.out.print("Enter your number for changing = ");
                Scanner sc = new Scanner(System.in);
                int chngnum = sc.nextInt();
                nulls = arr[i];
                arr[i] = chngnum;
                int j = 0;
                while(j < arr.length){
                    System.out.print(" "+arr[j]);
                    j++;
                }
            }i++;
        }
    }
}
