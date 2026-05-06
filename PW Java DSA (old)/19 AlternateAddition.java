class AlternateAddition {

    static int addition(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                sum -= i;
            }else
                sum += i;
        }return sum;
    }
    public static void main(String[] args) {
        System.out.println(" Addition is");
        System.out.println(addition(5  ));
    }
}
