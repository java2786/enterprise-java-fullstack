public class ArrayReverse {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};

        int start = 0;                  // 2
        int end = nums.length - 1;      // 2

        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }

    }
}
