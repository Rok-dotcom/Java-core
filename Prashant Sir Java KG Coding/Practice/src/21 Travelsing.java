import java.util.Scanner;

class Travelsing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row and column;");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter elements of 2d array;");
        int [][] arr=arr(r,c);
        display(arr);
    }
    static int[][] arr(int n1,int n2){
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int [n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
       return arr;
    }
    static void display(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
