class breakandcontinue {
    public static void main(String[] args){

        for(int i = 1; i <= 500; i++){
            if(i == 200){
                break;
            }
            System.out.print(i+ " ");
        }


        for(int j = 1; j <= 10; j++){
            if(j == 2){
                continue;
            }
            System.out.println(j+ " ");
        }
    }


}
