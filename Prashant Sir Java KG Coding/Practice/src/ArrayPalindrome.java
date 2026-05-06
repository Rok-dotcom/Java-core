public class ArrayPalindrome {
    public static void main(String[] args){
        int[] arr = ArrayUtility.inputArray();
        if(IsPalindrome(arr)){
            System.out.println("Array is Palidrome ");
        }else{
            System.out.println("Not a Palindrome ");
        }

    }
    static boolean IsPalindrome(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[(arr.length-1)-i]){
                return false;
            }
        }return true;
    }
}
