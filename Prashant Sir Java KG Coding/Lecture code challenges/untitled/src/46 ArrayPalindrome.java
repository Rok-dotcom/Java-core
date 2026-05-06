class ArrayPalindrome {
    public static void main(String[] args){
        System.out.println("Welcome to check Array Palindrome  \n " );
        int[] arr = ArrayUtility.inputArray();
        boolean ispalin = isPalindrome(arr);
        if(ispalin){
            System.out.println("Your Array is Palindrome ");
        }else{
            System.out.println("Your Array is not Palindrome ");
        }
        }
        public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            if(arr[i] != arr[arr.length -1 -i]){
                return false;
            }i++;
        }
        return true;
    }
}