import java.util.Scanner;

class NoOccurArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = {1, 1, 3, 4, 5, 4, 5, 6, 6};
//        System.out.print("Enter your number ");
//        int num = input.nextInt();
//
//        int i = 0;
//        int sum = 0;
//        while (i < arr.length) {
//            if (arr[i] == num) {
//                sum += 1;
//            }
//            i++;
 //       }
     //   System.out.println("your occurance is " + sum);



    String s = input.nextLine();
    String r = "";
        for(int i = 0; i<s.length();i++) {
        char c = s.charAt(i);
        r = c + r;
    }
        System.out.println(r);
    }

}
