import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueChar {
    public static void main(String[] args){
        Set<Character> unique = new HashSet<>();
        System.out.print("Enter your String : ");
        Scanner input = new Scanner(System.in);
        String userstr = input.next();

        for (char ch : userstr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your string has %d unique characters",
                unique.size());

    }
}
