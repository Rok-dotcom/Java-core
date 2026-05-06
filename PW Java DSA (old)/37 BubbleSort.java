import java.util.Arrays;

class BubbleSort {

//    lecture no 37
//    Bubble sort

    static void bubbleSort(int[] arr){
        int n = arr.length -1;
        int temp ;

        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j=0; j < n-i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
