public class IntegerKaGame {
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        System.out.println(a/b);
        int[] arr = {1,4,7};
        int target =4;

        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st+((end-st)/2);
            if(arr[mid] == target){

            }else if(arr[mid] < target){
                st = mid+1;
            }else if(arr[mid]> target){
                end = mid-1;
            }
        }

    }
}
