class Returntype {
    public static void main(String[] args) {
        greet();
        System.out.println(addition(4,3 ));

    }
    public static int addition(int first, int second){
        System.out.println("first Number received: " + first);
        System.out.println("Second Number received: " + second);
        int add = first + second;
        return add;
    }
    public static void greet(){
        System.out.println("Welcome to Calculator ");
    }


}
