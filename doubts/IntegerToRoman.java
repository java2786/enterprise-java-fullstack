public class IntegerToRoman {

    public static String toRoman(int num){
        // I IV V IX X  XL L  XC C
        // 1  4 5  9 10 40 50 90 100

        // C   CX  L  LX  X  XI V VI I
        // 100 90  50 40  10 9  5 4  1

        String[] romans = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] roman_int = new int[]{   100, 90,   50,  40,   10,  9,    5,   4,    1};

        StringBuilder result = new StringBuilder(""); 

        for(int i=0;i<romans.length;i++){
            if(num>=roman_int[i]){
                // System.out.println("Consuming: "+roman_int[i]);
                result.append(romans[i]);
                num = num - roman_int[i];
                i = i - 1;
            } 
            // else {
            //     System.out.println("Skip: "+roman_int[i]);
            // }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        int n = 99;
        // XCIX
        String roman = toRoman(n);

        System.out.println(roman);


    }
}
