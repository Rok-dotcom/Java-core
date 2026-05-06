class MultiplicationTables {
    public static void main(String[] args) {
        // Loop through tables from 1 to 10
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.println(+i+ " * " +j+ " = " +(i * j));
                j++;
            }
            i++;
        }
    }
}
