import java.util.Scanner;
// Problem taken from chatgpt
class PowerFunction {

   static int PowerMesure(int a, int b){
       if(a == 0 || b == 0){
           return 1;
       }else
           return a * PowerMesure(a,b-1);
   }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(PowerMesure(a,b));
    }
}
