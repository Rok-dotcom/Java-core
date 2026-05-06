class RecursionMaxArray {

    static int MaxInteger(int[] array, int idx){
        //Base case
        if(idx == array.length -1){
            return array[idx];
        }
        // smaller problem - recursive work
        int smallerprob = MaxInteger(array,idx +1);

        // self work
        return Math.max(array[idx],smallerprob);
    }

    public static void main(String[] args) {
        int[] array = {1,23,45,6,7};
        int idx = 0;
        System.out.println(MaxInteger(array,idx));
    }
}
