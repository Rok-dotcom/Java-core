class Practice_sort {
//    This is practice code for revision of the recursion

    static void PrintSort(int[] arr, int index){
//        System.out.println("Method is called");
        int n = arr.length -1; // 4
        if(index > n){
            return ;
        }
//        System.out.println("I'm after the if");
        PrintSort(arr,index+1);
        System.out.print(arr[index]+" ");
    }



    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int index = 0;
        PrintSort(arr,index);
    }
}
