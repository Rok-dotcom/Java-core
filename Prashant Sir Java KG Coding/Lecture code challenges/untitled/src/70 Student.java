class Student {
    String name;
    int age;
    int rollno;
    String branch;

    public Student(String name, int age, int rollno, String branch) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name "+ name+
                "age "+ age+
                "rollno "+rollno+
                "branch "+branch;
    }
    public static void main(String[] args){
        Student stu = new Student("Rohan ", 21, 30,"mechanical");
        System.out.println(stu);
    }
}
