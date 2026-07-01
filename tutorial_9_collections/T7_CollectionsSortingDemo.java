import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
    @Override
    public int compareTo(Employee e) {
        // Employee e = (Employee)obj;
        // if(this.salary>e.salary){
        //     return 1;
        // } else if (this.salary<e.salary){
        //     return -1;
        // } else {
        //     return 0;
        // }
        // return e.salary - this.salary;
        return this.name.compareTo(e.name);

        // int comp = this.name.compareTo(e.name);

        // if(comp == 0){
        //     return this.salary - e.salary;
        // } else {
        //     return comp;
        // }
    }
    
}

class SortEmployeeBySalary implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary()-e2.getSalary();
    }
    
}

public class T7_CollectionsSortingDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // names.add("ramesh");
        // names.add("suresh");
        // names.add("dinesh");
        // names.add("mukesh");
        // names.add("mahesh");
        // names.add("dinesh");

        // Collections.sort(names);
        // System.out.println(names);

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("ramesh",55000));
        emps.add(new Employee("suresh",32000));
        emps.add(new Employee("dinesh",47000));
        emps.add(new Employee("mukesh",47000));
        emps.add(new Employee("mahesh",55000));
        emps.add(new Employee("dinesh",38000));

        Collections.sort(emps, new SortEmployeeBySalary());
        System.out.println(emps);
    }
}
