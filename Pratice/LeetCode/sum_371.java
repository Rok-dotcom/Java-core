import java.util.ArrayList;

public class sum_371 {
    public static void main(String[] args){
        int a =15;
        int b =3;

        ArrayList<Integer> arr = new ArrayList<>();

        int mul=a*b;
        /*
        while(mul>0){
            mul/=a;
            arr.add(a);
        }
        System.out.println("mul: "+mul+" arr size: "+arr.size());

         */
//        mul=a*b;
        System.out.println("mul: "+mul+" arr size: "+arr.size());
        System.out.println();
        while(mul>0){
            System.out.print(" b:"+b+" mul: "+mul+" | ");

            mul /= b;
            arr.add(b);
        }
        System.out.println();
        System.out.println("mul: "+mul+" arr size: "+arr.size());
        System.out.println( arr.size());









//        System.out.println(45/15);
/*
        int num = 45;
        int num2 = 15;
        int i=0;
        while(num>=i){
            int cal = num/num2;
            System.out.print(i+" "+" cal: "+cal);
            i++;
        }
        System.out.println();
        System.out.println(num);

 */
    }
}
