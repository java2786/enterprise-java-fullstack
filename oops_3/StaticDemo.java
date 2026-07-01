class Student{
    private String name;
    private String course_name;
    private static String trainer = "Arun";

    public Student(String name, String course_name){
        this.name = name;
        this.course_name = course_name;
    }
    public static void setTrainer(String trainer) {
        Student.trainer = trainer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void showDetails(){
        // System.out.println(name+" is enrolled into "+course_name+".");
        System.out.println("[Name: "+name+", CourseName: "+course_name+", Trainer: "+trainer+"]");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Ishaan", "core java");
        Student s2 = new Student("Ajay", "core java");
        Student s3 = new Student("Dependra", "core java");

        // s1.setTrainer("Ekta");
        Student.setTrainer("Ekta");
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
