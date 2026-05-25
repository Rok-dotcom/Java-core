public class slidingWindow {
    public static void main(String[] args){
        int[] arr = {3,7,4,3,4,5,6};
        int k=7;
        int curr_len = 0;
        int j=0;
        int sum=0;
        int st = 0;
        int max_len = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            while(j<=i && sum>=k){
                sum -= arr[j++];
            }
            curr_len = Math.max(curr_len,i-j+1);
            if(curr_len>max_len){
                max_len = curr_len;
                st = j;
            }
        }
        for(int i=st; i<max_len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(max_len);
    }
}
