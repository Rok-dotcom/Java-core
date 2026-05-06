import java.util.Scanner;

class RecursionMultiples {

    static void multiples(int num,int k){
        if(num == 0 || k == 0){
            return ;
        }
        multiples(num,k-1);
        System.out.println(num * k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();
        multiples(num,k);
    }
}
