class PrefixSumArray {
    public static void main(String[] args){
        int[] arr = Arrays.InputArray();
        Arrays.DisplayArray(arr);
        SumPrifixArray(arr);

    }
    static void SumPrifixArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        System.out.println("sum of prefix sum is : ");
        Arrays.DisplayArray(ans);
    }
}
