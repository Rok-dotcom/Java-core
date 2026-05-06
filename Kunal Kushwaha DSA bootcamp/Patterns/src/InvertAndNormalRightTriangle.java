public class InvertAndNormalRightTriangle{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n*2; i++){
            int k = i;
            if( k > n){
                k = (n*2)-k;
            }
            for(int j=0; j<k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
