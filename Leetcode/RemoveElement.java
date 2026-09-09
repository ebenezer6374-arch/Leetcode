
import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        RemoveElement solution = new RemoveElement();

        int[] nums = {5, 6, 7, 7, 8, 8, 3};
        int val = 3;

        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println("Array = " + Arrays.toString(nums));

        System.out.println("Final elements:");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}