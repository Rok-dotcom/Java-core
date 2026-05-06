//lecture no 20
// Reverse the Given 2DArray

class Reverse2DArray {

    public static void main(String[] args) {
        int[][] arr ={{1,2,3,10},
                      {4,5,6,11},
                      {7,8,9,12}};
        System.out.println("Array is : ");
        PrintArray(arr);
        ReverseArray(arr);
        System.out.println("Reversed Array is : ");
        PrintArray(arr);
    }
    static void PrintArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void ReverseArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {  // This is for Rows
            for (int j = 0; j < arr[i].length/2; j++) {  // This is for each Column of the row /2
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length -1 -j]; // 1st row th last element and decreasing from the last
                arr[i][arr[i].length -1 -j] = temp;
            }
        }
    }
}
