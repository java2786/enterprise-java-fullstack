public class ReverseString {

    static String reverseString(String input){
        String res = "";
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            res = c + res; 
        }
        return res;
    }
    public static void main(String[] args) {
        String message = "mobile";

        String result = reverseString(message);
        System.out.println(result);
    }
}
