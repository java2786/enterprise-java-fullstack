public class ArrayOperations {
    public static void main(String[] args) {
        int[] nums = new int[]{63,82,91,13,52,18};
        double sum = 0;
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            // System.out.println(nums[i]);
            if(min > nums[i]){
                min = nums[i];
            }
            if(max<nums[i]){
                max = nums[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Total: "+sum);
        System.out.println("Avg: "+sum/nums.length);
    }
}
