import java.util.Scanner;
// Remains to write a program in notes // completed
class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            greet();                               //calling to function or method
            System.out.print("Enter the number which you want the table = ");
            int num = sc.nextInt();
            MulTable(num);                         //calling the function

    }
        public static void MulTable(int num) {     //using void because no value will return to the main function
            int i = 1;
            while (i <= 10) {
                System.out.println(i+ " X " + num + " = " +(i* num));
                i++;
            }
        }
                public static void greet() {
                System.out.println("Welcome to Table Calculator ");
            }
        }