import java.util.Scanner;

class RecursionGCD {

    //LCM with the help of GCD
    static int LCM(int x,int y){
        return (x % y)/(GCD(x,y));
    }

    //GCD by Euclid's algorithm
    static int GCD(int x, int y){
        if(y == 0) return x;
        return GCD(y,x%y);
    }

    // This is new approach which has not teaches us at childhood
    static int gcd(int x,int y){
        while(x%y != 0){
            int rem = x % y ;
            x = y;
            y = rem;
        }
        return y;
    }

    // This is my old approach
    static void iGCD(int n1, int n2){
        int gcd = Math.min(n1,n2);
        if(gcd % n1 == 0 && gcd % n2 == 0){
            System.out.println(gcd);
            return;
        }
        gcd--;
        iGCD(n1,n2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
//        iGCD(n1,n2);
        System.out.println(LCM(n1,n2));
        System.out.println(GCD(n1,n2));
    }
}
