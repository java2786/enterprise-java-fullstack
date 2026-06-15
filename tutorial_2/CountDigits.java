package tutorial_2;

public class CountDigits {
    public static void main(String[] args) {
        int num = 126;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Total digits: "+count);
    }
}
