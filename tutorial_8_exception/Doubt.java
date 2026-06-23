public class Doubt {
    public static void main(String[] args) {
        int age = -5;
        System.out.println("Age: "+age+": "+(age > 18 && age > 0));

        age = 5;
        System.out.println("Age: "+age+": "+(age > 18 && age > 0));

        age = 19;
        System.out.println("Age: "+age+": "+(age > 18 && age > 0));
    }
}
