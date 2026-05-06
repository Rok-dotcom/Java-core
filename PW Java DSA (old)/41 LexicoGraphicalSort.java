class LexicoGraphicalSort {
//    lec 40
//    sort in lexicographical order
//    By using selection sort

    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }

            }
                String temp = fruits[i];
                fruits[i] = fruits[min_index];
                fruits[min_index] = temp;

        }
    }

    public static void main(String[] args){
        String[] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
        sortFruits(fruits);
        for(String val : fruits){
            System.out.print(val+ " ");
        }
    }
}
