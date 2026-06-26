import java.util.ArrayList;

class Student {
    private String name;
    private int roll;
    private int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // ...
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]");
    }

}

public class T2_crud {
    public static void main(String[] args) {
        // college
        // Create and store 3 students
        ArrayList students = new ArrayList();

        // Create
        students.add(new Student("Ramesh", 121, 89));
        students.add(new Student("Mahesh", 172, 78));
        students.add(new Student("Dinesh", 11, 91));
        students.add("Himesh");

        // read all
        System.out.println(students);

        // read all and find by roll 11
        Student found = null;
        for (int i = 0; i < students.size(); i++) {
            Object obj = students.get(i);
            if (obj instanceof Student) {
                Student std = (Student) obj;
                if (std.getRoll() == 12) {
                    found = std;
                }
                std.showDetails();
            } else {
                System.out.println(obj + " is not student");
            }
        }
        if (found != null) {
            found.showDetails();
        }
    }
}
