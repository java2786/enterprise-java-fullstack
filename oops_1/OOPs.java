
class Employee{
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
    
    public void work(){
        System.out.println(this.name + " is working.");
    }
}

class Chef extends Employee{
    Chef(String name, int age, int salary){
        super(name, age, salary);
    }
    public void work(){
        System.out.println(super.getName() + " is cooking food.");
    }
}
class Manage extends Employee{
    Manage(String name, int age, int salary){
        super(name, age, salary);
    }
    public void work(){
        System.out.println(super.getName() + " is managing.");
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Employee e1 = new Employee("Ramesh", 42, 25000);        
        // Employee e2 = new Employee("Mukesh", 27, 29000);        
        // Employee e3 = new Employee("Dinesh", 56, 31000);        

        // System.out.println(e1.getName());
        // System.out.println(e1.getSalary());
        // // e1.salary = 12000;
        // // System.out.println(e1.salary);

        // e1.work();
        // e2.work();
        // e3.work();


        Chef c1 = new Chef("Dinesh", 56, 31000); 
        System.out.println(c1.getName());
        System.out.println(c1.getSalary());
        c1.work();
    }
}
