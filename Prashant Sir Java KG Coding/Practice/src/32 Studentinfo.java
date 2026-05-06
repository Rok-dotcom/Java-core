class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        Student st1 = new Student("Rahul ", 21);
        System.out.println(st1.toString());
    }
}
