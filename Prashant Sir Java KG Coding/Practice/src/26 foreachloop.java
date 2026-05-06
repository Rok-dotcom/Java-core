import java.util.Scanner;

class foreach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[]  array = {"ram", "sham", "ganesh", "rohan","suraj"};

        for(String name: array){
            System.out.println(name);
        }
    }
}
