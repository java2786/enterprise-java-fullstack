import java.util.LinkedList;
import java.util.List;

public class T3_Generic {
    public static void main(String[] args) {
        // college
        // Create and store 3 students
        List<Student> students = new LinkedList<>();

        // Create
        students.add(new Student("Ramesh", 121, 89));
        students.add(new Student("Mahesh", 172, 78));
        students.add(new Student("Dinesh", 11, 91));
        // students.add("Himesh");

        // read all
        System.out.println(students);

        // read all and find by roll 11
        Student found = null;
        for (int i = 0; i < students.size(); i++) {
            Student std = students.get(i);
            if (std.getRoll() == 12) {
                found = std;
            }
            std.showDetails();
        }
        if (found != null) {
            found.showDetails();
        }
    }
}
