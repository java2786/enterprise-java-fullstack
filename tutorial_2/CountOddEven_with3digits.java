package tutorial_2;

public class CountOddEven_with3digits {
    public static void main(String[] args) {
        int num = 126;
        int last_digit = 0;
        int evens = 0;
        int odds = 0;

        last_digit = num%10;
        num = num/10;
        if(last_digit%2==0){
            evens++;
        } else {
            odds++;
        }

        last_digit = num%10;
        num = num/10;
        if(last_digit%2==0){
            evens++;
        } else {
            odds++;
        }

        last_digit = num%10;
        num = num/10;
        if(last_digit%2==0){
            evens++;
        } else {
            odds++;
        }

        
    }
}
