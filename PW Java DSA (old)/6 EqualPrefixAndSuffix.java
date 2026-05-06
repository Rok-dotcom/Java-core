class EqualPrefixAndSuffix {
    public static void main(String[] args) {
        int[] arr = Arrays.InputArray();
        boolean isequal = PrefixSuffix(arr);
        if(isequal){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    static int TotalSumOfArray(int[] arr){
        int totalsum = 0;
        for(int i = 0; i < arr.length; i++) {
           totalsum+= arr[i];
        }
        return totalsum;
    }
    static boolean PrefixSuffix(int[] arr){
        int totalsum = TotalSumOfArray(arr);
        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int suffix = totalsum - prefix;
            if(prefix == suffix){
                return true;
            }
        }
        return false;
    }
}
