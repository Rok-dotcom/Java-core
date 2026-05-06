class RecursiveArray {

    static void PrintArray(int[] array,int idx){
        // Base work
        if(idx == array.length){
            return;
        }
        // self work
        System.out.print(array[idx]+" ");

        // recursive work - sub problem
        PrintArray(array,idx+1);
    }

    public static void main(String[] args) {
        int[] array = {5,6,7,8};
        int idx = 0;
        PrintArray(array,idx);
    }
}
