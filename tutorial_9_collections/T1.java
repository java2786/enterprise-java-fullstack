import java.util.ArrayList;

// Shape s = new Triangle();

public class T1 {
    public static void main(String[] args) {
        // int[] marks = new int[5];
        // marks[0] = 83;
        // marks[1] = 83;
        // marks[2] = 83;
        // marks[3] = 83;
        // marks[4] = 83;
        // marks[5] = 83;

        Object a = 88;
        Object b = new String("hello");
        Object c = false;
        Object d = new T1();

        Object[] arr = new Object[5];
        arr[0] = a;
        arr[1] = b;
        arr[2] = 4.3;


        // array of Object
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        list.add(68);
        list.add(68);
        System.out.println(list.size());
        list.add(68);
        list.add(68);
        System.out.println(list.size());
        System.out.println(list);
        list.add("fifty nine");
        System.out.println(list);

    }    
}
