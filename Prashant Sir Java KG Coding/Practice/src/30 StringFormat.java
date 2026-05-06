class StringFormat {
    public static void main(String[] args){
        String name = "Captain";
        int marks = 89345;
        System.out.println("Hello ,"+name+" your marks are "+marks);
        System.out.printf("Hello ,%s your marks are %d ",name ,marks);
        System.out.printf("Hello ,%S your marks are %d ",name ,marks);
        System.out.printf("Hello ,%15s your marks are %d ",name ,marks);
        System.out.printf("Hello ,%s your marks are %,15d ",name ,marks);
        System.out.printf("Hello ,%15S your marks are %-+,15d ",name ,marks);

    }
}
