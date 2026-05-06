import java.util.Scanner;

class Rangequiry {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.InputArray();
        int[] pref = SumPrifixArray(arr);

        System.out.print("Enter the quires");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.print("Enter the range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];
            System.out.print("Sum : "+ans);
        }

    }
    static int[] SumPrifixArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
