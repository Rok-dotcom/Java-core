public class EvenOddBinary {
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 3;

        System.out.print("Even numbers are: ");
        for(int i=1; i<=100; i++){        // if n & 1 == 0; -> even
            if((i & 1) == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\nodd numbers are: ");
        for(int i=1; i<=100; i++){        // if n & 1 == 1; -> odd
            if((i & 1) == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(3&1);
        System.out.println(3|2);

        /*
        i wrote a logic in java for checking is num is odd or even like 2 & 1 == 0 return even else odd

        but i want  to know that 2's binary form is 10 and when we use & operator with this binary it should give 10 .

        my old logic was 2&1 != 2|0 return even else odd explain me this
         */
    }
}
