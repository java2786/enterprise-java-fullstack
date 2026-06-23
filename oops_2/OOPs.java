
interface EmployeeActivity {

    abstract public void work();
}


class Chef implements EmployeeActivity{
    private String name;
    private int age;
    private int salary;

    Chef(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // ...
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.getName()+" is cooking food.");
    }
}

public class OOPs {
    public static void main(String[] args) {

        Chef c1 = new Chef("Dinesh", 56, 31000); 
        System.out.println(c1.getName());
        System.out.println(c1.getSalary());
        c1.work();
    }
}
