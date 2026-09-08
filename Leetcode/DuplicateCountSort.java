import java.util.Arrays;

 class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {

        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 2, 3};

        int k = solution.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.println("Array: " + Arrays.toString(nums));
    }
}