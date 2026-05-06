class StringConcat {
    public static void main(String[] args){
        String firstName = "Vishal";
        String lastname = "Tarange ";
        String fullName = firstName.concat( " ").concat(lastname);
        System.out.println(fullName.toUpperCase());
    }
}
