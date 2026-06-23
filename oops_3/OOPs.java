
abstract class Employee{
    private String name;
    private int salary;
    private int age;

    Employee(){}
    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return "Mr."+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // validate
        if(age>22 && age<70)
            this.age = age;
    }
    
    abstract public void work();
}

class Chef extends Employee{
    Chef(String name, int age, int salary){
        super(name, age, salary);
    }
    public void work(){
        System.out.println(super.getName() + " is cooking food.");
    }
}
class Manager extends Employee{
    Manager(String name, int age, int salary){
        super(name, age, salary);
    }
    public void work(){
        System.out.println(super.getName() + " is managing.");
    }
}

public class OOPs {
    public static void main(String[] args) {
        Chef c1 = new Chef("Dinesh", 56, 31000); 
        System.out.println(c1.getName());
        System.out.println(c1.getSalary());
        c1.work();


        Manager m1 = new Manager("Mukesh", 56, 31000); 
        System.out.println(m1.getName());
        System.out.println(m1.getSalary());
        m1.work();
    }
}
