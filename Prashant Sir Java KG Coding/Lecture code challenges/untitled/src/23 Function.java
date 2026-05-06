class Function {
    public static void main(String[] args){

     printFirstPattern();   //calling the method
     printSecondPattern();
     printThirdPattern();

    }
    public static void printFirstPattern(){ //returns nothing to the main  function
        int rows = 0;                   //initialization loop
        while(rows < 5){                //condition
            System.out.print("*");      //actual work
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }System.out.println();
            rows++;                     // updated the condition
        }
    }
    public static void printSecondPattern(){
        System.out.println("* * * * * ");
        System.out.println("* * * * ");
        System.out.println("* * *");
        System.out.println("* * ");
        System.out.println("* ");
    }
    public static void printThirdPattern(){
        System.out.println("        * ");
        System.out.println("      * * ");
        System.out.println("    * * * ");
        System.out.println("  * * * * ");
        System.out.println("* * * * * ");
    }
}
