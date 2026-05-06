import java.util.Scanner;

class SpiralUpToN {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        PrintSpiral(arr,n);
    }


    static void PrintSpiral(int[][] arr,int n){
        int r = n, c = n;
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalelement = 1;
        while(n*n>=totalelement) {

            //for top tow -> leftCol to rightCol
            for (int i = leftCol; i <= rightCol; i++) {
                arr[topRow][i] = totalelement++;
            }topRow++;

            //for rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {
                arr[i][rightCol] = totalelement++;
            }rightCol--;
            //for bottomRow -> rightCol to leftCol
            for (int i = rightCol; i >= leftCol; i--) {
                arr[bottomRow][i] = totalelement++;
            }bottomRow--;

            //for leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
                arr[i][leftCol] = totalelement++;
            }leftCol++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
    }
}
