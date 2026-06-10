class Employee{
    static String office_name;
}
public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(Employee.office_name);

        Employee emp = new Employee();
        System.out.println(emp.office_name);
    }
}
