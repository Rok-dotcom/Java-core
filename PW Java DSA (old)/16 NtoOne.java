import java.util.Scanner;

class NtoOne {

    static void PrintDecreasing(int n){// 5 4 3 2 1
        // Base Case
        if(n == 1){
            System.out.println(n);
            return;
        }
        // Self work
        System.out.println(n);
        // Recursive work
        PrintDecreasing(n-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PrintDecreasing(n);
    }
}
