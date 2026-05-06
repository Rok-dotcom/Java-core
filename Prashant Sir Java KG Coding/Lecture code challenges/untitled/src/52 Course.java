class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudent;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new String[maxCapacity];

    }

    static void setmaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudent[enrollments] = studentName;
        enrollments++;
    }
    void unenrollStudent (String studentName){
        System.out.println("Student removed ");
        enrollments--;
    }
    public static void main(String[] args){
        Course yoddha = new Course("Yoddha");
        yoddha.setmaxCapacity(5);
        //System.out.println(courseName);
        System.out.println(maxCapacity);
        yoddha.enrollStudent("Ramesh");
        yoddha.enrollStudent("rohan");
        yoddha.enrollStudent("Akash");
        yoddha.enrollStudent("Harsh");
        yoddha.enrollStudent("Akshay");
    }
}