class SumInteger {

    static int Sum(int n){
        // base case
        if(n >= 0 && n <= 9) return n;
        // recursive work
        return Sum(n/10) + n % 10;
    }

    public static void main(String[] args){
        System.out.println(Sum(12345));
    }
}
