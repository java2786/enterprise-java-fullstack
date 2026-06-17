public class HappyNumber {

    static boolean isHappyNumber(int n){
        int sum = 0;
        int num = n;
        boolean isHappy = false;

        while(num>0){
            int ld = num%10;
            num = num / 10;
            sum = (ld*ld)+sum;

            if(num==0){
                if(sum<10){
                    if(sum == 1){
                        // return true;
                        isHappy = true;
                    } 
                } else{
                    num = sum;
                    sum = 0;
                }
            }
        }
        return isHappy;
    }
    public static void main(String[] args) {
        int num = 24;
        boolean flag = isHappyNumber(num);
        if(flag){
            System.out.println(num+" is Happy number");
        } else {
            System.out.println(num+" is Unhappy number");
        }
        // 64 + 81 + 91 = 236
        // 4 + 9 + 36 = 49
        // 16 + 81 = 97
        // 81 + 49 = 130
        // 1 + 9 + 0 = 10
        // 1 + 0 = 1
        // stop at single digit
        // if single digit ans = 1
    }
    
}
