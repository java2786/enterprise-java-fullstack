import java.util.Scanner;

class Book{}
class Student{}
public class ArrayDemo {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int[] scores = new int[]{87,71,83,89};
        int[] random = {5,3,7,2,8};

        String[] names = {"Ramesh", "Suresh", "Dinesh", null, null};
        random[2] = 33;

        // Student[] students = new Student[3];
        int[][] stds = new int[4][2];

        float[] arr = new float[4];

        // names = random;


        System.out.println(random);
        // Book b = new Book();
        // System.out.println(b.toString());
        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc);
        // sc.close();

        for(int num: random){
            System.out.println(num);
        }
    }
}
