class ReverseArray {
    public static void main(String[] args){
        System.out.println("Welcome to Reverse Array ");
        int[] array = ArrayUtility.inputArray();
        reversearr(array);
        System.out.println("Your reversed Array is = ");
        ArrayUtility.displayArray(array);

    }
    public static void reversearr(int[] array){
        int i = 0;
        while(i < array.length/2 ){
            int swap = array[i];
            array[i] = array[( array.length - 1 ) -i];
            array[( array.length - 1 ) -i] = swap;
            i++;
        }
    }
}
