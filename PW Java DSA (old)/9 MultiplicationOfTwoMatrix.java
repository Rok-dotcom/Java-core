import java.util.Scanner;

class MultiplicationOfTwoMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Matrix row size: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the 1st Matrix column size: ");
        int c1 = sc.nextInt();
        System.out.print("Enter the 2nd Matrix row size: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the 2nd Matrix row size: ");
        int c2 = sc.nextInt();

        int[][] arr1 = {{1,2},
                        {3,4}};
        int[][] arr2 = {{2,3},
                        {4,2}};

        Multiplication(arr1,r1,c1,arr2,r2,c2);

//        System.out.println();

    }
    static void Multiplication(int[][] arr1,int r1,int c1,int[][] arr2, int r2, int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible : Wrong dimensions ");
            return;
        }
        int[][] newarr = new int[c1][r2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < r2; k++) {
                    newarr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrix is: ");
        for(int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

