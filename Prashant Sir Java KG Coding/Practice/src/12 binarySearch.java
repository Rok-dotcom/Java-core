import java.util.Scanner;
class binarySearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        System.out.print("Enter elements of array=");
        int []arr=arr(n);
        System.out.print("search=");
        int k=sc.nextInt();
        String ans=search(arr,k)?"found":"not found";
        System.out.println(ans);
    }
    static int[]arr(int n){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static boolean search(int []arr,int k){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(k<arr[mid]){
                end=mid-1;
            }else if(k>arr[mid]){
                st=mid+1;
            }
        }
        return false;
    }
}
