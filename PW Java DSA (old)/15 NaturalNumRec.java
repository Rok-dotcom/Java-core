import java.util.Scanner;

//Started recursion from here
//Print the numbers up to n

class NaturalNumRec {

    static void PrintIncreasing(int n){ //1 2 3 4 5
        // Base Case
        if(n == 1){
            System.out.println(1);
            return;
        }

        // Recursive Case
        PrintIncreasing(n-1);

        // Self work
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncreasing(n);
    }
}
