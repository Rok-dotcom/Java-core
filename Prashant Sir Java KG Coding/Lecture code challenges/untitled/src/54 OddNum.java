import java.util.Scanner;

class OddNumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check Even Odd ");
        System.out.print("Enter your number to check even or odd = ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is " + result);
    }
}
//        OddNumTernary ref = new OddNumTernary();
//        boolean isevenodd = ref.isevenodd(num);
//        if (isevenodd){
//            System.out.println("Your number is Even ");
//        }else {
//            System.out.println("Your number is Odd ");
//        }
//    }
//    public boolean isevenodd(int num){
//        return num % 2 == 0 ? true : false;
//    }
//}
