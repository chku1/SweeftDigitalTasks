import java.util.Arrays;

public class FirstTask {
    static int singleNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2;i++){
            if(i==0 && nums[i]!=nums[i+1])
                return nums[0];
            if(nums[i]!=nums[i+1] && nums[i+1]!=nums[i+2])
                return nums[i+1];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int [] arr1 = {4, 3, 4, 3, 4, 3, 9, 3, 4};
        int [] arr2 = {5, 8, 7, 5, 8, 8};
        int [] arr3 = {2, 2, 2, 1};
        System.out.println("The non repeating number in the first array is:    " + singleNumber(arr1));
        System.out.println("The non repeating number in the second array is:   " +singleNumber(arr2));
        System.out.println("The non repeating number in the third array is:    " +singleNumber(arr3));
    }
}
