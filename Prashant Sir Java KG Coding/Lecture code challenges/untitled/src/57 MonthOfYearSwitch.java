import java.util.Scanner;

class MonthOfYearSwitch {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check month of the year ");
        System.out.print("Enter your Month = ");
        int month = input.nextInt();
        String monthname = Monthname(month);
        System.out.println("Your month is " + monthname);
    }
    public static String Monthname(int month){
        return switch(month){
            case 1 -> "January";
            case 2 -> "Feb";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Are you from Mars? ";
        };
    }
}
