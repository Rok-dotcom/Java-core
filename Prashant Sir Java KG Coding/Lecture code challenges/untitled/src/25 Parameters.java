class Parameters {
    public static void main(String[] args){
        System.out.println(sumTwoNumbers(4, 7));   // Argument = giving number to the method that time input it known as argument
        System.out.println(sumTwoNumbers(5, 8));
        System.out.println(sumTwoNumbers(6, 9));
    }
    public static int sumTwoNumbers(int first, int second){ //giving the values as a first and second
        System.out.println("First Number received = " + first);
        System.out.println("Second Number received = " + second);
        int sum = first + second;
        return sum;                  //returning the value to the method then it will return to the main function
    }
}
