package in.kgcoding.challenge79;

public class TestEmployee {
    public static void main(String[] args){
        employee emp = new employee("Raju",21,25000);
        System.out.println(emp.getemployeedetails());
        emp.setName("Ramesh");
        System.out.println(emp.getemployeedetails());

    }
}
