import java.util.Arrays;

class SqOfNegativeArray {
    public static void main(String[] args){
        int[] array = {-10,-3,-2,1,4,5};
        System.out.println(Arrays.toString(array));
        int[] sqarray = SquareOfArray(array);
        System.out.println(Arrays.toString(sqarray));


    }
    static int[] SquareOfArray(int[] array){
        int n = array.length ;
        int[] ans = new int[n];
        int left = 0, right = n -1 ,k = 0;
        while(left <= right){
            if(Math.abs(array[left]) > Math.abs(array[right])){
                ans[k++] = Math.abs(array[left])*2;
                left++;
            }else{
                ans[k++] = Math.abs(array[right])*2;
                right--;
            }
        }
        return ans;
    }
}
