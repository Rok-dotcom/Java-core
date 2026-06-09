public class StringBuilderBhai {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("abcd");
        System.out.println(sb.toString());
        sb.insert(2,"x");
        System.out.println(sb.toString());
        sb.insert(2,"y");
        System.out.println(sb.toString());
    }
}
