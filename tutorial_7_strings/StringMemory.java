public class StringMemory {
    static void intMethod() {
        int a = 0;
        for (int i = 0; i < 1000000; i++) {
            a = a + i;
        }
        System.out.println(a);
    }
    static void stringMethod() {
        String a = "";
        for (int i = 0; i < 1000000; i++) {
            a = a + i;
            a = a + i;
            a = a + i;
            a = a + i;
            a = a + i;
        }
        System.out.println(a);

    }
    static void stringBuilderMethod() {
        StringBuilder a = new StringBuilder("");
        for (int i = 0; i < 1000000; i++) {
            a = a.append(i);
            a = a.append(i);
            a = a.append(i);
            a = a.append(i);
            a = a.append(i);
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        // stringMethod();
        stringBuilderMethod();
    }
}
