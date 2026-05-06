class MaxNumforech {
    public static void main(String[] args){
        System.out.println("Welcome to check Max number from int Array \n ");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
            for(int num: arr){
                if(max < num){
                    max = num;
                }
            }
        System.out.println("largest number is "+ max);
    }
}