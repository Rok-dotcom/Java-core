class QuickSort {
//    lec 42 Quick sort using pivot

    static void sort(int[] arr, int start, int end,int pivot){
        int n1 = pivot-1 -start;
        int n2 = end - pivot+1;

        int[] left = new int[n1];
        int[] right = new int[n2];


        int temp;
        for (int i = 0; i < n1; i++) {
            if(left[i] > pivot){
                temp = left[i];
            }
        }
        for (int j = n2; j < end; j++) {
            if(left[j] > pivot){
                temp = right[j];
            }
        }
    }


    static void quickSort(int[] arr,int start,int end){
        int pivot = arr.length/2;

        quickSort(arr,start, pivot-1);
        quickSort(arr,pivot+1,end);
        sort(arr,start,end,pivot);
    }


    public static void main(String[] args){
        int[] arr = {8,3,1,7,0,10,2};


    }
}
