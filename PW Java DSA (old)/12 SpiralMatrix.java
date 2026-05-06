import java.util.Scanner;
// lecture no 22. lecture 21 is not downloaded

class SpiralMatrix {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        int r = 4;
        int c = 4;
        SpiralMat(arr,r,c);
    }
    static void SpiralMat(int[][] arr, int r, int c){
        int topRow = 0, bottomRow = r-1 , leftColumn = 0, rightColumn = c-1;

        int totalelement =0; // for total number of elements
        while(r*c > totalelement){
            //for topRow -> leftColumn to rightColumn
            for (int i = leftColumn; i <= rightColumn && r*c > totalelement; i++) {
                System.out.print(arr[topRow][i]+" ");
                totalelement++;
            }topRow++;

            //for rightColumn -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && r*c > totalelement; i++) {
                System.out.print(arr[i][rightColumn]+" ");
                totalelement++;
            }rightColumn--;

            //for bottomRow -> rightColumn to leftColumn
            for (int i = rightColumn; i >= leftColumn && r*c > totalelement; i--) {
                System.out.print(arr[bottomRow][i]+" ");
                totalelement++;
            }bottomRow--;

            //for leftColumn -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && r*c > totalelement; i--) {
                System.out.print(arr[i][leftColumn]+ " ");
                totalelement++;
            }leftColumn++;
        }
    }
}
