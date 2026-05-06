public class RecursionIndices {

    static int[] Indices(int[] arr, int target, int idx){
        //Base Case
        if(idx >= arr.length -1){
            return arr;
        }
        if(arr[idx] == target){
            System.out.print(idx + " ");
        }
        return Indices(arr,target,idx+1);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,2,2,3,5};
        int target = 2;
        int idx = 0;
        System.out.println(Indices(arr,target,idx));
    }
}
