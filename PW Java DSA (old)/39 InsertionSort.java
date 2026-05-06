class InsertionSort {

//    lec 39 Insertion sort

    static void SortInsertion(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){ // Starting from index 1 bcz 0 index considered as sorted array
            int j=i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5,6,7,3,2,1};
        SortInsertion(arr);
        for(int a : arr){
            System.out.print(a+ " ");
        }
    }
}
