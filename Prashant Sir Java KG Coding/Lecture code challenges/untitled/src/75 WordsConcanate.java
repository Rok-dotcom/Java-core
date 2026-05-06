class WordsConcanate {
    public static void main(String[] args){
        String[] arr = new String[]{"Thank"," you","for ","this ","free ","course ","KG ","Coding "};

        StringBuilder sb = new StringBuilder();
        for(String d: arr){
            sb.append(d).append(" ");
        }System.out.print(sb);
    }
}
