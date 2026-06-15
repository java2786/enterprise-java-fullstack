package tutorial_2;

public class CountOddEven {
    public static void main(String[] args) {
        int num = -126;
        int evens = 0;
        int odds = 0;

        // num = Math.abs(num);
        if(num<0){
            num = num * -1;
        }

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            if (last_digit % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Evens: "+evens);
        System.out.println("Odds: "+odds);
    }
}
