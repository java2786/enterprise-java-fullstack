import java.util.Arrays;

public class ArraySum{
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{4};

        int larger_size = nums1.length>nums2.length ? nums1.length : nums2.length;
        int[] nums3 = new int[larger_size+1];

        int carry = 0;
        int index_1 = nums1.length - 1;
        int index_2 = nums2.length - 1;
        int index_3 = nums3.length - 1;

        while(index_1>=0 && index_2>=0){
            int sum = nums1[index_1]+nums2[index_2]+carry;
            carry = 0;
            if(sum>9){
                carry = 1;
                sum = sum % 10;
            }
            nums3[index_3] = sum;

            index_1--;
            index_2--;
            index_3--;
        }

        while(index_1>=0){
            int sum = nums1[index_1]+carry;
            carry = 0;
            if(sum>9){
                carry = 1;
                sum = sum % 10;
            }
            nums3[index_3] = sum;

            index_1--;
            index_3--;
        } 
        while(index_2>=0){
            int sum = nums2[index_2]+carry;
            carry = 0;
            if(sum>9){
                carry = 1;
                sum = sum % 10;
            }
            nums3[index_3] = sum;

            index_2--;
            index_3--;
        } 
        
        if(carry>0){
            nums3[index_3]=carry;
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}