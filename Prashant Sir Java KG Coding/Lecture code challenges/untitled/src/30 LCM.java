import java.util.Scanner;//revision 1
// note down this program in the notes //completed
class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check LCM ");
        System.out.println("Enter the First number = ");
        int first = sc.nextInt();
        System.out.println("Enter the Second number = ");
        int second = sc.nextInt();
        int factor = LCM(first,second);
        System.out.println("LCM of the given numbers is " +factor);

    }
    public static int LCM(int first, int second){
        int i = 1;                         // initialisation
        while (i <= second){               // condition
            int factor = first * i;        // storing the value
            if (factor % second == 0){     // checking it by dividing the factor everytime by the second number
                return factor;             // returning the value from the if statement
            }i++;                          // update the condition
        }return 0;                         // one more return because it doesn't know the loop is not infinite
    }
}
