class VarAgrs {
    public static void main(String[] args){
        System.out.println(concatenate("Ramesh","Koli","Mechanical"));
        System.out.println(concatenate("Good","Morning"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
