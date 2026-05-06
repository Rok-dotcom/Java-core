class Array2 {
    public static void main(String[] args){
//        int[] mymarks = new int[5];
//        mymarks[0] = 78;
//        mymarks[1] = 80;
//        mymarks[2] = 90;
//        mymarks[3] = 85;
//        mymarks[4] = 96;
        int[] mymarks = {78, 80, 90, 85, 96};
//        int index = 4;

//        System.out.println(mymarks[0]);
//        System.out.println(mymarks[1]);
//        System.out.println(mymarks[2]);
//        System.out.println(mymarks[3]);
//        System.out.println(mymarks[4]);

        //Array Traversal
        int index = 0;
        while(index < mymarks.length ){
            System.out.println(mymarks[index]);
            index++;
        }
    }
}
