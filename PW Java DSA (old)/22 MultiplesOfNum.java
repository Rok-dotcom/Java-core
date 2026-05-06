class MultiplesOfNum {

    static void PrintMultiple(int num, int k){
        if(k == 1){
            System.out.println(num);
            return;
        }
        PrintMultiple(num,k-1);
        System.out.println(num * k);
    }

    public static void main(String[] args) {
        PrintMultiple(12,5);
    }
}