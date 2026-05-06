import java.util.Scanner;

class LeapYear {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Know the leap year");
        System.out.println("Enter the year you want to know leap or not = ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year %100 !=0))
        {
            System.out.print("Your entered year is leap year ");
        }else
        {
            System.out.println("Your entered year is not a leap year ");
        }
    }
}
