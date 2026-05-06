import java.util.Scanner;
class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            r = r + c;
        }
        System.out.println(r);
    }
}