import java.util.Scanner;

class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Delete and check new Array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter your number for deleting element of Array = ");
        int numToDelete = sc.nextInt();
        int[] newarray = YourArray(arr, numToDelete);
        System.out.println("Here is your new Array ");
        ArrayUtility.displayArray(newarray);
    }
    //This is KGC approach
    public static int[] YourArray(int[] arr,int numToDelete){
        int occ = OccurrencesArray.NoOfOccurrences(arr,numToDelete);
        if(occ == 0 ){
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newarray = new int[newSize];

        int i = 0; int j = 0;
        while(i < arr.length){
            if(arr[i] != numToDelete){
                newarray[j] = arr[i];
                j++;
            }
            i++;
        }return newarray;
    }
}

//This is my approach
    //NewArray(arr,num);
//    public static void NewArray(int[] arr,int num){
//        int i = 0;
//        int nulls = 0;
//        while(i < arr.length){
//            if (arr[i] == num){
//                nulls = arr[i];
//                arr[i] = num;
//                int j = 0;
//                while(j < arr.length){
//                    System.out.println("New Array is : " +arr[j]);
//                    j++;
//                }
//            }i++;
//        }
//    }

