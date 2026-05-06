import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check day by your number \n");
        System.out.print("Enter your number to check the day = ");
        int day = input.nextInt();
        OldSwitch(day);
        newswitch(day);
    }
    public static void newswitch(int day){
        String daystr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 ,8 -> "Sunday";// fall through
            default -> "Invalid number ";
        };
        System.out.println(daystr);
    }

    public static void OldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: // fall through
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
