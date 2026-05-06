import java.util.Scanner;

class HCF {

    static int LeastCommonFactor(int n1, int n2){
        int lcm = Math.max(n1,n2);
        while(true){
            if(lcm % n1 == 0 && lcm % n2 == 0){
                return lcm;
            }
            lcm++;
        }
    }

    static int smallestNo(int a ,int b){
        if(a > b){
            return a;
        }else
            return b;
    }

    static int PrintHCF(int n1, int n2){
        if(n1 == 0|| n2 == 0){
            System.out.println("Please enter valid input: ");
            return 0;
        }
        int n = smallestNo(n1,n2);
        for(int i = n; i >= 1; i--) {
            if(n1 % i == 0 && n2 % i == 0){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
//        System.out.println(PrintHCF(n1,n2));
        System.out.println(LeastCommonFactor(n1,n2));
    }
}
